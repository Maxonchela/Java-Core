package interfaces;

public class Person {

    private String name;
    private String surname;
    private int age;

    public Person(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;

    }

    String getName(){
        return name;
    }

    public int compareTo(Person p){

        return name.compareTo(p.getName());
    }
}
