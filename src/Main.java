
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
            System.out.print("Choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1: // REGISTER
                    System.out.print("Username: ");
                    String regName = sc.next();
                    System.out.print("Password: ");
                    String regPass = sc.next();

                    boolean registered = manager.register(regName, regPass);
                    System.out.println(registered ? "Registration successful :) " : "Registration unsuccessful :(");

                case 2: // LOG-IN
                    System.out.print("Username: ");
                    String userName = sc.next();
                    System.out.print("Password: ");
                    String pass = sc.next();

                    User user = manager.login(userName, pass);
                    if (user != null) {
                        System.out.println("LogIn successful :) " + user.getUsername() + "!!!");
                        System.out.println("\nName: " + user.getUsername() +
                                           "\nLevel: " + user.getLevel());
                        runGameMenu(sc, user);
                    } else System.out.println("Invalid username or password :(, Try Again");
                    break;
                case 3:
                    System.out.println("Existing...");
                    running = false;
                    break;
                default:
                    System.out.println("Wrong choice, Enter 1-3.");
            }
            sc.close();
        }
    }
    // GAME STATE MENU
    private static void runGameMenu(Scanner sc, User user){
        boolean playing = true;
        Pet pet = user.getPet();

        while(playing){
            System.out.println("\nGAME MENU" +
                                "\n1. View Duck Stats" +
                                "\n2. Feed Duck" +
                                "\n3. Play w/ Duck" +
                                "\n4. Clean Duck" +
                                "\n5. Put Duck to sleep" +
                                "\n6. Log-out" );
            System.out.println("Choice: ");
            int action = sc.nextInt();

            switch(action){
                case 1: // Display Stats
                    pet.displayStats();
                    break;
                case 2:
                    System.out.println("Duck eating...");
                    pet.feed();
                    pet.displayStats();
                    break;
                case 3:
                    System.out.println("Duck playing...");
                    pet.play();
                    pet.displayStats();
                    break;
                case 4:
                    System.out.println("Cleaning Duck...");
                    pet.bath();
                    pet.displayStats();
                    break;
                case 5:
                    System.out.println("Duck sleeping...");
                    pet.sleep();
                    pet.displayStats();
                    break;
                case 6:
                    System.out.println("Logging out...");
                    playing = false;
                    break;
                default:
                    System.out.println("Wrong choice, Enter 1-6.");
            }
        }
    }


}
