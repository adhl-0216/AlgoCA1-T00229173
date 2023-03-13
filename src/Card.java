public class Card implements Comparable{
    private int value;
    private String face;

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public String getFace() {
        return face;
    }

    public void setFace(String face) {
        this.face = face;
    }

    public Card(int value, String face) {
        this.value = value;
        this.face = face;
    }

    @Override
    public String toString() {
        return value + " of " + face;
    }


    @Override
    public int compareTo(Object o) {
        if (this.getValue() == ((Card) o).getValue()) return 0;
        return (this.getValue() > (((Card) o).getValue()))? 1 : -1;
    }
}
