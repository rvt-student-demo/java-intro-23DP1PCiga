package lv.rvt;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.util.Scanner;
import java.util.ArrayList;

public class App 
{
 
  public class MainProgram {
  public static void main(String[] args) {
    PaymentCard card = new PaymentCard(50);
    System.out.println(card);
    card.addMoney(15);
    System.out.println(card);

    card.addMoney(10);
    System.out.println(card);

    card.addMoney(200);
    System.out.println(card);
  }
 }
}