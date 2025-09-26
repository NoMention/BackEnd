import java.util.HashMap;
import  java.util.Map;
public class UserManager {
    // HARDCODE USERDATA BASE - LATER REVISE WHEN DATABASE IS READY
    private HashMap<String, User> users;

    public UserManager() {
        users = new HashMap<>();
        users.put("User1", new User("User1", "0000"));
        users.put("User2", new User("User2", "0001"));
        users.put("User3", new User("User3", "0002"));
    }

    // REGISTER METHOD
    public boolean register(String username, String password) {
        if(users.containsKey(username)) return false; // Checks if the username is taken already
        User newUser = new User(username, password);
        users.put(username, newUser);
        return true; // Registration Success
    }

    // LOGIN METHOD
    public User login(String username, String password) {
        if(users.containsKey(username)){
            User user = users.get(username);
            if(user.getPassword().equals(password)) return user; // Log in Success
        }
        return null; // Log in Failed
    }
}
