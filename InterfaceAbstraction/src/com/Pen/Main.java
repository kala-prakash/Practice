/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Pen;

/**
 *
 * @author kala
 */
public class Main {
    
    public static void main(String[] args) {
        
        FountainPen fp = new FountainPen();
        fp.write();
        fp.changeNib();
        
        Human prakash = new Human();
        prakash.sleep();
        
        Monkey m = new Human();
        m.bite();
        m.jump();
        
        
        basicAnimal ani = new Human();
        ani.eat();
       
    }
    
}
