package lv.rvt;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.nio.file.StandardOpenOption;
import java.security.cert.PolicyQualifierInfo;
import java.util.Scanner;

import lv.rvt.seondsem.Person;
import lv.rvt.seondsem.ProductWarehouse;
import lv.rvt.seondsem.Student;
import lv.rvt.seondsem.Teacher;

import java.util.ArrayList;

public class App {
public static void main(String[] args) {
ProductWarehouse juice = new ProductWarehouse("Juice", 1000.0);
juice.addToWarehouse(1000.0);
juice.takeFromWarehouse(11.3);
System.out.println(juice.getName()); // Juice
System.out.println(juice); 
}
}



