package se.crisp.edu.state;

public interface OrderState {

    OrderState process();

    OrderState ship();

    OrderState cancel();

    OrderState loose();
}
