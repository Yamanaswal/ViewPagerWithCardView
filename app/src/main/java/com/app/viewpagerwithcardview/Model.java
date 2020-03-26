package com.app.viewpagerwithcardview;


public class Model {

    private String appName;
    private String productName;
    private double price;
    private int productImage;

    public Model(String appName, String productName, double price, int productImage) {
        this.appName = appName;
        this.productName = productName;
        this.price = price;
        this.productImage = productImage;
    }

    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getProductImage() {
        return productImage;
    }

    public void setProductImage(int productImage) {
        this.productImage = productImage;
    }
}
