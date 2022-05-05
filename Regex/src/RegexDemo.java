/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kala
 */
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class RegexDemo {
    
    public static void main(String[] args) {
        
        int count = 0;
        
        //creating a pattern object
        //using quantifiers 
        Pattern p = Pattern.compile("a+");
        
        //creating a matcher object wtih pattern
        Matcher m = p.matcher("baanabanaana");
        
        //if match is found
        while(m.find()){
            
            count ++;
            //prints the first index of occurance of the match
            System.out.println(m.start());
        }
        System.out.println("Total matches: " + count);
    }
    
}
