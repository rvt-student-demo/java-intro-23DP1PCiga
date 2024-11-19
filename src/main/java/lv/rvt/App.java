package lv.rvt;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.util.Scanner;
import java.util.ArrayList;

public class App 
{
 
public static void main(String[] args) throws Exception {
  Clock clock = new Clock();

while (true) {
    System.out.println(clock);
    clock.advance();
}
}
}

