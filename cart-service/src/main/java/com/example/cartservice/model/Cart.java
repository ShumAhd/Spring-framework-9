package com.example.cartservice.model;

import java.util.List;
import lombok.Data;

@Data
public class Cart {

  private List<CartItem> items;


}
