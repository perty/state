package se.crisp.edu.state;

public class ProcessingState implements OrderState {
    public OrderState process() {
        return this;
    }

    public OrderState ship() {
        return new ShippingState();
    }

    public OrderState cancel() {
        return new CancelledState();
    }

    public OrderState loose() {
        throw new IllegalStateException();
    }
}
