package interfaces;

public class Man implements Talkable, Comparable<Man> {
    private String name;
    private int age;

    public Man(String name, int age){
        this.name = name;
        this.age = age;
    }

    public void talk(){
        System.out.println("I'm the real man");
    }

    public int compareTo(Man man) {
        return this.age - man.age;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }
}
