package sample.model;

import javafx.beans.property.*;


public abstract class Part {

    private final IntegerProperty teaLeafId;
    private final StringProperty teaName;
    private final IntegerProperty discoveryDate;
    private final IntegerProperty inStock;
    private final IntegerProperty min;
    private final IntegerProperty max;

    //full constructor
    public Part(){
        teaLeafId  = new SimpleIntegerProperty();
        teaName = new SimpleStringProperty();
        discoveryDate = new SimpleIntegerProperty();
        inStock  = new SimpleIntegerProperty();
        min = new SimpleIntegerProperty();
        max = new SimpleIntegerProperty();
    }

    //getters
    public Integer getPartId() {
        return teaLeafId.get();
    }

    public IntegerProperty partIdProperty() {
        return teaLeafId;
    }

    public String getName() {
        return teaName.get();
    }

    public StringProperty nameProperty() {
        return teaName;
    }

    public double getPrice() {
        return discoveryDate.get();
    }

    public IntegerProperty priceProperty() {
        return discoveryDate;
    }

    public int getInStock() {
        return inStock.get();
    }

    public IntegerProperty inStockProperty() {
        return inStock;
    }

    public int getMin() {
        return min.get();
    }

    public IntegerProperty minProperty() {
        return min;
    }

    public int getMax() {
        return max.get();
    }

    public IntegerProperty maxProperty() {
        return max;
    }



    //setters
    public void setPartId(int partId) {
        this.teaLeafId.set(partId);
    }

    public void setName(String name) {
        this.teaName.set(name);
    }

    public void setPrice(int price) {
        this.discoveryDate.set(price);
    }

    public void setInStock(int inStock) {
        this.inStock.set(inStock);
    }

    public void setMin(int min) {
        this.min.set(min);
    }

    public void setMax(int max) {
        this.max.set(max);
    }



    //validate usable part
    public static String isValidPart(String name, int min, int max, int inv, double price, String error){
        if(name == null){
            error = error +"Name field is required.";
        }
        else if(inv < 1){
            error = error + "The inventory number cannot be less than 1.";
        }
        else if(price <= 0){
            error = error + "Enter a valid year";
        }
        else if(min > max){
            error = error + "The minimum cannot be greater than the maximum";
        }
        else if(inv < min || inv > max){
            error = error + "The inventory must be between min and max";
        }
        return error ;
    }
}