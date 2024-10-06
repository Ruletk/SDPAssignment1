package payment.factory;

import payment.credentials.ICredentials;
import payment.credentials.card.ICardCredentials;
import payment.payments.CardPayment;
import payment.payments.Payment;

public class CardPaymentFactory implements PaymentFactory {
    @Override
    public Payment<? extends ICredentials> createPayment(ICredentials credentials) {
        if (!(credentials instanceof ICardCredentials)) {
            throw new IllegalArgumentException("Can't find payment type for that credentials.");
        }
        return new CardPayment((ICardCredentials) credentials);
    }
}
