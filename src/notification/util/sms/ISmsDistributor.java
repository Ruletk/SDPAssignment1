package notification.util.sms;

public interface ISmsDistributor {
    void sendSms(String message, String phoneNumber);
}
