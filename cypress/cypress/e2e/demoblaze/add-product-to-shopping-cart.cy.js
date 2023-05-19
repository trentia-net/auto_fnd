/// <reference types="cypress" />


describe('Demo Blaze', () => {
    it('Add product to the shopping cart', () => {
        cy.visit('https://www.demoblaze.com/');
        cy.get('.card').eq(1).find('h4.card-title > a').click();
        cy.get('a.btn').click();
        cy.get('#cartur').click();
        cy.get('div.table-responsive #tbodyid').children().should('have.length',1);
    });
})