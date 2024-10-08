package lv.rvt;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.util.Scanner;
public class App 
{
  public static void main(String[] args) {
   
    christmasTree(4);
    
}

    
//star sign
public static void printStars(int number){
      for (int i=0; i<number ; i++){
        System.out.print("*");
      }
      System.out.println();
    }


   public static void printSquare(int size) {
    int i =0;
    while(i<size){
      printStars(size);
      i++;
    }
   }


   public static void printRectangle(int width, int height){
    int i = 0;
    while (i<height){
      printStars(width);
      i++;
    }
   }


public static void printTriangle(int size) {
  int i = 0;
  while(i < size  ){
    printStars(i);
    i++;
   }
 }





//Advanced astrology (3 parts)
 public static void printSpaces(int number){
  for (int i=0; i<=number ; i++){
    System.out.print(" ");
  }
}
 
public static void printTriangleTwo(int size) {
 for(int i=0; i<=size ;i++){
  printSpaces(size-i);
  printStars(i);
  
  }
 }

 public static void christmasTree(int height){
 for(int i=1; i<=height ;i++){
    printSpaces(height-i);
    printStars((i*2)-1);
  }
  for(int i = 0; i<2 ;i++){
    printSpaces(height-2);
    printStars(3);
  }
 }
}
        
   
