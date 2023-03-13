public class TestHand {
    public static void main(String[] args) {
        Hand hand1 = new Hand();
        hand1.addCard(new Card(2,"Spades"));
        hand1.addCard(new Card(3,"Diamonds"));
        hand1.addCard(new Card(5,"Clubs"));
        hand1.addCard(new Card(4,"Hearts"));
        System.out.println(hand1.isASequence());

        Hand hand2 = new Hand();
        hand2.addCard(new Card(2,"Spades"));
        hand2.addCard(new Card(3,"Diamonds"));
        hand2.addCard(new Card(6,"Clubs"));
        hand2.addCard(new Card(4,"Hearts"));
        System.out.println(hand2.isASequence());

        Hand hand3 = new Hand();
        hand3.addCard(new Card(9,"Spades"));
        hand3.addCard(new Card(9,"Diamonds"));
        hand3.addCard(new Card(9,"Clubs"));
        hand3.addCard(new Card(13,"Hearts"));
        System.out.println(hand3.hasThreeOfAFaceValue());

        Hand hand4 = new Hand();
        hand4.addCard(new Card(1,"Spades"));
        hand4.addCard(new Card(3,"Diamonds"));
        hand4.addCard(new Card(3,"Clubs"));
        hand4.addCard(new Card(5,"Hearts"));
        System.out.println(hand4.hasThreeOfAFaceValue());
    }
}
