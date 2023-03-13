import java.util.Arrays;

public class Hand {
    private final Card[] cards;

    public Hand() {
       cards = new Card[4];
    }

    public void addCard(Card card) {
        for (int i = 0; i < cards.length; i++) {
            if (cards[i] == null) {
                cards[i] = card;
                return;
            }
        }
    }
    public boolean isASequence(){
        Arrays.sort(cards);
        for (int i = 0; i < cards.length; i++) {
            if ((cards[Math.min(i+1, cards.length-1)].getValue()-cards[i].getValue()) > 1) {
                return false;
            }
        }
        return true;
    }
    public boolean hasThreeOfAFaceValue(){
        Arrays.sort(cards);
        for (int i = 0; i < cards.length; i++) {
            int curr = cards[i].getValue();
            int c = 0;
            for (int j = 0; j < cards.length; j++) {
                if (i == j) continue;
                if (curr == cards[j].getValue()) c++;
            }

            if (c == 2) return true;
        }
        return false;
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        for (Card card : cards) {
            str.append(card).append("-");
        }
        return str.toString();
    }
}
