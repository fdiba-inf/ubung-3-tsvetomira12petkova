package exercise3;

import java.util.Scanner;

public class NumberCounter {
  public static void main (String[] args) {
        Scanner input = new Scanner(System.in);

      int count = 0;
      int positive = 0;
      int negative = 0;
      int sum = 0;
      int ave = 0;
      int n = input.nextInt();

      while (n!=0) {
        if (n>0){
          System.out.println ("Positive Number");
          

      }else 
        System.out.println ("Negative Number");

      count++;
      sum = sum + n;
      ave = sum/count;
      n = input.nextInt();
      }
      System.out.println("Sum is: " + sum);
      System.out.println("Average is: " + ave);
    
    }

}