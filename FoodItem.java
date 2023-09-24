package com.mycompany.pbo5;
/*@author Fikri*/
public class FoodItem {
    private String name;
    private double price;
    private int stock;

    public FoodItem(String name, double price, int stock) {
        this.name = name;
        this.price = price;
        this.stock = stock;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getStock() {
        return stock;
    }

    public void order(int quantity) {
        if (stock >= quantity) {
            stock -= quantity;
            System.out.println("Pesanan diterima: " + name + " x" + quantity);
        } else {
            System.out.println("Maaf, " + name + " habis.");
        }
    }
}

