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

        int i=0;
        System.out.println("Welcome to snap game");

        while (true) {
            String userString = scanner.nextLine();


//            char userCharacter = userString.toUpperCase().charAt(0);
            System.out.println(userString);
            if (userString.isEmpty()) {

                dealtCardsComputer.add(snap.dealCard(shuffledCards));
                dealtCardsUser.add(snap.dealCard(shuffledCards));

                System.out.println("Computer deck" + dealtCardsComputer);
                System.out.println("User deck" + dealtCardsUser);


                    if (dealtCardsComputer.get(i).getValue() == dealtCardsUser.get(i).getValue()) {
                        System.out.println("snap!");
                        break;

                    } else if (dealtCardsComputer.get(i).getValue() == dealtCardsUser.get(i-1).getValue()) {
                        System.out.println("snap!");
                        break;

                    } else {
                        i++;
                    }




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

