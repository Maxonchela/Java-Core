package personTest;

import java.util.Arrays;

public class Person implements Comparable <Person> {
    public String name;
    public String surname;
    public int age;

    public Person(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public int compareTo(Person person) /*Что я тут передаю?...*/ {
        // How can i realize it  проще
        int compareWithName = this.name.compareTo(person.name);
        int compareWitSurname = this.surname.compareTo(person.surname);
        int compareWithAge = this.age > person.age ? -1 : 1;
        if(compareWithName != 0) {
            return compareWithName;
        } else if (compareWitSurname != 0) {
            return compareWitSurname;
        } else {
            return compareWithAge;
        }
    }

    public static void printPersons(Person[] persons){
        System.out.println("Выводим Людей");
        for (int i = 0; i < persons.length; i++) {
            System.out.println(persons[i].name + " " + persons[i].surname + " " +persons[i].age);

        }
    }
}
