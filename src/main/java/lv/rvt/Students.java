package lv.rvt;

import lv.rvt.seondsem.Person;

public class Students extends Person{
private int credits;

public Students(String name , String addres){
    super(name, addres);
    this.credits = credits;
}

public int getCredit(){
    return credits;
}
public void Study(){
this.credits = 0;
credits++;}

public int Credit(){
    return this.credits;
}
}
