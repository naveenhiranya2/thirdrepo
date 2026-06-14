
if (choice == 1) {

    scanner.nextLine(); // consume the leftover newline

    System.out.print("Enter your hero's name: ");
    String name = scanner.nextLine();

    Player player = new Player(name);

    System.out.println("\nWelcome, " + player.name + "!");
    player.showStats();
}
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (true) {

            System.out.println("=========================");
            System.out.println("     DUNGEON QUEST");
            System.out.println("=========================");
            System.out.println("1. Start Game");
            System.out.println("2. Exit");
            System.out.print("Choose: ");

            int choice = scanner.nextInt();

            if (choice == 1) {
                System.out.println("\nGame will start soon...\n");
            } else if (choice == 2) {
                System.out.println("Goodbye!");
                break;
            } else {
                System.out.println("Invalid choice!\n");
            }
        }

        scanner.close();
    }
}
