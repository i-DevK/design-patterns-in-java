package creational.factorymehod;

import creational.factorymehod.entities.Notification;
import creational.factorymehod.enums.NotificationType;
import creational.factorymehod.factories.NotificationFactory;

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
