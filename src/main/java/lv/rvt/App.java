package lv.rvt;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.util.Scanner;
import java.util.ArrayList;

public class App 
{
    public static void main(String[] args) {
      Scanner scanner= new Scanner(System.in);

        ArrayList<Integer> intList = new ArrayList<>();

        int input = Integer.valueOf(scanner.nextLine());
        intList.add(input);

        int listSum=input;

        while(input!=0){
        input = Integer.valueOf(scanner.nextLine());
        listSum = listSum + input ;
        intList.add(input);
        
        }
        System.out.println(intList.get(0));
        System.out.println(listSum);
        
    }
}
