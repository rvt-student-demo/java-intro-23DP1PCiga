package lv.rvt;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.nio.file.StandardOpenOption;
import java.security.cert.PolicyQualifierInfo;
import java.util.Scanner;

import lv.rvt.seondsem.Person;
import lv.rvt.seondsem.Student;
import lv.rvt.seondsem.Teacher;

import java.util.ArrayList;

public class App {
public static void main(String[] args) {

   Student ollie = new Student("Ollie", "6381 Hollywood Blvd. Los Angeles 90028");
   System.out.println(ollie);
   System.out.println("Study credits " + ollie.Credit());
   ollie.Study();
   System.out.println("Study credits "+ ollie.Credit());
}
}



