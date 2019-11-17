package se.crisp.edu.state;

public class Order {
    private OrderState state;

    public Order() {
        this.state = new InitialState();
    }

    public void process() {
        state = state.process();
    }

    public void ship() {
        state = state.ship();
    }

    public void cancel() {
        state = state.cancel();
    }

    public void loose() {
        state = state.loose();
    }

}
