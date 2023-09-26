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
public class CreditCard {
    private long ccnumber;

    public CreditCard(long ccnumber) {
        this.ccnumber = ccnumber;
    }

    @Override
    public String toString() {
        return "CreditCard{" + "ccnumber=" + ccnumber + '}';
    }
    
}
