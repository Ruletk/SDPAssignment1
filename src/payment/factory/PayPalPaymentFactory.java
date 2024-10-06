package payment.factory;

import payment.credentials.ICredentials;
import payment.credentials.paypal.IPayPalCredentials;
import payment.payments.PayPalPayment;
import payment.payments.Payment;

public class PayPalPaymentFactory implements PaymentFactory {
    @Override
    public Payment<? extends ICredentials> createPayment(ICredentials credentials) {
        if (!(credentials instanceof IPayPalCredentials)) {
            throw new IllegalArgumentException("Can't find payment type for that credentials.");
        }
        return new PayPalPayment((IPayPalCredentials) credentials);
    }
}
