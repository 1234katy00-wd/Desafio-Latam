package com.farmacia.application.service;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    
    private int total = 0;
    private List<Object> items = new ArrayList<>();
    
    public int getTotal() {
        return total;
    }
    
    public List<Object> getItems() {
        return items;
    }

    
}
