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



        int i=0;
        System.out.println("Welcome to snap game");

        while (true) {
            String userString = scanner.nextLine();
            System.out.println(userString);

            if (!dealtCardsComputer.isEmpty() && !dealtCardsUser.isEmpty()) {

            }
            else if (!dealtCardsComputer.isEmpty()){
                dealtCardsComputer.remove(0);
            }
            else {
                dealtCardsComputer.add(snap.dealCard(shuffledCards));
            }



            System.out.println("Computer deck: " + dealtCardsComputer);
            System.out.println("User deck: " + dealtCardsUser);

            if (!dealtCardsUser.isEmpty() && !dealtCardsComputer.isEmpty() && dealtCardsComputer.get(0).getValue() == dealtCardsUser.get(0).getValue()) {
                System.out.println("Snap!");
                break;
            }

            if (!dealtCardsUser.isEmpty()) {
                dealtCardsUser.remove(0);
            } else {

                dealtCardsUser.add(snap.dealCard(shuffledCards));
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



