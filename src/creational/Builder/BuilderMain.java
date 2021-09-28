package creational.Builder;

public class BuilderMain {
    public static void main(String[] args) {
        User user = new UserBuilder("Dev", "K")
                .age(26)
                .phone("123456")
                .address("India")
                .build();
        System.out.println(user.toString());
    }
}