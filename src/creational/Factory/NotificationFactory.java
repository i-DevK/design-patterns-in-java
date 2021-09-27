package creational.Factory;

import creational.Factory.entities.Email;
import creational.Factory.entities.Notification;
import creational.Factory.entities.Phone;
import creational.Factory.entities.Push;

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
