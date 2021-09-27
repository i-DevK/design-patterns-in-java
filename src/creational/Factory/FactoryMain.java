package creational.Factory;

import creational.Factory.entities.Notification;

public class FactoryMain {
    public static void main(String[] args) {
        Notification phone = NotificationFactory.getNotification(NotificationType.PHONE);
        phone.send();
        Notification email = NotificationFactory.getNotification(NotificationType.EMAIL);
        email.send();
        Notification push = NotificationFactory.getNotification(NotificationType.PUSH);
        push.send();
    }
}
