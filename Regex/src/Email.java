
import java.util.regex.*;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author kala
 */
public class Email {

    //function to validate email
    public static boolean emailValidate(String str) {

        Pattern p = Pattern.compile("[A-Za-z0-9][A-Za-z0-9_.]*@[A-Za-z0-9]+.([.][A-Za-z]+)+");

        Matcher m = p.matcher(str);

        return (m.find() && m.group().equals(str));
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the valid emailId :");
        String str = input.next();

        if (emailValidate(str)) {
            System.out.println("Valid Email");
        } else {
            System.out.println("Invalid Email");
        }
    }

}
