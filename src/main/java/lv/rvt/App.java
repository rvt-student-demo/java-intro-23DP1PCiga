package lv.rvt;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.util.Scanner;
public class App 
{
  public static void main(String[] args) {
    printStars(5);
    printStars(3);
    printStars(9);

    printSquare(4);

    printRectangle(17, 3);

    printTriangle(4);
}
    public static void printStars(int number){
      for (int i=0; i<=number ; i++){
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
}

        
   
