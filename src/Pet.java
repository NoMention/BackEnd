public class Pet {
    private String name; // If we want our pet to have a name
    private double fun;
    private double hunger;
    private double cleanliness;
    private double sleep;

    // CONSTRUCTOR - STARTS AT FULL STATS
    public Pet() {
        this.fun = 1.0;
        this.hunger = 1.0;
        this.cleanliness = 1.0;
        this.sleep = 1.0;
    }

    public double getFun() {return this.fun;}
    public double getHunger() {return this.hunger;}
    public double getCleanliness() {return this.cleanliness;}
    public double getSleep() {return this.sleep;}

    private double control(double value){
        if(value < 0.0) return 0.0; //forces val to 0
        if(value > 1.0) return 1.0; // forces val to 1
        return value;
    }

    public void setFun(double fun) {this.fun = control(fun);}
    public void setHunger(double hunger) {this.hunger = control(hunger); }
    public void setCleanliness(double cleanliness) {this.cleanliness = control(cleanliness); }
    public void setSleep(double sleep) {this.sleep = control(sleep); }

    // SAMPLE ACTIONS
    public void play(){
        setFun(fun + 0.2);
        setHunger(hunger - 0.1);
        setCleanliness(cleanliness - 0.05);
        setSleep(sleep - 0.3);
    }

    public void feed(){
        setHunger(hunger + 0.3);
        setCleanliness(cleanliness - 0.02);
        setFun(fun + 0.1);
    }

    public void bath(){
        setFun(fun - 0.2);
        setCleanliness(cleanliness + 0.05);
        setSleep(sleep + 0.05);
    }

    public void sleep(){
        setSleep(sleep + 0.5);
        setCleanliness(cleanliness - 0.03);
        setHunger(hunger - 0.1);
    }

    public void displayStats() {
        System.out.println("\n--- Pet Stats ---");
        System.out.println("Fun: " + String.format("%.0f%%", fun * 100));
        System.out.println("Hunger: " + String.format("%.0f%%", hunger * 100));
        System.out.println("Cleanliness: " + String.format("%.0f%%", cleanliness * 100));
        System.out.println("Sleep: " + String.format("%.0f%%", sleep * 100));
    }
}
