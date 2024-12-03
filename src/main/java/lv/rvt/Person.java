package lv.rvt;

public class Person {
    private String name;
    private int age;
    private int height;
    private int weight;

    public Person(String name , int age, int weight ,int height){
    this.name=name;
    this.age = age;
    this.height = height;
    this.weight = weight;
    }

    public Person(String name){
        this(name,0,0,0 );
    }

    @Override
    public String toString() {
        return this.name + ", age " + this.age + " , weight " + this.weight + ", height" + this.height;
    }
    public double maximumHeartRate(){
        return 206.3 - (0.711 * this.age);
    }
    
    public void growOlder() {
    this.age = this.age + 1;
    }   

    public void growOlder(int years){
        this.age = this.age + years;   
    }

    public int returnAge(){
        return this.age;
    }

    public boolean isOfLegalAge() {
        return this.age >=18;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }
    public void setHeight(int newHeight) {
        this.height = newHeight;
    }

    public void setWeight(int newWeight) {
        this.weight = newWeight;
    }

    public void setAge(int newAge){
        this.age = newAge;
    }
    public double bodyMassIndex() {
        double heigthPerHundred = this.height / 100.0;
        return this.weight / (heigthPerHundred * heigthPerHundred);
    }

}