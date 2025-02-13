package lv.rvt.seondsem;

public class CD implements Packatables{
private String name;
private String artists;
private int year;

public CD(String artists , String name ,int year){
this.name = name;
this.year = year;
this.artists = artists;

}

@Override
public double weight() {
return 0.1;
}

@Override
public String toString(){
    return this.artists +  ","  +  this.name +  ","  + this.year;
}

}
