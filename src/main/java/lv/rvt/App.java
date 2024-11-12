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
    card.eatAffordably();
        System.out.println(card);

        card.eatHeartily();
        card.eatAffordably();
        System.out.println(card);
  }
 }
}