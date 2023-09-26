/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package orderingsystem;

/**
 *
 * @author sbc-student
 */
public class Product {
    private final String name;
    private int price;

    public Product(String name, int price) {
        this.name = name;
        this.price = price;
    }
    
    public int getPrice(){
    
        return price;
        
    }

    @Override
    public String toString() {
        return "Product{" + "name=" + name + ", price=" + price + '}';
    }
    
}
