import notification.NotificationFacade;
import notification.notifications.EmailNotification;
import notification.notifications.INotification;
import notification.notifications.PushNotification;
import notification.notifications.SMSNotification;
import payment.credentials.ICredentials;
import payment.credentials.card.CardCredentialsImpl;
import payment.credentials.paypal.PayPalCredentialsImpl;
import payment.factory.PaymentFactory;
import payment.factory.PaymentFactoryProducer;
import payment.payments.Payment;

import java.util.List;

public class Main {
    public static void main(String[] args) {
//        payment();
        notification();
    }

    public static void payment() {
        ICredentials cardCredentials = new CardCredentialsImpl("1234567890123456", "12/23", "123", "John Doe");
        ICredentials payPalCredentials = new PayPalCredentialsImpl("24214242", "gfgfdgdfgdf");

        PaymentFactory cardPaymentFactory = PaymentFactoryProducer.getFactory("CARD");
        PaymentFactory payPalPaymentFactory = PaymentFactoryProducer.getFactory("PAYPAL");

        Payment<? extends ICredentials> cardPayment = cardPaymentFactory.createPayment(cardCredentials);
        Payment<? extends ICredentials> payPalPayment = payPalPaymentFactory.createPayment(payPalCredentials);

        cardPayment.pay(100);
        payPalPayment.pay(100);
    }

    public static void notification() {
        INotification emailNotification = new EmailNotification();
        INotification smsNotification = new SMSNotification();
        INotification pushNotification = new PushNotification();

        NotificationFacade notificationFacade = new NotificationFacade(
                List.of(emailNotification, smsNotification, pushNotification)
        );

        notificationFacade.sendNotification("Hello, World!", 1L);
        notificationFacade.bulkSendNotification("Hello, World!", List.of(1L, 2L, 3L));
    }
}