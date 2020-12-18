package sample.model;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;


public class OtherCountry extends Part {

    private final StringProperty countryName;




    //constructor calling the superconstructor and adding outsourced property

    public OtherCountry() {
        super();
        countryName = new SimpleStringProperty();
    }




    //getter and setter

    public void setCountryName(String countryName){
        this.countryName.set(countryName);
    }

    public String getCountryName(){
        return this.countryName.get();
    }
}
