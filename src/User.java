public class User {
    // ACCOUNT
    private String username;
    private String password;

    // STATS
    private double fun;
    private double hunger;
    private double cleanliness;
    private double sleep;
    private int level;

    // CONSTRUCTOR
    public User(String username, String password) {
        this.username = username;
        this. password = password;
        fun = 1.0; // Note: starts at full starts
        hunger = 1.0;
        cleanliness = 1.0;
        sleep = 1.0;
        level = 1; // Note: Starts at Level 1
    }
    // GETTERS
    // ACCOUNT
    public String getUsername(){return username;}
    public String getPassword(){return password;}
    // STATS - READ & TRACK STATS
    public double getFun(){return fun;}
    public double getHunger(){return hunger;}
    public double getCleanliness(){return cleanliness;}
    public double getSleep(){return sleep;}
    public int getLevel(){return level;}

    // SETTERS - Keeps the stats in the range of 0 - 100
    public void setFun(double fun){
        this.fun = Math.max(0.0, Math.min(1.0, fun));
    }

    public void setHunger(double hunger){
        this.hunger = Math.max(0.0, Math.min(1.0, hunger));
    }

    public void setCleanliness(double cleanliness){
        this.cleanliness = Math.max(0.0, Math.min(1.0, cleanliness));
    }

    public void setSleep(double sleep){
        this.sleep = Math.max(0.0, Math.min(1.0, sleep));
    }
}
