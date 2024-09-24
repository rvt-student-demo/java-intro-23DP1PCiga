package lv.rvt;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.util.Scanner;
public class App 
{
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Value of the gift? ");
        int gift= Integer.valueOf(scanner.nextLine());
        if( gift >5000 ) {
        System.out.println("No tax!");
        } else if (25000 > gift) {
            double tax = (100 + (gift-5000)*0.08);
            System.out.println("Tax: " + gift );
        } else if (55000 > gift) {
            double tax = (1700 + (gift-25000)*0.1);
            System.out.println("Tax: " + gift );}
          else if (200000 > gift) {
            double tax = (4700 + (gift-55000)* 1.2);
            System.out.println("Tax: " + gift );}
          else if (1000000 > gift) {
            double tax = (22100 + (gift-200000)*1.5);
            System.out.println("Tax: " + gift );}
          else if (gift > 1000000) ;{
            double tax = (142100 + (gift-1000000)*1.7);
            System.out.println("Tax: " + gift );}


    }
}

        
   
