package lv.rvt.seondsem;

public class Teacher extends Person {
    private int salary;
    public Teacher (String name , String address , int salary){
        super(name , address);
        this.salary = salary;
    }
    public String toString(){
        return super.toString() + "\n\t" +"Salary: "+ this.salary + "euro/nomth";
}
}
