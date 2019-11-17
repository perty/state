package se.crisp.edu.state;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OrderTest {

    @Test
    void process() {
        Order order = new Order();
        order.process();
    }

    @Test
    void ship() {
        Order order = new Order();
        order.process();
        order.ship();
    }

    @Test
    void cancel() {
        Order order = new Order();
        order.process();
        order.cancel();
    }

    @Test
    void loose() {
        Order order = new Order();
        order.process();
        order.ship();
        order.loose();
    }
}