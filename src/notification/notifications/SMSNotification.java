package notification.notifications;

import notification.util.User;
import notification.util.sms.ISmsDistributor;
import notification.util.sms.SmsDistributor;

import java.util.List;

public class SMSNotification implements INotification {
    private final ISmsDistributor smsSender;

    public SMSNotification() {
        // Let's assume we have a real implementation of ISmsDistributor
        // And DI like Spring Boot
        this.smsSender = new SmsDistributor();
    }

    @Override
    public void sendNotification(String message, Long userId) {
        User user = User.getUserById(userId);
        String phoneNumber = user.phoneNumber;

        // Send SMS to phone number
        smsSender.sendSms(message, phoneNumber);
    }

    @Override
    public void bulkSendNotification(String message, List<Long> userIds) {
        for (Long userId : userIds) {
            sendNotification(message, userId);
        }
    }
}
