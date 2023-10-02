/*
 * 3. Write a Java method that reverses an Array without using extra space.
 */

import java.util.*;

public class Reverse {
    private static final Scanner scanner=new Scanner(System.in);
    public static void main(String[] args) {
        int num;
        System.out.print("enter the number of elements:");
        num=scanner.nextInt();
        int[] array=new int[num];
        for(int i=0;i<num;i++)
        {
            System.out.print("enter the value at index "+i+" :");
            array[i]=scanner.nextInt();
        }
        for(int i=0;i<num/2;i++)
        {
            array[i]+=array[num-i-1];
            array[num-i-1]=array[i]-array[num-i-1];
            array[i]=array[i]-array[num-i-1];
        }
        System.out.println("the reversed array is:"+Arrays.toString(array));
    }
}
