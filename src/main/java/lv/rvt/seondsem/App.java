package lv.rvt.seondsem;

import lv.rvt.Money;

public class App {
    public static void main(String[] args) {
    
        Money a = new Money(10, 0);
        Money b = new Money(3, 5);
        Money c = new Money(3, 0);

        System.out.println(a.lessThan(b));  // false
        System.out.println(b.lessThan(c));  // true
    }
}



