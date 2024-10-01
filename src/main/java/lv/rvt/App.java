package lv.rvt;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.util.Scanner;
public class App 
{
    public static void main( String[] args )
    {
      divisibleByThreeInRange(3, 6);
    }
    int start=1;
      public static void divisibleByThreeInRange(int start , int end){
        while(start< end+1) {
          if (start %3 ==0 ){
        System.out.println(start);
      }
      start++;
    }
  }
}

        
   
