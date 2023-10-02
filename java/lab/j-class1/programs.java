import java.util.*;

class Swap {

  public static void main(String args[]) {
    int a = Integer.parseInt(args[0]);
    int b = Integer.parseInt(args[1]);
    a = a + b;
    b = a - b;
    a = a - b;
    System.out.println("a:" + a + "\nb:" + b);
  }
}

class IsPrime {

  public static void main(String args[]) {
    int num = Integer.parseInt(args[0]);
    int i = 2;
    if (num == 1) {
      System.out.println("neither prime nor composite");
    } else if (num == 2) {
      System.out.println("prime");
    } else {
      for (; i < num; i++) {
        if (num % i == 0) {
          System.out.println("not a prime");
          break;
        }
      }
      if (i == num) {
        System.out.println("prime");
      }
    }
  }
}

class IsOdd {

  public static void main(String args[]) {
    boolean odd = true;
    for (int i = 0; i < args.length; i++) {
      if (Integer.parseInt(args[i]) % 2 == 0) {
        System.out.println("No");
        odd = false;
        break;
      }
    }
    if (odd == true) {
      System.out.println("yes");
    }
   
  }
}
 /*
     * int len=args.length;
     * int a[]=new int[len];
     * System.out.println(a);
     * for(int i=0;i<len;i++)
     * {
     * a[i]=Integer.parseInt(args[i]);
     * System.out.println(a[i]);
     * }
     */

class Factorial {

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the number greater than 1 to find factorial:");
    int num = sc.nextInt();
    fact(num);
    sc.close();
  }

  public static void fact(int num) {
    int fact = 1;
    if (num < 0) {
      System.out.println("cant find factorial of negative number");
    }
    for (int i = 2; i <= num; i++) {
      fact *= i;
    }
    System.out.println("the factorial is:" + fact);
  }
}

class SecondGreatest {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num;
    System.out.print("enter the size of the array:");
    num = sc.nextInt();
    int arr[] = new int[num];
    for (int i = 0; i < num; i++) {
      System.out.print("enter the vallue at index " + i + ":");
      arr[i] = sc.nextInt();
    }
    sc.close();
    for (int i = 0; i < 2; i++) {
      int greatest_element_index = i;
      int current_val = arr[i];
      for (int j = i + 1; j < num; j++) {
        if (arr[greatest_element_index] < arr[j]) {
          greatest_element_index = j;
        }
      }
      int dummy = arr[greatest_element_index];
      arr[greatest_element_index] = current_val;
      arr[i] = dummy;
    }
    System.out.println("the 2nd largest element in the array is " + arr[1]);
  }
}

class Palindrome {

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the number to cheak for palindrome:");
    int num = sc.nextInt();
    sc.close();
    int digits = 0;
    int num1 = num;
    while (num1 != 0) {
      num1 /= 10;
      digits++;
    }
    int arr[] = new int[digits];
    for (int i = 0; i < digits; i++) {
      int dummy = num % 10;
      num /= 10;
      arr[i] = dummy;
    }
    int is_palindrome = 0;
    for (int i = 0; i < digits; i++) {
      if (arr[i] != arr[digits - i - 1]) {
        is_palindrome = 1;
        break;
      }
    }
    if (is_palindrome == 0) {
      System.out.print("It is a palindrome number.");
    } else {
      System.out.print("Not a palindrome number.");
    }
  }
}

class Armstrong {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print(
      "Enter a number to cheak whether it is armstrong or not :"
    );
    int num = sc.nextInt();
    int digits = 0;
    sc.close();
    int num1 = num;
    while (num1 != 0) {
      num1 /= 10;
      digits++;
    }
    num1 = num;
    int sum = 0;
    for (int i = 0; i < digits; i++) {
      int temp = num1 % 10;
      sum += Math.pow(temp, digits);
      num1 /= 10;
    }
    if (sum == num) {
      System.out.println("It is a Armstrong number.");
    } else System.out.println("It is not a Armstrong number.");
  }
}

class SOD {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a number to find sum of digits :");
    int num = sc.nextInt();
    int sod = 0;
    while (num != 0) {
      sod += num % 10;
      num /= 10;
    }
    System.out.print("Sum of digits of the given number is " + sod);
    sc.close();
  }
}

class Fibonacci {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the length of the series :");
    int num = sc.nextInt();
    sc.close();
    int current_term = 0;
    int next_term = 1;
    System.out.print(current_term + " " + next_term);
    for (int i = 0; i < num - 2; i++) {
      System.out.print(" " + (current_term + next_term));
      int temp = current_term;
      current_term = next_term;
      next_term += temp;
    }
  }
}

class Vowel {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the string to cheak for vowel :");
    String str = sc.nextLine();
    sc.close();
    boolean is_vowel_not_present = true;
    for (char i : str.toLowerCase().toCharArray()) {
      if (i == 'a' || i == 'e' || i == 'i' || i == 'o' || i == 'u') {
        is_vowel_not_present = false;
        System.out.print("Vowel's are present in the string");
        break;
      }
    }
    if (is_vowel_not_present) {
      System.out.print("No vowel is present in the string");
    }
  }
}

class ReverseOrder {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the sentence to reverse :");
    String str = sc.nextLine();
    String arr[] = str.split(" ");

    sc.close();
    for (int i = 0; i < arr.length / 2; i++) {
      String temp = arr[i];
      arr[i] = arr[arr.length - i - 1];
      arr[arr.length - i - 1] = temp;
    }

    System.out.println("The words in reverse order is:");
    for (String i : arr) {
      System.out.print(i + " ");
    }
  }
}

class Gcd {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a, b;
    System.out.print("enter the value of a:");
    a = sc.nextInt();
    System.out.print("enter the value of b:");
    b = sc.nextInt();
    int remainder = 0;
    sc.close();
    if (b > a) {
      int temp = b;
      b = a;
      a = temp;
    }
    while (true) {
      remainder = a % b;
      a = b;
      if (remainder == 0) {
        System.out.println("the GCD is:" + b);
        break;
      }
      b = remainder;
    }
  }
}

class Sort {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num;
    System.out.print("enter the size of the array:");
    num = sc.nextInt();
    int arr[] = new int[num];
    for (int i = 0; i < num; i++) {
      System.out.print("enter the vallue at index " + i + ":");
      arr[i] = sc.nextInt();
    }
    sc.close();
    for (int i = 0; i < num; i++) {
      int current_val = arr[i];
      for (int j = i - 1; j >= 0; j--) {
        if (current_val < arr[j]) {
          int temp = arr[j];
          arr[j] = arr[j + 1];
          arr[j + 1] = temp;
        }
      }
    }
    System.out.println(
      "the array sorted in asscending order is:" + Arrays.toString(arr));
  }
}

class Anagrams {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String s1, s2;
    System.out.print("enter word1:");
    s1 = scan.next().toLowerCase();
    System.out.print("enter word2:");
    s2 = scan.next().toLowerCase();
    char c1[], c2[];
    c1 = s1.toCharArray();
    c2 = s2.toCharArray();
    scan.close();
    if (c1.length != c2.length) {
      System.out.print("they are not anagrams:");
    } else {
      Arrays.sort(c1);
      Arrays.sort(c2);
      boolean are_not_anagrams = false;
      int len = c1.length;
      for (int i = 0; i < len; i++) {
        if (c1[i] != c2[i]) {
          System.out.println("The given words not Anagrams");
          are_not_anagrams = true;
          break;
        }
      }
      if (!are_not_anagrams) {
        System.out.println("The given words are Anagrams");
      }
    }
  }
}

class Grid {
  public static void main(String[] args) {
    int row, col;
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the number of rows:");
    row = sc.nextInt();
    System.out.print("Enter the number of columns:");
    col = sc.nextInt();
    char grid[][] = new char[row][col];
    for (int i = 0; i < row; i++) {
      for (int j = 0; j < col; j++) {
        System.out.print("enter the element at index " + i + " " + j + ":");
        grid[i][j] = sc.next().charAt(0);
      }
    }
    System.out.println("the grid is:");
    for (int i = 0; i < row; i++) {
      for (int j = 0; j < col; j++) {
        System.out.print(grid[i][j] + " ");
      }
      System.out.println();
    }
    String word = new String();
    System.out.print("Enter the word(length less than" + " " + (row+1) + "):");
    boolean found = false;
    word = sc.next();
    sc.close();
    char word_array[] = word.toCharArray();
    int no_of_letters_equal = 0;
    if (word.length() <= row) {
      for (int i = 0; i < row; i++) {
        for (int j = 0; j < col; j++) {
          if (grid[i][j] == word_array[no_of_letters_equal]) {
            no_of_letters_equal++;
            if (word_array.length - no_of_letters_equal <= col - 1 - j) {
              if (word_array.length == no_of_letters_equal) {
                found = true;
                System.out.println("The given word is present.");
              }
            } else {
              break;
            }
          } else {
            no_of_letters_equal = 0;
          }
        }
        if (found == true) {
          break;
        }
      }
    }
    if (found == false && word.length() <= col) {
      for (int i = 0; i < col; i++) {
        for (int j = 0; j < row; j++) {
          if (grid[j][i] == word_array[no_of_letters_equal]) {
            no_of_letters_equal++;
            if (word_array.length - no_of_letters_equal <= row - 1 - j) {
              if (word_array.length == no_of_letters_equal) {
                found = true;
                System.out.println("The given word is present.");
              }
            } else {
              break;
            }
          } else {
            no_of_letters_equal = 0;
          }
        }
        if (found == true) {
          break;
        }
      }
    }
    if (found == false) {
      System.out.println("the given word is not present");
    }
  }
}
