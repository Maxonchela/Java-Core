package PersonTest;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("Anatoliy", "Avanuk", 23);
        Person person2 = new Person("Cella", "Zaun", 28);
        Person person3 = new Person("Boris", "Burda", 28);
        Person person4 = new Person("Cella", "Daun", 26);
        Person person5 = new Person("Cella", "Daun", 28);

        Person[] persons = new Person[]{person1, person2, person3, person4, person5};
        printPersons(persons);
        System.out.println("Теперь отсортированный");
        Arrays.sort(persons);
        printPersons(persons);
    }

    public static void printPersons(Person[] persons){
        System.out.println("Выводим Людей");
        for (int i = 0; i < persons.length; i++) {
            System.out.println(persons[i].name + " " + persons[i].surname + " " +persons[i].age);
        }
    }
}
