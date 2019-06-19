package figures;
import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //a,b,c - стороны треугольника
        System.out.println("Введите сторону а: ");
        int a = sc.nextInt();
        System.out.println("Введите сторону b: ");
        int b = sc.nextInt();
        System.out.println("Введите сторону c: ");
        int c = sc.nextInt();

        double g = (a + b + c)/2;
        System.out.println("Первое g = " + g);
        double square = Math.sqrt(g * (g - a) * (g - b) * (g - c));
        condition(square);
        System.out.println("Первый способ подсчета = " + square);

        double square2 = genereteTriangle(a, b ,c);
        condition(square2);

        System.out.println("Площадь круга = " + squareOfCircle(5));
    }

    public static void condition(double square){
        if(square <= 0){
            System.out.println("Такого треугольника не существует");
        }
        else {
            System.out.println("Площадь треугольника = " + square);
        }
    }

    public static double genereteTriangle (double first, double second, double third) {
        double g = (first + second + third)/2;
        double square2 = Math.sqrt(g * (g - first) * (g - second) * (g - third));

        System.out.println("Второе g = " + g);
        System.out.println("Второй способ подсчета = " + square2);
        return square2;
    }

    public static double squareOfCircle(double radius){
        double pi = 3.14;
        double squreOfCircle =  pi*(radius*radius);
        return squreOfCircle;
    }
}
