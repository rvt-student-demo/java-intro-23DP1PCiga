package lv.rvt;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.nio.file.StandardOpenOption;
import java.security.cert.PolicyQualifierInfo;
import java.util.Scanner;

import lv.rvt.seondsem.Person;
import lv.rvt.seondsem.ProductWarehouse;
import lv.rvt.seondsem.ProductWarehouseWithHistory;
import lv.rvt.seondsem.Student;
import lv.rvt.seondsem.Teacher;

import java.util.ArrayList;

public class App {
public static void main(String[] args) {
// the usual:
ProductWarehouseWithHistory juice = new ProductWarehouseWithHistory("Juice", 1000.0, 1000.0);
juice.takeFromWarehouse(11.3);
System.out.println(juice.getName()); // Juice
juice.addToWarehouse(1.0);
System.out.println(juice);           // Juice: balance = 989.7, space left 10.3

// etc

// however, history() still doesn't work properly:
System.out.println(juice.history()); // [1000.0]
// so we only get the initial state of the history set by the constructor...
}
}



