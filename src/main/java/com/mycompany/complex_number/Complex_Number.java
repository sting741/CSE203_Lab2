/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.complex_number;

/**
 *
 * @author Student
 */
public class Complex_Number {

    public static void main(String[] args) {
        Complex cp1 = new Complex(4, 7);
        Complex cp2 = new Complex(3, 4);
        Complex result = cp1.Plus(cp2);
        result.Output();
        result = cp1.Minus(cp2);
        result.Output();
        result = cp1.Multiply(cp2);
        result.Output();
    }
}
