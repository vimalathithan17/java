/* 
2.Write a Java method that changes the case of every character in a given string,
demonstrating the transformation from "ORAngE" to "oraNGe" when provided as input
*/

import java.util.*;

public class ToogleCase {
    private static final Scanner scanner=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter the word:");
        char word[]=scanner.next().toCharArray();
        for(int i=0;i<word.length;i++)
        {
            if(Character.isLowerCase(word[i]))
            {
                word[i]=Character.toUpperCase(word[i]);
            }
            else
            {
                word[i]=Character.toLowerCase(word[i]);
            }
        }
        String new_word=new String(word);    
        System.out.println("the new word is:"+new_word);   
    }
}
