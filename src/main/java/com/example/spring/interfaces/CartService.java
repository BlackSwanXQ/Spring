package com.example.spring.interfaces;

import java.util.List;

public interface CartService {
    String great();
    void add(List<Integer> cart);
    List<Integer> get();
}
