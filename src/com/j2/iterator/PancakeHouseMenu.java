package com.j2.iterator;

import java.util.ArrayList;

public class PancakeHouseMenu {
    ArrayList menuItems;
 
    public PancakeHouseMenu() {
        menuItems = new ArrayList();
    
        addItem("K&B's Pancake Breakfast", 
                "Pancakes with scrambled eggs, and toast", true, 2.99);
        addItem("Regular Pancake Breakfast", "Pancakes with fried eggs, sausage", false, 2.99);
        addItem("Blueberry Pancakes", "Pancakes made with fresh blueberries", true, 3.49);
        addItem("Waffles", "Waffles, with your choice of blueberries or strawberries", true, 3.59);
        addItem("아이스크림 와플", "바닐라 아이스크림과  와플", false, 3.00);
        addItem("파니니", "불고기 파니니", false, 4.00);
        addItem("허니브레드", "생크림과 카라멜소스가 올라간  브레드", false, 4.50);
    }
    public void addItem(String n, String d, boolean v, double p) {
        MenuItem menuItem = new MenuItem(n, d, v, p);
        menuItems.add(menuItem);
    }
    public ArrayList getMenuItems() {
        return menuItems;
    }
   
}
