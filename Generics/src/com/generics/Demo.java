/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.generics;

/**
 *
 * @author kala
 * @param <T>
 */
public class Demo<T> {

    T obj;

    Demo(T obj) {
        this.obj = obj;
    }

    public void show() {
        System.out.println("The type of object: " + obj.getClass().getName());
    }

    public T getobj() {
        return this.obj;
    }

    public static void main(String[] args) {

        //instance of Integer type
        Demo<Integer> dem1 = new Demo<Integer>(20);

        //instance of String type
        Demo<String> dem2 = new Demo<String>("Kabaddi");

        System.out.println(dem1.getobj());
        dem1.show();
        System.out.println(dem2.getobj());
        dem2.show();
    }
}

/*
class Test {
    // A Generic method example
    static <T> void genericDisplay(T obj)
    {
        System.out.println(obj.getClass().getName()
                           + " = " + obj);
    }
  
    // Driver method
    public static void main(String[] args)
    {
        // Calling generic method with Integer argument
        genericDisplay(11);
  
        // Calling generic method with String argument
        genericDisplay("GeeksForGeeks");
  
        // Calling generic method with double argument
        genericDisplay(1.0);
    }
}
*/
