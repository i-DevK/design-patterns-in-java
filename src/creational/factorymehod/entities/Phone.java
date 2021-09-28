package creational.factorymehod.entities;

public class Phone extends Notification {
    private int mobileNumber;

    public int getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(int mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    @Override
    public void send() {
        System.out.println("Sent message on mobile phone");
    }

    @Override
    public String toString() {
        return "Phone{" +
                "mobileNumber=" + mobileNumber +
                '}';
    }
}
