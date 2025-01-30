package lv.rvt.seondsem;

public class ProductWarehouse extends Warehouse {
private String productName;


public ProductWarehouse(String productName, double capacity){
    super(capacity);
    this.productName = productName;
}

public String getName(){
    return this.productName;
}
}