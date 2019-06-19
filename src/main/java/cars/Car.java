package cars;

public class Car {

    private String brend;
    private String color;
    private double price;

    public Car(String name, String color, int price){
        this.brend = brend;
        this.color = color;
        this.price = price;
    }

    public Car(){
    }

    public String getBrend(){
     return brend;
    }

    public String getColor(){
        return color;
    }

    public double getPrice(){
        return price;
    }

    public void setBrend(String brend){
        this.brend = brend;
    }

    public void setPrice(Double price){
        this.price = price;
    }

    public void setColor(String color){
        this.color = color;
    }


}