
if (choice == 1) {

    scanner.nextLine(); // consume the leftover newline

    System.out.print("Enter your hero's name: ");
    String name = scanner.nextLine();

    Player player = new Player(name);

    System.out.println("\nWelcome, " + player.name + "!");
    player.showStats();
}
