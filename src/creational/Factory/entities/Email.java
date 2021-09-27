package creational.Factory.entities;

public class Email extends Notification {
    private String address;
    private String subject;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public void send() {
        System.out.println("Sent notification via email");
    }
}
