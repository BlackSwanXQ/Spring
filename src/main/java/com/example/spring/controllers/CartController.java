package com.example.spring.controllers;

import com.example.spring.interfaces.CartService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
//@RequestMapping("/store/order")
public class CartController {

    private final CartService cartService;

    public CartController(CartService cartService) {
        this.cartService = cartService;
    }


    @GetMapping
    public String great() {
        return cartService.great();
    }


    @GetMapping("/add")
    public void add(@RequestParam List<Integer> item) {
        cartService.add(item);
    }

    @GetMapping("/get")
    public List<Integer> get() {
        return cartService.get();
    }

}
