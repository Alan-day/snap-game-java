import java.util.ArrayList;

public class Card implements Comparable <Card>{



    Character suit;
    String symbol;
    int value;



    public Card(Character suit, String symbol, int value) {
        this.suit = suit;
        this.symbol = symbol;
        this.value = value;
    }

    public Character getSuit() {
        return suit;
    }

    public void setSuit(Character suit) {
        this.suit = suit;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public int getValue() {
        return value;
    }



    public void setValue(int value) {
        this.value = value;
    }



    @Override
    public String toString() {
        return "Card{" +
                "suit='" + suit + '\'' +
                ", symbol='" + symbol + '\'' +
                ", value=" + value +
                '}';
    }

    @Override
    public int compareTo(Card o) {
        return Integer.compare(this.value, o.value);
    }
}
