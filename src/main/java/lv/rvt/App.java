package lv.rvt;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.nio.file.StandardOpenOption;
import java.util.Scanner;
import java.util.ArrayList;

public class App 
{
 public static void main(String[] args) throws Exception{
Scanner scanner = new Scanner(System.in);
Boolean isProgramRunning = true;

String userCommand = null;
 while(true){
    String command = scanner.nextLine();
    if (command.equals("exit")){
       System.out.println("Thanks , bye bye!");
       isProgramRunning = false;
    } 
    else if (command.equals("show")){
        ArrayList<Person> persons = PersonManager.getPersonList(); 


        String name = "Name";
        String age = "Age";
        String weight = "Weight";
        String height = "Height";
        String bmi = "Body mass index";

        System.out.println("--------------------------------------------------------------------");
        System.out.printf("%-20s| " , name);
        System.out.printf("%-5s| " , age);
        System.out.printf("%-10s| " , weight);
        System.out.printf("%-9s| " , height);
        System.out.printf("%-15s| " , bmi);
        System.out.println();
        for (Person person : persons){
            System.out.println("----------------------------------------------------------------");
            System.out.printf("%-20s| ", person.getName());
            System.out.printf("%-5d| ", person.getAge());
            System.out.printf("%-10.2f| ", person.getWeight());
            System.out.printf("%-9.2f| ", person.getHeight());
            System.out.printf("%-15.2f| ", person.bodyMassIndex());
            System.out.println();
        } 
   
    } 
    else if (command.equals("help")){
        System.out.println("Ir 4 iespējamas komandas : show , add , help un exit.");
    }
    else if (command.equals("add")){
        System.out.println("Enter your name : ");
        String name = scanner.nextLine();
        System.out.println("Enter your age : ");
        String age = scanner.nextLine();
        System.out.println("Enter your weight: ");
        String weight = scanner.nextLine();
        System.out.println("Enter your height : ");
        String height = scanner.nextLine();
        Person person = new Person(name  ,Integer.valueOf(age) , Double.valueOf(weight), Double.valueOf(height));
        PersonManager.addPerson(person);
    }
    System.out.println("Your command was: " + command);
  }
 }
}

