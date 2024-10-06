package notification.util.email;

public class EmailSender implements IEmailSender {
    @Override
    public void sendEmail(String message, String email) {
        // Mock implementation
        System.out.println("Email sent to " + email + " with message: " + message);
    }
}
