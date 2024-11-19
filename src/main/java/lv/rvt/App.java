package lv.rvt;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.util.Scanner;
import java.util.ArrayList;

public class App 
{
 
public static void main(String[] args) throws Exception {
  DecreasingCounter counter= new DecreasingCounter(10);
  DecreasingCounter counter1= new DecreasingCounter();

  counter.decrement();
  counter.increase();
  counter.increase();

  counter1.decrement();
  counter1.decrement();
  counter1.increase();

  counter.printValue();
  counter1.printValue();

  }
}

