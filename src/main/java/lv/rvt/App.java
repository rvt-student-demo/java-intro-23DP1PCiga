package lv.rvt;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.nio.file.StandardOpenOption;
import java.security.cert.PolicyQualifierInfo;
import java.util.Scanner;

import lv.rvt.seondsem.Person;
import lv.rvt.seondsem.Teacher;

import java.util.ArrayList;

public class App {
public static void main(String[] args) {

   Person ada = new Person("Ada Lovelace", "24 Maddox St. London W1S 2QN");
   Person esko = new Person("Esko Ukkonen", "Mannerheimintie 15 00100 Helsinki");
   System.out.println(ada);
   System.out.println(esko);
}
}



