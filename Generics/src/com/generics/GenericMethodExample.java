/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.generics;

/**
 *
 * @author kala
 */
public class GenericMethodExample {

    // A Generic method example
    static <T> void genericDisplay(T obj) {
        System.out.println(obj.getClass().getName()
                + " = " + obj);
    }

    // Driver method
    public static void main(String[] args) {
        // Calling generic method with Integer argument
        genericDisplay(11);

        // Calling generic method with String argument
        genericDisplay("GeeksForGeeks");

        // Calling generic method with double argument
        genericDisplay(1.0);
    }
}
