package dog_Test;

public class Dog{
    public boolean testCollar;
    public boolean testMuzzle;
    public boolean testLeash;
    public String name;

    public Dog(String name){
        this.name = name;
    }

    public void putCollar(){
        System.out.println("Ошейник надет!");
        this.testCollar = true;
    }

//    public void putCollar() {
//
//        System.out.println("Ошейник надет!");
//        this.isCollarPutOn = true;
//    }

    public void putMuzzle(){
        System.out.println("Намордник надет!");
        this.testMuzzle = true;
    }

    public void takeLeash(){
        System.out.println("Ошейник взяли!");
        this.testLeash = true;
    }

    public void walk() throws Exception {
        System.out.println("Going for a walk?");
        if(testLeash && testMuzzle && testCollar){
            System.out.println("Everything OK - GO!");
        }
        else {
            throw new Exception("Dog " + name + " don't ready for a walk");
        }
    }
}
