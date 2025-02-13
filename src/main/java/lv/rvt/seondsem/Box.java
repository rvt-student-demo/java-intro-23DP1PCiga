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
    double weight = 0;
    for (Packatables packatables : weighttable) {
        weight += packatables.weight();
    }
    return weight;
}
public void add (Packatables weighttable){
    double currentWeight = weight();
    if(this.compacity > currentWeight + weighttable.weight()){
        this.weighttable.add(weighttable);
    }

}

@Override
public String toString(){
    return "Box: " + this.weighttable.size() +  " ,total weight " + weight();
}

}
