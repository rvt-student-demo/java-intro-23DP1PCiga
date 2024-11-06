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
  
  Statistics viens =new Statistics();

  while(num !=-1){
  viens.addNumber(num) ;
   num = Integer.valueOf(scanner.nextLine()) ;
   }  
   System.out.println("Sum: "+ viens.sum());
  }
 }
}