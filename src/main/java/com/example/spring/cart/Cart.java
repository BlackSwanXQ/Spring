package com.example.spring.cart;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.SessionScope;

import java.util.ArrayList;
import java.util.List;

@Service
@Component
@SessionScope
public class Cart {
    private final List<Integer> cart;

    public Cart(List<Integer> cart) {
        this.cart = new ArrayList<>();
    }

    public void addItem(List<Integer> item) {
        this.cart.addAll(item);
    }

    public List<Integer> getCart() {
        return cart;
    }

}
