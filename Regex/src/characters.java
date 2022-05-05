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

public class characters {
    
    public static void main(String[] args) {
        
        Pattern p = Pattern.compile("[abc]");
        
       Matcher m = p.matcher("public boolean");
       
       while(m.find()){
       
           System.out.println("at index: " + m.start());
       }
    }
    
}
