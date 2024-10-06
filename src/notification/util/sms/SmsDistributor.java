package notification.util.sms;

public class SmsDistributor implements ISmsDistributor {
    @Override
    public void sendSms(String message, String phoneNumber) {
        // Mock implementation
        // Let's assume that in real project we will use some SMS gateway
        // to send request to send SMS
        System.out.println("Sending SMS to " + phoneNumber + " with message: " + message);
    }
}
