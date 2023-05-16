package utils;

import static org.openqa.selenium.remote.Browser.CHROME;
import static org.openqa.selenium.remote.Browser.FIREFOX;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.URI;

public class WrapWebDriver {

    private static WrapWebDriver instance;
    private WebDriver driver;


    private WrapWebDriver(String browser, Boolean remote){
        try {
            switch (browser) {
                case "chrome":
                    if (remote) {
                        final DesiredCapabilities caps = new DesiredCapabilities();
                        caps.setBrowserName(CHROME.browserName());
                        driver = new RemoteWebDriver(new URI("http://localhost:4444/wd/hub").toURL(), caps);
                    } else {
                        driver = new ChromeDriver();
                    }
                    break;
                case "firefox":
                    if (remote) {
                        final DesiredCapabilities caps = new DesiredCapabilities();
                        caps.setBrowserName(FIREFOX.browserName());
                        driver = new RemoteWebDriver(new URI("http://localhost:4444/wd/hub").toURL(), caps);
                    } else {
                        driver = new FirefoxDriver();
                    }
                    break;
                default:
                    break;
            }

        } catch (Exception e) {
            throw new RuntimeException("Exception occurred in creating singleton driver instance");
        }
    }

    public static WebDriver getInstance(String browser, Boolean remote) {
        if (instance == null){
            instance = new WrapWebDriver(browser, remote);
        }
        return instance.driver;
    }

}