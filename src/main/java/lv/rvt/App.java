package lv.rvt;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.util.Scanner;
public class App 
{
    public static void main( String[] args )
    {
      Scanner scanner = new Scanner(System.in);
      int n= 0;
      int summa = 0;
      while (true) {
      System.out.println("Give a number :");
      int number = Integer.valueOf(scanner.nextLine());
      if (number >0){
        summa = summa + number;
        n = n +1 ;
      }

      if (number == 0) {
          break;
      }

      if (number < 0) {
          summa = summa + number;
          n = n +1 ;
        
      }

      
    }
       System.out.println("Number of numbers: " + n);
       System.out.println("Sum of the numbers: " + summa);


    }
}

        
   
