package notification.util.mobile;

public class MobileAppGateway implements IMobileAppGateway {
    @Override
    public void sendNotification(String message, String device) {
        // Mock implementation
        System.out.println("Notification sent to " + device + " with message: " + message);
    }
}
