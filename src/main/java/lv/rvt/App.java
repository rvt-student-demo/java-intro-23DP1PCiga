package lv.rvt;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.nio.file.StandardOpenOption;
import java.util.Scanner;
import java.util.ArrayList;

public class App {
public static void main(String[] args) {
    Box box = new  Box( 2.5, 5.0, 6.0 ) ;
    Box box2 = new Box(box);
    System.out.println("Area: "+ box.area() + " volume: "+box.volume());
    System.out.println( "length: " + box.length() + " height: " + box. height() +" width:  " + box.width() )  ;

    System.out.println( "Area: "  + box.area() + " volume: " + box. volume() );
    System.out.println( "topArea: "  + box.top() );
    
   Box box3 = new Box(box.biggerBox(box));
   System.out.print("big box " + "width: "+ box3.width() + ", height " + box3.height() + ", lenght: " + box3.length() );

   Box box4 = new Box(box.smallerBox(box));
   System.out.print("small box " + "width: "+ box3.width() + ", height " + box3.height() + ", lenght: " + box3.length() );

   System.out.println(box4.nests(box));

}
}



