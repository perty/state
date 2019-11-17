package se.crisp.edu.state;

public class CancelledState implements OrderState {
    public OrderState process() {
        throw new IllegalStateException();
    }

    public OrderState ship() {
        throw new IllegalStateException();
    }

    public OrderState cancel() {
        return this;
    }

    public OrderState loose() {
        throw new IllegalStateException();
    }
}
