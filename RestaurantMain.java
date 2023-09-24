package com.mycompany.pbo5;
/*@author Fikri*/
public class RestaurantMain {
    public static void main(String[] args) {
        Restaurant menu = new Restaurant();

        // Menambahkan menu makanan
        menu.tambahMenuMakanan(new FoodItem("Bala-Bala", 1_000, 20));
        menu.tambahMenuMakanan(new FoodItem("Gehu", 1_000, 20));
        menu.tambahMenuMakanan(new FoodItem("Tahu", 1_000, 0));
        menu.tambahMenuMakanan(new FoodItem("Molen", 1_000, 20));

        // Menampilkan menu makanan
        menu.tampilMenuMakanan();

        // Melakukan pemesanan
        menu.pesanMenu("Bala-Bala", 3);
        menu.pesanMenu("Tahu", 2);
        menu.pesanMenu("Molen", 5);
    }
}

