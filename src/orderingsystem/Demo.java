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
public class Demo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic her
       CreditCard card = new CreditCard (100001);
       Customer person = new Customer("John", card);
       ShoppingCart cart = new ShoppingCart();
       Product ballpen = new Product("Pilot", 15);
       Product index_card = new Product("1/8", 1);
       
       cart.addProduct(ballpen);
       cart.addProduct(index_card);
       
        System.out.println(cart);
        System.out.println("The Total is : " + cart.getTotalCost());
       
       System.out.println(person);
    }
     
}
