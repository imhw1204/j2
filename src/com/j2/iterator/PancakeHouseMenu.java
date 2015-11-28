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
        addItem("���̽�ũ�� ����", "�ٴҶ� ���̽�ũ����  ����", false, 3.00);
        addItem("�Ĵϴ�", "�Ұ�� �Ĵϴ�", false, 4.00);
        addItem("��Ϻ극��", "��ũ���� ī���ҽ��� �ö�  �극��", false, 4.50);
    }
    public void addItem(String n, String d, boolean v, double p) {
        MenuItem menuItem = new MenuItem(n, d, v, p);
        menuItems.add(menuItem);
    }
    public ArrayList getMenuItems() {
        return menuItems;
    }
   
}
