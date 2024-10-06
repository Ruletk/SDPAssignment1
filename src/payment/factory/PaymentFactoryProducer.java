package payment.factory;

public class PaymentFactoryProducer {
    public static PaymentFactory getFactory(String factoryType) {
        if (factoryType.equalsIgnoreCase("PAYPAL")) {
            return new PayPalPaymentFactory();
        } else if (factoryType.equalsIgnoreCase("CARD")) {
            return new CardPaymentFactory();
        }
        throw new IllegalArgumentException("Can't find payment factory for that type.");
    }
}
