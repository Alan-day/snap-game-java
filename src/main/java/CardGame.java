import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
public class CardGame {
    Random random = new Random();

    int [] values = {2,3,4,5,6,7,8,9,10,11,12,13,14};
    String [] symbols = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
   static ArrayList<Card> deckOfCards = new ArrayList<>(52);
    ArrayList<Character> suits = new ArrayList<>(List.of('\u2660', '\u2666', '\u2663', '\u2764'));

    public ArrayList<Card> populateDeck(){

        for (int i = 0; i < suits.size(); i++) {
            for (int j = 0; j < symbols.length; j++) {
                Card currentCard = new Card(suits.get(i),symbols[j],values[j]);
                deckOfCards.add(currentCard);


            }
        }
            return deckOfCards;
    }



    public CardGame() {
        this.deckOfCards = deckOfCards;
    }

    public void getDeckOfCards() {

        for (Card card : deckOfCards) {
            System.out.println(card.toString());
        }
    }
    public static Card dealCard(ArrayList deckOfCards){
        deckOfCards.remove(0);
        return (Card) deckOfCards.get(0);



    }

    ArrayList <Card> sortDeckInNumberOrder() {


        Collections.sort(deckOfCards, (a, b) -> a.getValue() - b.getValue());


        return deckOfCards;
    }

    ArrayList <Card> sortDeckIntoSuits() {

        Collections.sort(deckOfCards);
        System.out.println(deckOfCards);
        return deckOfCards;

    }


    ArrayList<Card> shuffleDeck(ArrayList deck) {

        Collections.shuffle(deckOfCards);

        return deckOfCards;
    }





}