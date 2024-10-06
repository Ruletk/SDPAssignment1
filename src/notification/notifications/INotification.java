package notification.notifications;

import java.util.List;

public interface INotification {
    void sendNotification(String message, Long userId);

    void bulkSendNotification(String message, List<Long> userIds);
}
