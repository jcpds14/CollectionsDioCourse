package main.java.list.BasicsOperations;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private List<Item> cartItems;

    public ShoppingCart(){
        this.cartItems = new ArrayList<>();
    }

    public void addItemsToCart(String name, double price, double quantity){
        cartItems.add(new Item(name, price, quantity));
    }
    public void removeItemFromCart(String name){
       List<Item> itemsToRemove = new ArrayList<>();
       for(Item i : cartItems){
           if(i.getName().equalsIgnoreCase(name)){
               itemsToRemove.add(i);
           }
       }
        cartItems.removeAll(itemsToRemove);
    }
    public String getTotalPrice(){
        double totalPrice = 0;
        for(Item i : cartItems){
            totalPrice += i.getPrice() * i.getQuantity();
        }
        return "Total Price: " + totalPrice;
    }
    public void showCart(){
        System.out.println(cartItems);
    }

    public static void main(String[] args) {
        ShoppingCart shoppingCart = new ShoppingCart();

        System.out.println("Cart Items: " + shoppingCart.cartItems);

        shoppingCart.addItemsToCart("Item 1", 10, 2);
        shoppingCart.addItemsToCart("Item 2", 20, 3);
        shoppingCart.addItemsToCart("Item 2", 20, 4);
        System.out.println("Cart Items: " + shoppingCart.cartItems);
        System.out.println("---------------------");

        shoppingCart.removeItemFromCart("Item 2");
        System.out.println("Cart Items: " + shoppingCart.cartItems);
        System.out.println("---------------------");

        shoppingCart.addItemsToCart("Item 2", 20, 4);
        shoppingCart.addItemsToCart("Item 3", 30, 5);
        shoppingCart.addItemsToCart("Item 4", 23, 1);
        System.out.print("Cart Items: ");
        shoppingCart.showCart();
        System.out.println("---------------------");
        System.out.println(shoppingCart.getTotalPrice());


    }
}