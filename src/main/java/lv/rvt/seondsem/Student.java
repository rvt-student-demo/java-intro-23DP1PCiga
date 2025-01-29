package lv.rvt.seondsem;

public class Student extends Person {
    private  int credits;
    
    public Student (String name , String addresse ){
        super(name , addresse);
    }
    public  int Study(){
        credits++;
        return credits ; 
    }
    public int Credit(){
        return credits;
    }
public String toString(){
    return super.toString() + "\n\t" +"Stusy creduts: "+ this.credits;
}
}