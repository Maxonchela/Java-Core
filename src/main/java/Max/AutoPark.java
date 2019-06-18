package Max;

public class AutoPark extends Cars{
    private Cars[] cars = new Cars[3];

    public static void main(String[] args) {
        AutoPark autoPark = new AutoPark();

    }

    private static void createCar(){
        Cars porche = new Cars("Porche", "Red", 200000);
        Cars ferrari = new Cars("Ferrari", "Yellow", 300000);
        Cars lamborgini = new Cars("Lambo", "Blue", 400000);
    }




}
