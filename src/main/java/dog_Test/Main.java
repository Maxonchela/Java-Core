package dog_Test;

public class Main {
    public static void main(String[] args) {
       Dog dog = new Dog("Max");
       dog.putCollar();
       dog.putMuzzle();
       dog.takeLeash();
       try{
           dog.walk();
       }
       catch (Exception e){
           System.out.println(e.getMessage());
           System.out.println("Проверяем экиперовку собаки. Ошейник надет? " + dog.testCollar + " Поводок взяли? " + dog.testLeash + " Намордник надели? " + dog.testMuzzle);
       }
    }
}
