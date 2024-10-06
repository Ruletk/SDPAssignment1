package payment.payments;

import payment.credentials.card.ICardCredentials;

public class CardPayment extends Payment<ICardCredentials> {

    public CardPayment(ICardCredentials credentials) {
        super(credentials);
    }

    @Override
    public void pay(double amount) {
        if (!this.credentials.validate())
            throw new IllegalArgumentException("Wrong credentials for CardPayment. Credentials can't be validated!");

//        Make some stuff for payment.
        System.out.println("Card payment is done!");
    }

}
