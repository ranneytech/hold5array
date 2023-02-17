import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Create an array to hold 5 user credentials
        String[][] userCredentials = {
            {"Rans", "21", "Sa puso mo", "rans@gmail.com", "Ginaganun lang para alam mo"},
            {"Jopay", "25", "Sa lugar na wala ka", "jopay25@gmail.com", "study first sa umaga, i miss u sa gabi"},
            {"arveee", "27", "Sa lugar na na dimakita", "arveemapanakit@gmail.com", "nanakit ng puso para alam mo"},
            {"Nath", "22", "No permanent Address", "Natulog@gmail.com", "Kelan moko eh crush back"},
            {"shella", "100", "No permanent address", "shell100@gmail.com", "Nangaganun para alam mo"}
        };

        // Use a Scanner to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter an index number to search for
        System.out.print("Enter an index number to search for (1-5): ");
        int indexToFind = scanner.nextInt();

        // Check if the index is within the valid range (1-5)
        if (indexToFind < 1 || indexToFind > 5) {
            System.out.println("Invalid index number.");
        } else {
            // Retrieve the user credentials at the specified index
            String[] userCredentialsAtIdx = userCredentials[indexToFind - 1];

            // Print out the user's name, address, age, and email
            System.out.println("FullName: " + userCredentialsAtIdx[0]);
            System.out.println("Age: " + userCredentialsAtIdx[1]);
            System.out.println("Address: " + userCredentialsAtIdx[2]);
            System.out.println("Email: " + userCredentialsAtIdx[3]);
            System.out.println("Work: " + userCredentialsAtIdx[4]);
        }
    }
}
