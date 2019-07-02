package string_homework;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner palindrom = new Scanner(System.in);
        String word = palindrom.nextLine();

        String_Check cheking = new String_Check(word);
        System.out.println(cheking.palindrome());
    }
}
