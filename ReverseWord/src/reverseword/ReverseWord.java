/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package reverseword;
import java.util.Scanner;
/**
 *
 * @author suzuc
 */
public class ReverseWord {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Step 1: Take input from the user
        System.out.println("hello");
        Scanner input = new Scanner(System.in);
        String word= input.next();
        //Step 2: Split char from word and store in char[]
        char[] reverse = new char[word.length()]; //hello is of 5 words
        for(int i=0;i<word.length();i++)
        {
           reverse[i] =word.charAt(i); //h
        }
        //Step 3: Read array in the reverse manner
        for (int i=reverse.length-1;i>=0;i--)
        {
        System.out.println(reverse[i]);
        System.out.println("Hello");
        System.out.println("Hello");
            //suzu
        }
    }
    
}
