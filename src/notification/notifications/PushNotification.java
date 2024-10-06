package notification.notifications;

import notification.util.User;
import notification.util.mobile.IMobileAppGateway;
import notification.util.mobile.MobileAppGateway;

import java.util.List;

public class PushNotification implements INotification {
    private final IMobileAppGateway mobileAppGateway;

    public PushNotification() {
        // Let's assume we have a real implementation of MobileAppGateway
        // And DI like Spring Boot
        this.mobileAppGateway = new MobileAppGateway();
    }

    @Override
    public void sendNotification(String message, Long userId) {
        // Get user device
        // Let's assume we have a real implementation of User
        // And DI like Spring Boot
        User user = User.getUserById(userId);

        // Send push notification to user device
        for (String device : user.devices) {
            mobileAppGateway.sendNotification(message, device);
        }
    }

    @Override
    public void bulkSendNotification(String message, List<Long> userIds) {
//        List<User> users = User.getUsersByIds(userIds);
//        Let's assume that we have database bulk query to get users by ids ^

        for (Long userId : userIds) {
            sendNotification(message, userId);
        }
    }
}
