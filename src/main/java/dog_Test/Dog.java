package dog_Test;

public class Dog{
    private boolean testCollar;
    private boolean testMuzzle;
    private boolean testLeash;
    private String name;

    public Dog(String name){
        this.name = name;
    }

//    public void putCollar(){
//        System.out.println("Ошейник надет!");
//        this.testCollar = true;
//    }
//
//    public void putMuzzle(){
//        System.out.println("Намордник надет!");
//        this.testMuzzle = true;
//    }
//
//    public void takeLeash(){
//        System.out.println("Ошейник взяли!");
//        this.testLeash = true;
//    }

    public void setTestCollar(boolean testCollar) {
        this.testCollar = testCollar;
    }

    public void setTestLeash(boolean testLeash) {
        this.testLeash = testLeash;
    }

    public void setTestMuzzle(boolean testMuzzle) {
        this.testMuzzle = testMuzzle;
    }

    public boolean getCollar(){
        return testCollar;
    }

    public boolean getMuzzle(){
        return testMuzzle;
    }

    public boolean getLeash(){
        return testLeash;
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
