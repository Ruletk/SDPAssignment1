package payment.credentials.paypal;

import payment.credentials.ICredentials;

public interface IPayPalCredentials extends ICredentials {
    String getPaymentID();

    String getPaymentToken();
}
