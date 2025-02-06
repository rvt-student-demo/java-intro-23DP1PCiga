package lv.rvt.seondsem;

public class ProductWarehouse extends Warehouse {
protected String productName;
public String minValue;


public ProductWarehouse(String productName, double capacity){
    super(capacity);
    this.productName = productName;
}

public String getName(){
    return this.productName;
}

@Override
public String toString() {
    // TODO Auto-generated method stub
    return super.toString();
}

public String maxValue() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'maxValue'");
}

public String average() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'average'");
}}