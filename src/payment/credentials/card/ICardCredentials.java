package payment.credentials.card;

import payment.credentials.ICredentials;

public interface ICardCredentials extends ICredentials {
    String getCardCode();

    String getExpireDate();

    String getCvv();

    String getCardOwner();
}
