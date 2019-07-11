package dog_Test;

public class Main {
    public static void main(String[] args) {
       Dog dog = new Dog("Max");
       dog.setTestCollar(true);
       dog.setTestMuzzle(true);
       dog.setTestLeash(true);

       try{
           dog.walk();
       }
       catch (Exception e){
           System.out.println(e.getMessage());
           System.out.println("Проверяем экиперовку собаки. Ошейник надет? " + dog.getCollar() + " Поводок взяли? " + dog.getLeash() + " Намордник надели? " + dog.getMuzzle());
       }
    }
}
