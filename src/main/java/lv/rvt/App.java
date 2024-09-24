package lv.rvt;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.util.Scanner;
public class App 
{
    public static void main( String[] args )
    {
      Scanner scanner = new Scanner(System.in);

      int start = Integer.valueOf(scanner.nextLine());
      int end = 101;
      for (int i = start; i < end; i++) {
      System.out.println(i);
    }
}
}
        
   
