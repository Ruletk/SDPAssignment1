package payment.payments;

import payment.credentials.paypal.IPayPalCredentials;

public class PayPalPayment extends Payment<IPayPalCredentials> {
    public PayPalPayment(IPayPalCredentials credentials) {
        super(credentials);
    }

    @Override
    public void pay(double amount) {
        if (!this.credentials.validate())
            throw new IllegalArgumentException("Wrong credentials for PayPalPayment. Credentials can't be validated!");

//        Also make some stuff for payment
        System.out.println("PayPal payment is done!");
    }
}
