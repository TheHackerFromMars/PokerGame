import java.util.Scanner;

public class MyPokerito {
    public static void main(String[] args) {

        // Task 2: Explain the rules to user

        Scanner scan = new Scanner(System.in);
        System.out.println("Hello! Welcome to POKERITO\nPress ENTER when you're ready.");
        scan.nextLine();
        System.out.println("It's like Poker, but a lot simpler\n");
        System.out.println(" _There are two players, you and the computer.");
        System.out.println(" _The dealer will give each player one card.");
        System.out.println(" _Then, the dealer will draw five cards (the river)");
        System.out.println(" _The player with the most river matches wins! ");
        System.out.println(" _If the matches are equal, everyone's a winner!\n");
        System.out.println(" _Ready? Press ENTER if you are.");

        scan.nextLine();
        String yourCard = randomCard();
        String computerCard = randomCard();

        /*
         * Task 3: Present the user with a card
         * and also show computer's card
         */
        System.out.println("Here's your card: ");
        System.out.println(yourCard);
        System.out.println("\nHere's the computer's card: ");
        System.out.println(computerCard);

        int yourMatches = 0;
        int computerMatches = 0;

        /** Task 4 - Draw five cards */

        System.out.println("Now, the dealer will draw five cards. Keep pressing ENTER for dealer to continue.");
        for (int i = 1; i <= 5; i++) {
            scan.nextLine();
            String draw = randomCard();

            if (yourCard.equals(draw)) {
                yourMatches++;
            }
            if (computerCard.equals(draw)) {
                computerMatches++;
            }

            System.out.println("Card " + i);
            System.out.println(draw);

        }

        // Task 5 - Get the winner
        scan.nextLine();
        System.out.println("Your number of matches: " + yourMatches);
        System.out.println("Computer number of matches: " + computerMatches);

        if (yourMatches > computerMatches) {
            System.out.println("\nYou win!\n");
        } else if (computerMatches > yourMatches) {
            System.out.println("\nComputer wins!\n");
        } else {
            System.out.println("\nShake Hands!\nIt's a Tie\n");
        }

        scan.close();
    }

    /**
     * Task 1
     * 
     * Function name – randomCard
     * 
     * @return (String)
     * 
     *         Inside the function:
     *         1. Gets a random number between 1 and 13.
     *         2. Returns a card that matches the random number.
     */
    public static String randomCard() {
        double randomNumber = Math.random() * 13;
        randomNumber += 1;
        switch ((int) randomNumber) {
            case 1:
                return "   _____\n" +
                        "  |A _  |\n" +
                        "  | ( ) |\n" +
                        "  |(_'_)|\n" +
                        "  |  |  |\n" +
                        "  |____A|\n";
            case 2:
                return "   _____\n" +
                        "  |2    |\n" +
                        "  |  o  |\n" +
                        "  |     |\n" +
                        "  |  o  |\n" +
                        "  |____2|\n";

            case 3:
                return "   _____\n" +
                        "  |3    |\n" +
                        "  | o o |\n" +
                        "  |     |\n" +
                        "  |  o  |\n" +
                        "  |____3|\n";

            case 4:
                return "   _____\n" +
                        "  |4    |\n" +
                        "  | o o |\n" +
                        "  |     |\n" +
                        "  | o o |\n" +
                        "  |____4|\n";

            case 5:
                return "   _____ \n" +
                        "  |5    |\n" +
                        "  | o o |\n" +
                        "  |  o  |\n" +
                        "  | o o |\n" +
                        "  |____5|\n";

            case 6:
                return "   _____ \n" +
                        "  |6    |\n" +
                        "  | o o |\n" +
                        "  | o o |\n" +
                        "  | o o |\n" +
                        "  |____6|\n";

            case 7:
                return "   _____ \n" +
                        "  |7    |\n" +
                        "  | o o |\n" +
                        "  |o o o|\n" +
                        "  | o o |\n" +
                        "  |____7|\n";

            case 8:
                return "   _____ \n" +
                        "  |8    |\n" +
                        "  |o o o|\n" +
                        "  | o o |\n" +
                        "  |o o o|\n" +
                        "  |____8|\n";
            case 9:
                return "   _____ \n" +
                        "  |9    |\n" +
                        "  |o o o|\n" +
                        "  |o o o|\n" +
                        "  |o o o|\n" +
                        "  |____9|\n";

            case 10:
                return "   _____ \n" +
                        "  |10  o|\n" +
                        "  |o o o|\n" +
                        "  |o o o|\n" +
                        "  |o o o|\n" +
                        "  |___10|\n";
            case 11:
                return "   _____\n" +
                        "  |J  ww|\n" +
                        "  | o {)|\n" +
                        "  |o o% |\n" +
                        "  | | % |\n" +
                        "  |__%%J|\n";
            case 12:
                return "   _____\n" +
                        "  |Q  ww|\n" +
                        "  | o {(|\n" +
                        "  |o o%%|\n" +
                        "  | |%%%|\n" +
                        "  |_%%%Q|\n";
            case 13:
                return "   _____\n" +
                        "  |K  WW|\n" +
                        "  | o {)|\n" +
                        "  |o o%%|\n" +
                        "  | |%%%|\n" +
                        "  |_%%%K|\n";
            default:
                return "Invalid Input!!";
        }

    }

}
