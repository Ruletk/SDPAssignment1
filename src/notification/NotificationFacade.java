package notification;

import notification.notifications.INotification;

import java.util.List;

public class NotificationFacade {
    private final List<INotification> notificationList;

    public NotificationFacade(List<INotification> notificationList) {
        this.notificationList = notificationList;
    }

    public void sendNotification(String message, Long userId) {
        for (INotification notification : notificationList) {
            notification.sendNotification(message, userId);
        }
    }

    public void bulkSendNotification(String message, List<Long> userIds) {
        for (INotification notification : notificationList) {
            notification.bulkSendNotification(message, userIds);
        }
    }
}
