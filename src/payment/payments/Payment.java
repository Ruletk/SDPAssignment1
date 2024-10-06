package payment.payments;

import payment.IPayable;
import payment.credentials.ICredentials;

public abstract class Payment<T extends ICredentials> implements IPayable {
    protected final T credentials;

    public Payment(T credentials) {
        this.credentials = credentials;
    }

    public abstract void pay(double amount);

    public void preparePayment() {
        System.out.println("Preparing payment...");
    }
//    ....
}
