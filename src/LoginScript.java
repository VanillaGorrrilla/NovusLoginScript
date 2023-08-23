import java.util.Scanner;

public class LoginScript {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final String[][] USERNAME_PASSWORD = {
                {"admin", "Password"},
                {"Omar", "Pompey"},
                {"Perigrine", "novus"},
                {"Trevor", "TSmith15"},
                {"Shaz", "S-Rashad"}
                // Add more username-password pairs as needed
        };

        final int MAX_ATTEMPTS = 3;

        int attempts = 0;

        while (attempts < MAX_ATTEMPTS) {
            System.out.print("Enter username: ");
            String username = scanner.nextLine().toLowerCase();

            System.out.print("Enter password: ");
            String password = scanner.nextLine();

            boolean userdatafound = false;
            for (String[] userData : USERNAME_PASSWORD) {
                if (userData[0].equalsIgnoreCase(username) && userData[1].equals(password)) {
                    System.out.println("Welcome to the application");
                    userdatafound = true;
                    break;
                }
            }

            if (!userdatafound) {
                System.out.println("ACCESS DENIED");
            } else {
                break;
            }

            attempts++;
        }

        if (attempts == MAX_ATTEMPTS) {
            System.out.println("Maximum attempts reached. Closing the application.");
        }

        scanner.close();
    }
}