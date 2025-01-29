package lv.rvt;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Arrays;

import lv.rvt.seondsem.Person;

public class PersonManager {
public static ArrayList <Person> getPersonList() throws Exception {
ArrayList<Person> persons = new ArrayList<>();

BufferedReader reader = Helper.getReader("person.csv");
reader.readLine();

String line;
while((line = reader.readLine()) != null){
    String [] parts = line.split(", ");
    Person person = new Person(parts[0] ,Integer.valueOf(parts[1]) , Integer.valueOf(parts[2]), Integer.valueOf(parts[3] ) , "unknown");
    persons.add(person);
}
return persons;
}

public static void addPerson(Person person) throws Exception{
BufferedWriter writer = Helper.getWriter("person.csv" , StandardOpenOption.APPEND);
writer.write(person.toString());
writer.newLine();
writer.close();
}
}
