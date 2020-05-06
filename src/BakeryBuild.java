import java.util.Arrays;
import java.util.ArrayList;

public class BakeryBuild {

    //Values declaration
    //All values are public. this is to avoid using getters and setters
    public String name;
    public double price;
    public String expDate;
    public ArrayList <String> dietRest;
    public int quantity;

    //constructor
    public BakeryBuild () {

    }

    //Overload constructor
    public BakeryBuild (String name, double price, String expDate,
                        ArrayList <String> dietRest, int quantity) {
        this.name = name;
        this.price = price;
        this.expDate = expDate;
        this.dietRest = dietRest;
        this.quantity = quantity;
        //this.totalPrice = totalPrice;
    }

    //toString method to display the bake
    public String toString () {
        return name + "\t\t" + dietRest + "\t\t\t\t\t" + expDate +
                "\t\t" + quantity + "\t\t$" + price + "\t\t $" + (price * quantity);
    }

}
