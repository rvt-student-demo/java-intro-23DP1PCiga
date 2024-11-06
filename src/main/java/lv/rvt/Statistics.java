package lv.rvt;

public class Statistics {
    private int count;
    private double sum;
   
    public Statistics() {
        
        
    }

    public void addNumber(int number) {
        this.count++;
      
    }

    public int getCount() {
        return this.count;
    }
}
