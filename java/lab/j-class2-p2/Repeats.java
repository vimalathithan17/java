/*1. Write a program in Java to calculate the number of times a Single digit ‘D’ appears in a
number N. You have to take N and D as inputs from the user

5. Define a Person class with attributes like name and age. Implement methods to compare
two Person objects based on their ages.
Input
Person 1 - Jane
Age - 20
Person 2 - Jack
Age - 25
Output
Jack is elder than Jane by 5 years
*/

import java.util.Scanner;

public class Repeats
{
    private static final Scanner scanner=new Scanner(System.in);
    public static void main(String[] args) {
        int number,digit;
        System.out.print("enter a number:");
        number=scanner.nextInt();
        System.out.print("enter the digit whose number of occurances is to be found:");
        digit=scanner.nextInt();
        int count=0;
        while(number!=0)
        {
            if(number%10==digit)
            {
                count+=1;
            }
            number/=10;
        }
        System.out.println("the number of occurances the digit "+digit+" is :"+count);
    }
}