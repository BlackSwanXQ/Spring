package com.example.spring.interfaces;


import com.example.spring.cart.Cart;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class CartServiceImpl implements CartService {

    private final Cart cart;

    public CartServiceImpl(Cart cart) {
        this.cart = cart;
    }

    @Override
    public String great() {
        return "<h1> Hello customer! </h1>";
    }

    @Override
    public void add(List<Integer> item) {
        cart.addItem(item);
    }

    @Override
    public List<Integer> get() {
        return cart.getCart();
    }
}
