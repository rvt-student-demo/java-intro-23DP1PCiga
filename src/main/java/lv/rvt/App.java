package lv.rvt;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.nio.file.StandardOpenOption;
import java.util.Scanner;
import java.util.ArrayList;

public class App 
{
 public static void main(String[] args) throws Exception{

 BufferedWriter writer = Helper.getWriter("person.csv" , StandardOpenOption.APPEND);
 
 Person person = new Person("Rost", 23, 95, 190);
 PersonManager.addPerson(person);
 
}
}


