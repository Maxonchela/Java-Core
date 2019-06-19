package wrapper;

public class Wrapper {
    public static void main(String[] args) {
        System.out.print("Перевожу обычное число: ");
        String number = "89112872553";
        Long a = Long.parseLong(number);
        System.out.println(a);

        System.out.println(" ");

        System.out.print("Перевожу дробное число: ");
        String pi = "3.1415926";
        Double b = Double.parseDouble(pi);
        System.out.print(b);

    }
}
