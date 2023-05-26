import java.util.ArrayList;
import java.util.Scanner;

public class Main {





    static CardGame snap = new CardGame();

   static ArrayList<Card> deckOfCards = snap.populateDeck();
    static ArrayList<Card> shuffledCards = snap.shuffleDeck(deckOfCards);
    static ArrayList<Card> dealtCardsComputer = new ArrayList<>();

    static ArrayList<Card> dealtCardsUser = new ArrayList<>();



    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);




        System.out.println("Welcome to snap game");
        int r = 1;

        while (true) {
            String userString = scanner.nextLine();
            System.out.println(userString);

            if (dealtCardsComputer.isEmpty()) {
                dealtCardsComputer.add(snap.dealCard(shuffledCards));

            } else if (!dealtCardsComputer.isEmpty() && ((r % 2) == 0)) {
                dealtCardsComputer.set(0, snap.dealCard(shuffledCards));  // Update the first element in the computer's deck
            }

            System.out.println("Computer card " + dealtCardsComputer);
            System.out.println("User card " + dealtCardsUser);

            if (!dealtCardsUser.isEmpty() && !dealtCardsComputer.isEmpty() && dealtCardsComputer.get(0).getValue() == dealtCardsUser.get(0).getValue()) {
                System.out.println("Snap!");
                break;
            }
            r++;

            if (dealtCardsUser.isEmpty()) {
                dealtCardsUser.add(snap.dealCard(shuffledCards));
            } else if (!dealtCardsUser.isEmpty() && ((r % 2) == 1)) {
                dealtCardsUser.set(0, snap.dealCard(shuffledCards));  // Update the first element in the user's deck
            }
        }


            }


        }













//        ArrayList <Card> deckSortedByValue = deckOfCards.sortDeckInNumberOrder();
//
//
//        System.out.println(deckOfCards.dealCard());
//
//        for (int i = 0; i <deckSortedByValue.size(); i++) {
//            System.out.println(deckSortedByValue.get(i));
//
//        }
//
//
//
//        ArrayList <Card> deckShuffled = deckOfCards.shuffleDeck();
//
//        for (int i = 0; i <deckShuffled.size(); i++) {
//            System.out.println(deckShuffled.get(i)) ;
//
//        }



