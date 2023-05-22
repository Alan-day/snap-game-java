import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CardGame {

    int [] values = {2,3,4,5,6,7,8,9,10,11,12,13,14};
    String [] symbols = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
    ArrayList<Card> deckOfCards = new ArrayList<>(52);
    ArrayList<Character> suits = new ArrayList<>(List.of('\u2660', '\u2666', '\u2663', '\u2764'));

    public void populateDeck(){
        for (int i = 0; i < suits.size(); i++) {

            for (int j = 0; j < symbols.length; j++) {
                Card currentCard = new Card(suits.get(i),symbols[j],values[j]);
                deckOfCards.add(currentCard);
                System.out.println(currentCard.toString());

            }
        }

    }



    public CardGame() {
        this.deckOfCards = deckOfCards;
    }

    public void getDeckOfCards() {

        for (Card card : deckOfCards) {
            System.out.println(card.toString());
        }
    }
    public Card dealCard(){
        return deckOfCards.get(0);
    }

    ArrayList <Card> sortDeckInNumberOrder() {

        Collections.sort(deckOfCards);
        System.out.println(deckOfCards);
        return deckOfCards;
    }






}