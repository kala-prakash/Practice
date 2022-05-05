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

public class Characters2 {
    
    public static void main(String[] args) {
        
        
       
        Pattern p = Pattern.compile("[^a-zA-Z0-9]");
        Matcher m = p.matcher("a@z_32#@");
        
        while(m.find()){
        
                System.out.println(m.start()+"....."+m.group());
        }
            
    }
    
}
