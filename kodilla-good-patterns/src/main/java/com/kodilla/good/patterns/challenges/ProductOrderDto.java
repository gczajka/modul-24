package com.kodilla.good.patterns.challenges;

public class ProductOrderDto {
    User user;
    boolean madeOrder;

    public ProductOrderDto(User user, boolean madeOrder) {
        this.user = user;
        this.madeOrder = madeOrder;
    }

    public User getUser() {
        return user;
    }

    public boolean isMadeOrder() {
        return madeOrder;
    }
}
