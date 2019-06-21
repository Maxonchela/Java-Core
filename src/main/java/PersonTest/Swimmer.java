package PersonTest;

public class Swimmer implements Walkable{

    public void walk(int distance) {
        if(distance > MAX_WALK_DISTANCE){
            System.out.println("Если ты столько сам проплывешь, я выгрызу тебе памятник зубами из гранита");
        }
        else{
            System.out.println("Плывем: " + distance + "килиметров");
        }
    }
}
