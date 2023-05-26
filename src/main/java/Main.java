import java.util.ArrayList;
import java.util.Scanner;

public class Main {


    static Snap snap = new Snap();

    static ArrayList<Card> deckOfCards = snap.populateDeck();
    static ArrayList<Card> shuffledCards = snap.shuffleDeck(deckOfCards);
    static ArrayList<Card> dealtCardsComputer = new ArrayList<>();

    static ArrayList<Card> dealtCardsUser = new ArrayList<>();


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to snap game");
        int r = 1;

        // r variable has a property of being divisible by 2 or not.
        // Because of that it can oscillate between divisible and non-divisible for every iteration
        // I used it to display a new card for each array where only one array is changed per turn


        while (true) {
            String userString = scanner.nextLine();
            System.out.println(userString);


            if (dealtCardsComputer.isEmpty()) {
                dealtCardsComputer.add(snap.dealCard(shuffledCards));

            } else if (!dealtCardsComputer.isEmpty() & ((r % 2) == 0)) {
                dealtCardsComputer.remove(0);
                dealtCardsComputer.add(snap.dealCard(shuffledCards));

            } else {


            }


            System.out.println("Computer deck: " + dealtCardsComputer);
            System.out.println("User deck: " + dealtCardsUser);

            if (!dealtCardsUser.isEmpty() && !dealtCardsComputer.isEmpty() && dealtCardsComputer.get(0).getValue() == dealtCardsUser.get(0).getValue()) {
                System.out.println("Snap!");
                break;
            }

            r++; // increase the r after first check

            if (dealtCardsUser.isEmpty()) {
                dealtCardsUser.add(snap.dealCard(shuffledCards));
            } else if (!dealtCardsUser.isEmpty() & ((r % 2) == 1)) {
                dealtCardsUser.remove(0);
                dealtCardsUser.add(snap.dealCard(shuffledCards));

            }


        }


    }


}





