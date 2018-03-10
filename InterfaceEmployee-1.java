/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaceemployee;

import java.text.DecimalFormat;

/**
 *
 * @author cs302001_08
 */
public interface InterfaceEmployee {

    final static DecimalFormat MONEY = new DecimalFormat("$0.00");

    //a class constant used in formatting a value in dollars and cents

    /**
     * Returns this Employee object's name
     *
     * @return this Employee object's name
     */
    String getName();

    /**
     * Returns this Employee object's gross pay
     *
     * @return this Employee object's gross pay
     */
    double getGrossPay();

    /**
     * Returns a String representation of this Employee object with the name
     * followed by a space followed by a dollar sign followed by the gross
     * weekly pay, with two fractional digits (rounded)
     *
     * @return a String representation of this Employee object
     */
    String toString();

}
