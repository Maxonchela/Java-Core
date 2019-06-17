package Max;

public class Cars {
    public static String brend;
    public static String color;
    public static double price;

    public static void main(String[] args) {
        Cars porche = new Cars("Porche", "Red", 200000);
        Cars ferrari = new Cars("Ferrari", "Yellow", 300000);
        Cars lamborgini = new Cars("Lambo", "Blue", 400000);

    }

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