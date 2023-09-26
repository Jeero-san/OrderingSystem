/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package orderingsystem;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author sbc-student
 */
public class ShoppingCart {
    
   private List<Product> list = new ArrayList<>();

    public ShoppingCart() {
    }
    
   public void addProduct(Product product){
   list.add(product);
       
   }
   
   public int getTotalCost(){
   return list.stream()
           .mapToInt(Product::getPrice)
           .sum();    
   }

    @Override
    public String toString() {
        return "ShoppingCart{" + "list=" + list + '}';
    }
   
}
