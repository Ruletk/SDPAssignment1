package payment.credentials.paypal;

public class PayPalCredentialsImpl implements IPayPalCredentials {
    private final String paymentID;
    private final String paymentToken;

    public PayPalCredentialsImpl(String paymentID, String paymentToken) {
        this.paymentID = paymentID;
        this.paymentToken = paymentToken;
    }

    @Override
    public String getPaymentID() {
        return paymentID;
    }

    @Override
    public String getPaymentToken() {
        return paymentToken;
    }

    @Override
    public boolean validate() {
        return getPaymentID() != null && getPaymentToken() != null;
    }
}
