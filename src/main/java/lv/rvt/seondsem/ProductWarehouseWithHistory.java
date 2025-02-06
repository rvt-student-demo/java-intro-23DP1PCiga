package lv.rvt.seondsem;

public class ProductWarehouseWithHistory extends ProductWarehouse{
private double initialBalance;
private ChangeHistory history;
    public ProductWarehouseWithHistory(String productName, double capacity, double initialBalance){
        super(productName , capacity);
        super.addToWarehouse(initialBalance);
        this.history = new ChangeHistory();
       

    }
    public String history(){
        return this.history.toString();
    }
    
    @Override
    public void addToWarehouse(double amount){
    super.addToWarehouse(amount);
                        this.history.add(super.getBalance());
    }

    @Override
    public double takeFromWarehouse(double amount){
        super.addToWarehouse(amount);
                return amount;
       
    }

    public void printAnalysis(){
        System.out.println("Product:" + super.productName + "\n" + "History: "+ history() + "\n" + "Largest amount of product: "+ super.maxValue() + "\n" + "Smallest amount og product: " + super.minValue + "\n" + "Average: " + super.average());
    }

}
