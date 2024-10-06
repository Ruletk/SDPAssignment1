package notification.notifications;

import notification.util.User;
import notification.util.email.EmailSender;
import notification.util.email.IEmailSender;

import java.util.List;

public class EmailNotification implements INotification {
    private final IEmailSender emailSender;

    public EmailNotification() {
        // Let's assume we have a real implementation of IEmailSender
        // And DI like Spring Boot
        this.emailSender = new EmailSender();
    }

    @Override
    public void sendNotification(String message, Long userId) {
        User user = User.getUserById(userId);
        String email = user.email;

        // Send email to email address
        emailSender.sendEmail(message, email);
    }

    @Override
    public void bulkSendNotification(String message, List<Long> userIds) {
        for (Long userId : userIds) {
            sendNotification(message, userId);
        }
    }
}
