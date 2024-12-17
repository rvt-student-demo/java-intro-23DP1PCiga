package lv.rvt;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.nio.file.StandardOpenOption;
import java.util.Scanner;
import java.util.ArrayList;

public class App 
{
    public class MainProgram {
        public static void main(String[] args) {
            PaymentTerminal unicafeExactum = new PaymentTerminal();
    
            double change = unicafeExactum.eatAffordably(10);
            System.out.println("remaining change: " + change);
    
            PaymentCard annesCard = new PaymentCard(7);
    
            boolean wasSuccessful = unicafeExactum.eatHeartily(annesCard);
            System.out.println("there was enough money: " + wasSuccessful);
            wasSuccessful = unicafeExactum.eatHeartily(annesCard);
            System.out.println("there was enough money: " + wasSuccessful);
            wasSuccessful = unicafeExactum.eatAffordably(annesCard);
            System.out.println("there was enough money: " + wasSuccessful);
    
            System.out.println(unicafeExactum);
        }
    }  

}




