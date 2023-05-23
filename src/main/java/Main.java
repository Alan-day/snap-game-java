import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

CardGame deckOfCards = new CardGame();

        deckOfCards.populateDeck();


        ArrayList <Card> deckSortedByValue = deckOfCards.sortDeckInNumberOrder();


        System.out.println(deckOfCards.dealCard());

        for (int i = 0; i <deckSortedByValue.size(); i++) {
            System.out.println(deckSortedByValue.get(i));

        }



        ArrayList <Card> deckShuffled = deckOfCards.shuffleDeck();

        for (int i = 0; i <deckShuffled.size(); i++) {
            System.out.println(deckShuffled.get(i)) ;

        }

    }
}
