package Max;

public class Cars {
    private String brend;
    private String color;
    private double price;

    public Cars(){

    }

    public Cars(String name, String color, int price){
        this.brend = brend;
        this.color = color;
        this.price = price;
    }

    public void setBrend(String brend){
        this.brend = brend;
    }

    public void setPrice(Double price){
        this.price = price;
    }

    public final String getColor(String color){
        return color;
    }
}