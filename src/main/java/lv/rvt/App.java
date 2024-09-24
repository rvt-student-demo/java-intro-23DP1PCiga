package lv.rvt;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.util.Scanner;
public class App 
{
    public static void main( String[] args )
    {
      Scanner scanner = new Scanner(System.in);
      int end = Integer.valueOf(scanner.nextLine());
      int start = 0 ;
      for (int i = end; i > 0; i--) {
        start=start+end ;
      }
      System.out.println(start);
    
}
}
        
   
