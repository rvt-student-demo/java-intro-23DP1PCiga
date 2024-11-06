package lv.rvt;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.util.Scanner;
import java.util.ArrayList;

public class App 
{
 
  public class MainProgram {
  public static void main(String[] args) {
  Scanner scanner = new Scanner(System.in) ;
  int num =0;
  
  Statistics sum =new Statistics();
  Statistics even =new Statistics();
  Statistics odd =new Statistics();

  while(num !=-1){
  sum.addNumber(num) ;
  num = Integer.valueOf(scanner.nextLine()) ;
  if (num % 2 == 0) {
    even.addNumber(num);
  } 
  if (num % 2 == 1){
    odd.addNumber(num);
  }

  }
  
   System.out.println("Sum: "+ sum.sum() );
   System.out.println(" Sum of even numbers: " + even.sum()) ;
   System.out.println(" Sum of odd numbers: " + odd.sum());
  }
 }
}