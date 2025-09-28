
public class User {
    // ACCOUNT
    private String username;
    private String password;
    private int level;
    private Pet pet;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
        this.level = 1;
        this.pet = new Pet();

    }

    public String getUsername() {return username;}
    public String getPassword() {return password;} // Revise when database is ready
    public int getLevel() {return level;}
    public Pet getPet(){return pet;}
    // Check if the User's Password is Correct
    public boolean checkPassword(String password) {return this.password.equals(password);}

    public void LevelUp(){
        this.level++;
    }
}
