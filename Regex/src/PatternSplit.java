
import java.util.regex.Pattern;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kala
 */
/*
//To split the target string into the tokens according to the space

public class PatternSplit {
    
    public static void main(String[] args) {
        //space lai ignore garxa
        Pattern p = Pattern.compile("\\s");
        String[] s = p.split("Prakash Kala Thapa");
        
        for(String s1:s){
            System.out.println(s1);
        }
    }
    
}
*/


public class PatternSplit {
    
    public static void main(String[] args) {
        //to split the target string except a
        //it means except the matched expression remainings are tokens
        // 'a' lai ignore garxa
        //space lai ignore gardaina
        Pattern p = Pattern.compile("[.]"); // Pattern.compile("\\.") both are same
        String[] s = p.split("Prakash.thapa.com");
        
        for(String s1:s){
            System.out.println(s1);
        }
    }
    
}
