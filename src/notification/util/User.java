package notification.util;

import java.util.List;
import java.util.Random;

public class User {
    public Long id;
    public String name;
    public String email;
    public String phoneNumber;
    public List<String> devices;

    public User() {
        id = new Random().nextLong();
        name = "John Doe";
        email = "jdoe@gmail.com";
        phoneNumber = "+1234567890";
        devices = List.of("iPhone", "Samsung Galaxy");
    }

    public static User getUserById(Long userId) {
        return new User(); // Test implementation
    }
}
