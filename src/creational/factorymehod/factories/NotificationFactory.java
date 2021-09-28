package creational.factorymehod.factories;

import creational.factorymehod.entities.Email;
import creational.factorymehod.entities.Notification;
import creational.factorymehod.entities.Phone;
import creational.factorymehod.entities.Push;
import creational.factorymehod.enums.NotificationType;

public class NotificationFactory {

    public static Notification getNotification(NotificationType type) {
        switch (type) {
            case PHONE:
                return new Phone();
            case PUSH:
                return new Push();
            case EMAIL:
                return new Email();
            default:
                return new Notification() {
                    @Override
                    public void send() {
                        System.out.println("Notification type not supported");
                    }
                };
        }
    }
}
