/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.generics;

import java.util.Arrays;
import java.util.List;

/**
 *
 * @author kala
 */
public class UpperBoundedWildcard {

    private static double sum(List<? extends Number> list) {
        double sum = 0.0;
        for (Number i : list) {
            sum += i.doubleValue();
        }

        return sum;
    }

    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(1, 2, 3, 4);
        System.out.println("The sum of Integer is : " + sum(intList));
        
        List<Double> dobList = Arrays.asList(1.0,2.0,3.0);
        System.out.println("The sum of Double is : " + sum(dobList));
    }
}
