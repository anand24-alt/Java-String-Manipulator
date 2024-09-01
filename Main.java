import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("Menu:");
            System.out.println("1. Reverse String");
            System.out.println("2. Convert to Uppercase");
            System.out.println("3. Find String Length");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter a string: ");
                    String input = scanner.nextLine();
                    String reversed = new StringBuilder(input).reverse().toString();
                    System.out.println("Reversed String: " + reversed);
                    break;
                case 2:
                    System.out.print("Enter a string: ");
                    input = scanner.nextLine();
                    System.out.println("Uppercase String: " + input.toUpperCase());
                    break;
                case 3:
                    System.out.print("Enter a string: ");
                    input = scanner.nextLine();
                    System.out.println("String Length: " + input.length());
                    break;
                case 4:
                    System.out.println("Exiting the program. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please choose a valid option.");
            }
        } while (choice != 4);

        scanner.close();
    }
}
