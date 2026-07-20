package com.proyecto.domain;

import java.util.ArrayList;
import java.util.List;

public class CarritoCompras {
    
    private int total = 0;
    private List<Object> items = new ArrayList<>();
    
    public int getTotal() {
        return total;
    }
    
    public List<Object> getItems() {
        return items;
    }

    
}
