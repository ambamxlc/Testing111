package com.win.TestScore.java;

public class Products {
    private String productName;
    private Double productCost;
    private Integer productQuantity;

    public Products( String productName, double productCost, Integer productQuantity ){
        this.productName = productName;
        this.productCost= productCost;
        this.productQuantity=productQuantity;
}
public void printProduct( ){
    System.out.println(this.productName + " cost "  + this.productCost + " and " + this.productQuantity + " were purchased." );
}
public void totalCost(){
    this.productCost *= this.productQuantity;
    System.out.println("Total cost is: "+ this.productCost);
}
}
