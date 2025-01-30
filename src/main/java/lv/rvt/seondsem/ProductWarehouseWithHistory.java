package lv.rvt.seondsem;

public class ProductWarehouseWithHistory extends ProductWarehouse{
private double initialBalance;
private ChangeHistory history;
    public ProductWarehouseWithHistory(String productName, double capacity, double initialBalance){
        super(productName , capacity);
        this.history = new ChangeHistory();

    }
    public String history(){
        return this.history.toString();
    }
}
