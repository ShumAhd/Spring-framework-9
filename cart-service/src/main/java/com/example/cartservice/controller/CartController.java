package com.example.cartservice.controller;

import com.example.cartservice.model.Cart;
import com.example.cartservice.model.CartItem;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cart")
public class CartController {

  @PostMapping("/add")
  public void addToCart(@RequestBody CartItem cartItem) {
    // Add logic to add item to cart
  }

  @DeleteMapping("/remove/{productId}")
  public void removeFromCart(@PathVariable Long productId) {
    // Add logic to remove item from cart
  }

  @PostMapping("/checkout")
  public void checkout(@RequestBody Cart cart) {
    // Add logic to process checkout
  }
}

