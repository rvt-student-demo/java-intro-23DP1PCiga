package lv.rvt;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.util.Scanner;
public class App 
{
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);
        int input=Integer.valueOf(scanner.nextLine()) ; 
    }
    public static void printUntilNumber(int number ) {
      int i=0;
      while(i>number){
        System.out.println(i);
        i++;
      }
    }
  }
        
   
