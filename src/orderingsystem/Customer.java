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
public class Customer {
    
    private final String name;
    private CreditCard creditCard;

    public Customer(String name, CreditCard creditCard) {
        this.name = name;
        this.creditCard = creditCard;
    }

    @Override
    public String toString() {
        return "Customer{" + "name=" + name + ", creditCard=" + creditCard + '}';
    }
    
    
    
}
