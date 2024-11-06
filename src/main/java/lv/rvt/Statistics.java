package lv.rvt;

public class Statistics {
    private int count;
    private double sum;
    private int num;
   
    public Statistics() {
       this.count=count;
       this.sum=sum;     
    }
    public void addNumber(int number) {
        this.sum +=number;
        this.count++;  
    }
    public int getCount() {
        return this.count;
    }
    public double sum() {
        return this.sum;
    }

    public double average() {
        return this.sum / this.count;
    }
}
