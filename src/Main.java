import payment.credentials.ICredentials;
import payment.credentials.card.CardCredentialsImpl;
import payment.credentials.paypal.PayPalCredentialsImpl;
import payment.factory.PaymentFactory;
import payment.factory.PaymentFactoryProducer;
import payment.payments.Payment;

public class Main {
    public static void main(String[] args) {
        ICredentials cardCredentials = new CardCredentialsImpl("1234567890123456", "12/23", "123", "John Doe");
        ICredentials payPalCredentials = new PayPalCredentialsImpl("24214242", "gfgfdgdfgdf");

        PaymentFactory cardPaymentFactory = PaymentFactoryProducer.getFactory("CARD");
        PaymentFactory payPalPaymentFactory = PaymentFactoryProducer.getFactory("PAYPAL");

        Payment<? extends ICredentials> cardPayment = cardPaymentFactory.createPayment(cardCredentials);
        Payment<? extends ICredentials> payPalPayment = payPalPaymentFactory.createPayment(payPalCredentials);

        cardPayment.pay(100);
        payPalPayment.pay(100);
    }
}