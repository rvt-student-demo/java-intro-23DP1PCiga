package lv.rvt;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.nio.file.StandardOpenOption;
import java.security.cert.PolicyQualifierInfo;
import java.util.Scanner;

import lv.rvt.seondsem.Book;
import lv.rvt.seondsem.Person;
import lv.rvt.seondsem.ProductWarehouse;
import lv.rvt.seondsem.ProductWarehouseWithHistory;
import lv.rvt.seondsem.Student;
import lv.rvt.seondsem.Teacher;

import java.util.ArrayList;

public class App {
public static void main(String[] args) {
 Book book1 = new Book("Fyodor Dostoevsky", "Crime and Punishment", 2);
    Book book2 = new Book("Robert Martin", "Clean Code", 1);
    Book book3 = new Book("Kent Beck", "Test Driven Development", 0.5);

    CD cd1 = new CD("Pink Floyd", "Dark Side of the Moon", 1973);
    CD cd2 = new CD("Wigwam", "Nuclear Nightclub", 1975);
    CD cd3 = new CD("Rendezvous Park", "Closer to Being Here", 2012);

    System.out.println(book1);
    System.out.println(book2);
    System.out.println(book3);
    System.out.println(cd1);
    System.out.println(cd2);
    System.out.println(cd3);
}
}



