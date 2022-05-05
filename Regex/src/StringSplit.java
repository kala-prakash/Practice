/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kala
 */
public class StringSplit {
    
    public static void main(String[] args) {
        
        String s = "Prakash Kala Thapa";
        
        //mathi ko string lai split garera string maa rakhna
        String[] s1 = s.split("\\s");
        
        //to print each array elements
        for(String s2:s1){
            System.out.println(s2);
        }
    }
    
}

