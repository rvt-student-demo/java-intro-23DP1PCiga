package lv.rvt.seondsem;

import java.util.ArrayList;

public class Box implements Packatables{
private double compacity;
private ArrayList<Packatables> weighttable;

public Box(double compacity){
    this.compacity = compacity;
    this.weighttable = new ArrayList<>();
}

@Override
public double weight() {
    return this.weight();
}
public void add (Packatable weighttable){
    double currentWeight = weight();
    if(this.compacity > currentWeight + weighttable.weight()){
        this.weighttable.add((Packatables) weighttable);
    }

}

@Override
public String toString(){
    return "Box: " + this.weighttable.size() +  " ,total weight " + weight();
}

}
