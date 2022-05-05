/*
*Write a Regular Expression to Represent all 10-digit mobile numbers.
 *Rules:
    --> Every Number should contain exactly 10 digits.
    --> The 1st digit should be 7 or 8 or 9
 */

/**
 *
 * @author kala
 */
import java.util.regex.*;
import java.util.Scanner;

public class MobileNo {
    
    //function To verify if the user input matches the pattern or not
    public static boolean isValid(String str){
        
        //The first two digits (01) are either once or none.
        //land line no. example
        //Pattern p = Pattern.compile("[01]?[0-9]{7}");
        Pattern p = Pattern.compile("[7-9][0-9]{9}");
        
        Matcher m = p.matcher(str);
        
        return (m.find()&&m.group().equals(str));
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Mobile no : ");
        String str = input.next(); 
        
        if(isValid(str)){
            System.out.println("The Mobile no. is valid !!");
        }
        else
            System.out.println("Invalid Mobile no. !!!!!");
        
    }
    
}
