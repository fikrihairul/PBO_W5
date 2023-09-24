package com.mycompany.pbo5;
import java.util.List;
import java.util.ArrayList;
/*@author Fikri*/
public class Restaurant {
    private List<FoodItem> menu = new ArrayList<>();

    public void tambahMenuMakanan(FoodItem foodItem) {
        menu.add(foodItem);
    }

    public void tampilMenuMakanan() {
        System.out.println("Menu Makanan:");
        for (FoodItem item : menu) {
            System.out.println(item.getName() + "[" + item.getStock() + "]\tRp. " + item.getPrice());
        }
    }

    public void pesanMenu(String nama, int jumlah) {
        for (FoodItem item : menu) {
            if (item.getName().equals(nama) && item.getStock() >= jumlah) {
                item.order(jumlah);
                return;
            }
        }
        System.out.println("Menu " + nama + " tidak ditemukan atau habis.");
    }
}
