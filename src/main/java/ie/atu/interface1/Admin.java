package ie.atu.interface1;
import java.util.Scanner;

public class Admin implements UserAuthenticator{
    private final String username = "john";
    private final String password = "doe";

    public boolean authenticate(String username, String password){
        return username.equals(this.username) && password.equals(this.password);
    }
    public static void authenticate() {
        Admin admin = new Admin();

        Scanner scanner = new Scanner(System.in);
        System.out.print("\nEnter Publican username: ");
        String enteredUsername = scanner.nextLine();

        System.out.print("Enter Publican password: ");
        String enteredPassword = scanner.nextLine();

        if (admin.authenticate(enteredUsername, enteredPassword)) {
            System.out.println("\nPublican authentication successful!\n\nWhat  would you wish to update/add:");
            System.out.println("\n1. Add pub\t 2. Delete Pub/Drink\nCommand: ");

            int command = scanner.nextInt();

            scanner.nextLine();

            switch(command){
                case 1:
                    pubSelect.addPub();

                    break;

                case 2:
                    System.out.println("What pub or drink do you want to erase: ");
                    String delete = scanner.nextLine();

                    System.out.println("\nYou have removed " + delete + " from the list");

                    break;

                default:
                    System.out.println("\nInvalid command.");
            }
        } else {
            System.out.println("Publican authentication failed. Invalid username or password.");
        }
    }
}

