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
class sample<T extends Number>{
    T data;
    sample(T data){
    this.data = data;
    }
    public void display(){
        System.out.println("The data value is: "+ this.data);
    }

} 
public class BoundedTypesExample{
    public static void main(String[] args) {
        sample<Integer> obj1 = new sample<Integer>(10);
        obj1.display();
        sample<Double> obj2 = new sample<Double>(10.22);
        obj2.display();
        sample<Float> obj3 = new sample<Float>(0.33f);
        obj3.display();
        //sample<String> obj4 = new sample<String>("Hello");
    }
    }

