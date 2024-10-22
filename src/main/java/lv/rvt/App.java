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

        while(input!=-1){
        input = Integer.valueOf(scanner.nextLine());
        intList.add(input);
      }

        System.out.print("From where? ");
        int input1 = Integer.valueOf(scanner.nextLine());

        System.out.print("To where? ");
        int input2 = Integer.valueOf(scanner.nextLine());

        for (int i = input1; i <=input2; i++ ){
          System.out.println(intList.get(i));
        }

    }

}
