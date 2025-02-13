package lv.rvt;

import lv.rvt.seondsem.Book;
import lv.rvt.seondsem.CD;

public class Box {
private double width;
private double height;
private double length;


public Box (double width, double height, double length){
    this.height = height;
    this.width = width;
    this.length = length;

}
public Box ( double side ){
    this.width = side;
    this.height = side;
    this.length = side;
}
public double volume(){
    return this.width * this.height * this.length;
}
public double area(){
return 2 * faceArea() + 2 * topArea() + 2 * sideArea() ;                    
}
public double width(){
    return this.width;
}
public double height(){
    return this.height;
}
public double length(){
    return this.length;
}

//2.dala
private double faceArea(){
    return this.width * this.height;
}
private double topArea(){
    return this.length* this.width;
}
private double sideArea(){
    return this.length * this.height;
}
public double face(){
    return faceArea();
}
public double top(){
    return topArea();
}
public double side(){
    return sideArea();
}

//3.dala
public Box( Box oldBox ){
    this.height = oldBox.height;
    this.width = oldBox.width;
    this.length = oldBox.length;  
}

//4.dala
public Box biggerBox( Box oldBox ){
    return new Box( 1.25*oldBox.width() , 1.25*oldBox.height() , 1.25*oldBox.length());
}
public Box smallerBox( Box oldBox ){
    return new Box( 0.75*oldBox.width() , 0.75*oldBox.height() , 0.75*oldBox.length());
}

//5.daļa
public boolean nests( Box outsideBox){
    if (this.height < outsideBox.height &&
        this.length < outsideBox.length &&
        this.width < outsideBox.width){
            return true;
        }
    return false;
}
public void add(Book book) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'add'");
}
public void add(CD cd) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'add'");
}
}
