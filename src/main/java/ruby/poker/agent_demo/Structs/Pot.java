package ruby.poker.agent_demo.Structs;

public class Pot {
    private int balance;

    Pot(int b) {
        balance = b;
    }

    public int getBalance() {
        return this.balance;
    }

    public int addToBalance(int b) {
        this.balance += b;

        return this.balance;
    }
}
