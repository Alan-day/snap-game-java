import java.util.ArrayList;
import java.util.Scanner;

public class Main {





    static CardGame snap = new CardGame();

   static ArrayList<Card> deckOfCards = snap.populateDeck();
    static ArrayList<Card> shuffledCards = snap.shuffleDeck(deckOfCards);
    static ArrayList<Card> dealtCardsComputer = new ArrayList<>();

    static ArrayList<Card> dealtCardsUser = new ArrayList<>();


//    public static void compareCards() {
//
//        for (int i = 0; i < deckOfCards.size(); i++) {
//            if (dealtCardsComputer.get(i).getValue() == dealtCardsUser.get(i).getValue()) {
//                System.out.println("snap!");
//
//            }
//
//        }
//
//
//    }



    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

//        Boolean win = false;

        while (true) {

            System.out.println("Welcome to snap game");

            System.out.println(dealtCardsUser);
            System.out.println(dealtCardsComputer);;


            String userString = scanner.next();
            char userCharacter = userString.toUpperCase().charAt(0);

            if (userCharacter == 'D') {
                int i=0;
                dealtCardsComputer.add(snap.dealCard(shuffledCards));
                dealtCardsUser.add(snap.dealCard(shuffledCards));
                System.out.println(dealtCardsComputer);
                System.out.println(dealtCardsUser);


                    if (dealtCardsComputer.get(i).getValue() == dealtCardsUser.get(i).getValue()) {
                        System.out.println("snap!");
                        break;
                    } else {
                        i++;
                    }



                System.out.println(userString);


            }
            else

            {
                System.out.println("try again");
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

    }

