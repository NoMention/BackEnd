import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        UserManager manager = new UserManager();
        boolean running = true;

        while (running) {
            System.out.println("\nMenu: " +
                    "\n1. Register" +
                    "\n2. Log-in" +
                    "\n3. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1: // REGISTER
                    System.out.print("Username: ");
                    String regName = sc.next();
                    System.out.print("Password: ");
                    String regPass = sc.next();

                    boolean registered = manager.register(regName, regPass);
                    String Display = (registered) ? "Registration successful :)" : "Registration unsuccessful :(";
                    System.out.println(Display);
                case 2: // LOG-IN
                    System.out.print("Username: ");
                    String userName = sc.next();
                    System.out.print("Password: ");
                    String pass = sc.next();

                    User user = manager.login(userName, pass);
                    if (user != null) {
                        System.out.println("LogIn successful :)" + user.getUsername());
                        System.out.println("\nName: " + user.getUsername() +
                                "\nLevel: " + user.getLevel());
                        System.out.println("\nDuck Stats:" +
                                "\nSleep = " + user.getSleep() +
                                "\nCleanliness = " + user.getCleanliness() +
                                "\nHunger = " + user.getHunger() +
                                "\nFun =" + user.getFun()
                        );
                    }
                case 3:
                    System.out.println("Existing...");
                    running = false;
                    break;
                default:
                    System.out.println("Wrong choice, Enter 1-3 Digit");
            }
        }
    }
}
