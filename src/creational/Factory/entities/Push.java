package creational.Factory.entities;

public class Push extends Notification {
    private String device;

    @Override
    public void send() {
        System.out.println("Push notification sent");
    }

    public String getDevice() {
        return device;
    }

    public void setDevice(String device) {
        this.device = device;
    }

    @Override
    public String toString() {
        return "Push{" +
                "device='" + device + '\'' +
                '}';
    }
}
