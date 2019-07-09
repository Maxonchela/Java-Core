package exaption;

public class TryMakeError {
    private String failedField;

    public TryMakeError(String failedField) {
        this.failedField = failedField;
        System.out.println(5/0);
    }

    public static void failedMethod() throws Exception {
        System.out.println("Now, i'm going to fall");
        throw new Exception();
    }
}
