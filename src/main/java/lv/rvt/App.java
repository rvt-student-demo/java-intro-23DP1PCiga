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

System.out.println("Sveiki, lūdzu izvēlies komandu");
System.out.println("show - parādīt visas personas");
System.out.println("add - pievienot personu");
String userCommand = scanner.nextLine();

if (userCommand.equals("add")){

System.out.println("Enter your name: ");
String name = scanner.nextLine();

System.out.println("Enter your age: ");
String age = scanner.nextLine();

System.out.println("Enter your weight: ");
String weight = scanner.nextLine();

System.out.println("Enter your height: ");
String height = scanner.nextLine();

Person person = new Person(name, Integer.valueOf(age) , Double.valueOf(weight) , Double.valueOf(height));
PersonManager.addPerson(person);

System.out.println("Paldies par reģistrāciju!");
} else if(userCommand.equals("show")){
    ArrayList<Person> persons = PersonManager.getPersonList();
    for (Person person : persons ){
        System.out.println(person);
    }
   }
 }
}


