package exaption;

public class Main {
    public static void main(String[] args) throws Exception {
        TryMakeError tryMakeError = null;
        try {
            int array[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
            System.out.println(array[11]);
            tryMakeError = new TryMakeError("My failed feild");
            tryMakeError.failedMethod();

        }
        catch (ArrayIndexOutOfBoundsException err){
            System.out.println("Вы вышли за пределы массива");
        }
        catch (ExceptionInInitializerError never){
            System.out.println("Не существющая ошибка");
        }
        finally {
            System.out.println(2 + 2 + " "+ "Это блок finally");
            System.out.println(tryMakeError.toString());
        }

    }
}
