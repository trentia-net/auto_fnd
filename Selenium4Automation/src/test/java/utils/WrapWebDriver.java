package utils;

import static org.openqa.selenium.remote.Browser.CHROME;
import static org.openqa.selenium.remote.Browser.FIREFOX;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Properties;

public class WrapWebDriver {

    private static WrapWebDriver instance;

    private String browser;
    private boolean remote;
    private WebDriver driver;

    private void loadProperties(){
        ClassLoader loader = Thread.currentThread().getContextClassLoader();
        try (InputStream input = loader.getResourceAsStream("properties/config.properties")) {

            Properties prop = new Properties();

            prop.load(input);

            browser = prop.getProperty("selenium.browser");
            remote = Boolean.getBoolean(prop.getProperty("selenium.remote"));

        } catch (IOException io) {
            io.printStackTrace();
        }
    }

    private WrapWebDriver(){
        try {
            loadProperties();
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
            driver.manage().window().maximize();
        } catch (Exception e) {
            throw new RuntimeException("Exception occurred in creating singleton driver instance");
        }
    }

    public static WebDriver getInstance() {
        if (instance == null){
            instance = new WrapWebDriver();
        }
        return instance.driver;
    }

}