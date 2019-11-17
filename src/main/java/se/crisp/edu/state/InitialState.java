package se.crisp.edu.state;

public class InitialState implements OrderState{
    public OrderState process() {
        return new ProcessingState();
    }

    public OrderState ship() {
        throw new IllegalStateException();
    }

    public OrderState cancel() {
        return new CancelledState();
    }

    public OrderState loose() {
        throw new IllegalStateException();
    }
}
