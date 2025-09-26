import java.util.ArrayList;

public class UserDatabase {
    private ArrayList<User> users;

    public UserDatabase() {
        users = new ArrayList<>();
        // Add some hardcoded users
        users.add(new User("player1", "1234"));
        users.add(new User("gamer", "abcd"));
    }

    // Method to check login
    public boolean validateLogin(String username, String password) {
        for (User u : users) {
            if (u.getUsername().equals(username) && u.getPassword().equals(password)) {
                return true; // login successful
            }
        }
        return false; // login failed
    }
}

