package se.crisp.edu.state;

public class LostState implements OrderState {
    public OrderState process() {
        throw new IllegalStateException();
    }

    public OrderState ship() {
        throw new IllegalStateException();
    }

    public OrderState cancel() {
        throw new IllegalStateException();
    }

    public OrderState loose() {
        return this;
    }
}
