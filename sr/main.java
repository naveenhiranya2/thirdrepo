
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
public class Player {

    String name;
    int hp;
    int attack;
    int defense;
    int gold;
    int level;

    public Player(String name) {
        this.name = name;
        this.hp = 100;
        this.attack = 15;
        this.defense = 5;
        this.gold = 0;
        this.level = 1;
    }

    public void showStats() {
        System.out.println("\n===== PLAYER STATS =====");
        System.out.println("Name    : " + name);
        System.out.println("HP      : " + hp);
        System.out.println("Attack  : " + attack);
        System.out.println("Defense : " + defense);
        System.out.println("Gold    : " + gold);
        System.out.println("Level   : " + level);
        System.out.println("========================");
    }
}
