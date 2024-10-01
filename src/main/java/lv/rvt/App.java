package lv.rvt;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.util.Scanner;
public class App 
{
    public static void main( String[] args )
    {
      Scanner reader = new Scanner(System.in);
      int sum = 0;
      int sk=0;
      int even=0;
      int odd=0;
      System.out.print("Write numbers : ");
      while (true) {
          int input = Integer.valueOf(reader.nextLine());
      
          if (input == -1) {
             break;
          }
          sum += input;
          sk++;
          if (input % 2 ==0){
            even++;
          }
      } 
      System.out.println("Thx! Bye!");
      System.out.println("Sum: " + sum );
      System.out.println("Numbers : " + sk);
      System.out.println("Average : " + ((double) sum/sk));
      System.out.println("Even :" + even);
      System.out.println("Odd : " +  (sk -even));
    }
  }
        
   
