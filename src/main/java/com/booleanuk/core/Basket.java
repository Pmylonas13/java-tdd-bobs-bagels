package com.booleanuk.core;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Basket {
    public ArrayList<String> bagels;
    public int capacity;

    public Basket() {
        this.bagels = new ArrayList<>();
        this.capacity = 5; // default capacity
    }
        public void addBagel (String bagel){
            if (bagels.size() < capacity) {
                bagels.add(bagel);
            } else {
                System.out.println("Basket is full. Cannot add more bagels.");
            }
        }
        public boolean isBasketFull () {return bagels.size() >= capacity;}

    public List<String> getBasket() {
        return new ArrayList<>(bagels);
    }

    public void removeBagel(String bagel) {}
}

