package lv.rvt.seondsem;

public class Book implements Packatables {
private String author;
private String nameBook;
private double weight;

public Book (String author, String nameBook , double weight){
    this.author= author;
    this.nameBook = nameBook;
    this.weight = weight;
}

@Override
public double weight(){
    return this.weight;
}

@Override
public String toString(){
    return this.author +  ","  +  this.nameBook +  ","  + this.weight;
}

}
