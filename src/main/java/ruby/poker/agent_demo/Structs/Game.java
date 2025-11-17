package ruby.poker.agent_demo.Structs;

import java.util.LinkedList;

public class Game {
    private LinkedList<Card> river;
    private LinkedList<Card> hand;

    private Pot pot;

    Game(LinkedList<Card> r, LinkedList<Card> h, int p) {
        river = r;
        hand = h;
        pot = new Pot(p);
    }

    public Card[] getRiver() {
        Card[] out = new Card[this.river.size()];
        this.river.toArray(out);
        return out;
    }

    public Card[] gethand() {
        Card[] out = new Card[this.hand.size()];
        this.hand.toArray(out);
        return out;
    }

    public Pot getPot() { return this.pot; }

    public int addToPotBalance(int b) {
        this.pot.addToBalance(b);
        return this.pot.getBalance();
    }

    public void addToRiver(Card card) {
        this.river.add(card);
    }
}
