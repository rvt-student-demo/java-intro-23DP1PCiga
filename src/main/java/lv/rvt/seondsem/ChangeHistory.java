package lv.rvt.seondsem;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class ChangeHistory {
private ArrayList <Double> records;

public ChangeHistory(){
    this.records = new ArrayList<>();
}

public void add (double status){
    this.records.add(status);
}

public void clear(){
    this.records.clear();
}

public String toString(){
    return this.records.toString();
}

public double maxValue(){
    double max =this.records.get(0);
    for (double value: records){
        if (value > max){
            max = value;
        }
    }
    return max;
}

public double minValue(){
    double min =this.records.get(0);
    for (double value: records){
        if (value < min){
            min = value;
        }
    }
    return min;
}

public double average(){
    double sum = 0;
    double cip = 0;
    for (double value: records){
        sum = sum +  value;
        cip++;
    }
    return sum/cip;
}
}
