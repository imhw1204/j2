package com.j2.iterator;

public class DinerMenu implements Menu{
  static final int MAX_ITEMS=9;
  int numberOfItems=0;
  MenuItem[] menuItems;
  
  public DinerMenu(){
    menuItems=new MenuItem[MAX_ITEMS];
    addItem("Vegetarian BLT",
                "(Fakin') Bacon with lettuce & tomato on whole wheat", true, 2.99);
    addItem("BLT",
                "Bacon with lettuce & tomato on whole wheat", false, 2.99);
    addItem("Soup of the day",
                "Soup of the day, with a side of potato salad", false, 3.29);
    addItem("Hotdog",
                "A hot dog, with saurkraut, relish, onions, topped with cheese", false, 3.05);
    addItem("Steamed Veggies and Brown Rice",
                "Steamed vegetables over brown rice", true, 3.99);
    addItem("Pasta",
                "Spaghetti with Marinara Sauce, and a slice of sourdough bread", true, 3.89);
    addItem("¶±ººÀÌ",
            "¸Å¿î ½Ò¶±ººÀÌ", false, 2.00);
    addItem("¿Àµ­",
            "µû¶æÇÑ ¼öÁ¦¾î¹¬", false, 2.00);
    addItem("Æ¢±è",
            "°ñ°í·ç ¼öÁ¦Æ¢±è", false, 2.50);
  }
  
  public void addItem(String n, String d, boolean v, double p){
    MenuItem menuItem=new MenuItem(n,d,v,p);
    if (numberOfItems >= MAX_ITEMS){
      System.out.println("Sorry, menu is full! Can't add item to menu");
    }
    else{
      menuItems[numberOfItems]=menuItem;
      numberOfItems=numberOfItems+1;
    }
  }
  
  public MenuItem[] getMenuItems() {
    return menuItems;
  }
    
  public Iterator createIterator() {
    return new DinerMenuIterator(menuItems);
  }
}

  
