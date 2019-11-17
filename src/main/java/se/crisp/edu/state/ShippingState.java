package se.crisp.edu.state;

public class ShippingState implements OrderState {
    public OrderState process() {
        throw new IllegalStateException();
    }

    public OrderState ship() {
        return this;
    }

    public OrderState cancel() {
        throw new IllegalStateException();
    }

    public OrderState loose() {
        return new LostState();
    }
}
