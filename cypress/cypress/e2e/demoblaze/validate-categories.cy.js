/// <reference types="cypress" />

describe('Validate all categories', () => {

    beforeEach(() => {
        cy.viewport("macbook-16");
        cy.visit('https://www.demoblaze.com/');
    });

    it('Validate phones category - numbers of phones', () => {
        cy.get("div.list-group").children().contains('Phones').click();
        cy.get("div.card").should('have.length',7);
    });

    it('Validate laptots category - numbers of laptops', () => {
        cy.get("div.list-group").children().contains('Laptops').click();
        cy.get("div.card").should('have.length',6);
    });

    it('Validate monitors category - numbers of monitors', () => {
        cy.get("div.list-group").children().contains('Monitors').click();
        cy.get("div.card").should('have.length',2);
    });

    it('Validate all cards have image, title, price and description ', () => {

        cy.get("div.card").each(($card) => {
            expect($card.find('img').attr('src')).to.not.have.be.empty;
            expect($card.find('h4')).to.not.have.be.empty;
            expect($card.find('h5')).to.not.have.be.empty;
            let price = $card.find('h5').text();
            expect(price).to.match(/\$[0-9]+/);
            expect($card.find('.card-text')).to.not.have.be.empty;
        });
    });

    it('Validate one card have image, title, price and description ', () => {

        cy.intercept('GET','**/entries',{body: {"Items": [{"cat": "phone","desc": "The Samsung Galaxy S6 is powered by 1.5GHz octa-core Samsung Exynos 7420\n processor and it comes with 3GB of RAM. The phone packs 32GB of \ninternal storage cannot be expanded. ","id": 1,"img": "imgs/galaxy_s6.jpg","price": 360,"title": "Samsung galaxy s6"}],"LastEvaluatedKey": {"id": "1"}}
        }).as('getEntries');

        cy.wait('@getEntries');

        cy.get("div.card").each(($card) => {
            expect($card.find('img').attr('src')).to.not.have.be.empty;
            expect($card.find('h4')).to.not.have.be.empty;
            expect($card.find('h5')).to.not.have.be.empty;
            let price = $card.find('h5').text();
            expect(price).to.match(/\$[0-9]+/);
            expect($card.find('.card-text')).to.not.have.be.empty;
        });
    });


});