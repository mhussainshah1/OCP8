package com.newcircle.stream;

/**
 *
 */
enum Type {
    ONLINE;
}

public class Order {

    Type type;
    int quantity;

    public Order() {
    }

    public Order(Type type, int quantity) {
        this.type = type;
        this.quantity = quantity;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

}
