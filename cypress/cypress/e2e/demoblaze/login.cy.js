/// <reference types="cypress" />

describe('Do login in Demo Blaze', () => {

    it('Login success',() => {
       cy.login('test@caixa-test.com','12345678');
       cy.get('#nameofuser').should('have.text','Welcome test@caixa-test.com');
    });

    it('Login failed - wrong username',() => {
        cy.login('test2@caixa-test.com','12345678');
        cy.on('window:alert', (message) => {
            expect(message).to.contains('User does not exist.');
        });
     });

    it('Login failed - wrong password',() => {
        cy.login('test@caixa-test.com','1234567');
        cy.on('window:alert', (message) => {
            expect(message).to.contains('Wrong password');
        });
     });

     
});