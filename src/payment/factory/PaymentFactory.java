package payment.factory;

import payment.credentials.ICredentials;
import payment.payments.Payment;

public interface PaymentFactory {
    Payment<? extends ICredentials> createPayment(ICredentials credentials);
}
