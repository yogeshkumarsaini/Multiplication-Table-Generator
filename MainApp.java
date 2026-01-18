import java.util.InputMismatchException;
import java.util.Scanner;

public class MainApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TableService service = new TableService();
        boolean running = true;

        System.out.println("📘 Multiplication Table Generator");

        while (running) {
            System.out.println("\n===== MENU =====");
            System.out.println("1. Generate Table");
            System.out.println("2. View History");
            System.out.println("3. Exit");
            System.out.print("Choose option: ");

            try {
                int choice = scanner.nextInt();

                switch (choice) {
                    case 1:
                        System.out.print("Enter number: ");
                        int number = scanner.nextInt();

                        System.out.print("Enter range (e.g., 10, 20): ");
                        int range = scanner.nextInt();

                        if (range <= 0) {
                            System.out.println("❌ Range must be positive.");
                            break;
                        }

                        service.generateTable(number, range);
                        break;

                    case 2:
                        service.showHistory();
                        break;

                    case 3:
                        running = false;
                        System.out.println("\n✅ Program Ended. Goodbye!");
                        break;

                    default:
                        System.out.println("❌ Invalid menu option.");
                }

            } catch (InputMismatchException e) {
                System.out.println("❌ Please enter valid numeric input.");
                scanner.nextLine(); // clear buffer
            }
        }

        scanner.close();
    }
}
