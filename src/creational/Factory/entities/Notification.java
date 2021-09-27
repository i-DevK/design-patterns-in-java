package creational.Factory.entities;

public abstract class Notification {
    private String message;

    public abstract void send();

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "Notification{" +
                ", message='" + message + '\'' +
                '}';
    }
}
