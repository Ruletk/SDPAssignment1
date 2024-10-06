package payment.credentials.card;

public class CardCredentialsImpl implements ICardCredentials {
    private final String cardCode;
    private final String expireDate;
    private final String cvv;
    private final String cardOwner;

    public CardCredentialsImpl(String cardCode, String expireDate, String cvv, String cardOwner) {
        this.cardCode = cardCode;
        this.expireDate = expireDate;
        this.cvv = cvv;
        this.cardOwner = cardOwner;
    }

    @Override
    public String getCardCode() {
        return cardCode;
    }

    @Override
    public String getExpireDate() {
        return expireDate;
    }

    @Override
    public String getCvv() {
        return cvv;
    }

    @Override
    public String getCardOwner() {
        return cardOwner;
    }

    @Override
    public boolean validate() {
        return getCardCode().length() == 16 &&
                getExpireDate().length() == 5 &&
                getCvv().length() == 3 &&
                getCardOwner() != null;
    }
}
