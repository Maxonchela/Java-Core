package interfaces;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//        Talkable talkableAnimal = new Cow();
//        talkableAnimal.talk();

        Talkable talkable = new Cow();
        talkable.talk();

        Milkable milkable = new Cow();
        milkable.getMilk();

        Cow masterCow = new Cow();
        masterCow.talk();
        masterCow.getMilk();

//        Man man = new Man("Max");
////        man.talk();

        Man manYanis = new Man("Yanis", 60);
        Man manMax = new Man("Max", 23);

        Man[] mans = new Man[]{manYanis, manMax};
        printArray(mans);
        System.out.println("Отсортировали мужиков");
        Arrays.sort(mans);
        printArray(mans);


    }

    public static void printArray(Man[] mans){
        System.out.println("Вывод мужиков");
        for (int i = 0; i < mans.length; i++){
            System.out.println(mans[i].getName() + ", " + mans[i].getAge());
        }
    }
}
