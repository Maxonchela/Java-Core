package interfaces;

public class Cow implements Talkable, Milkable {

    public void talk() {
        System.out.println("MUUUU");
    }

    public void getMilk(){
        System.out.println("Не люблю молоко");
    }
}
