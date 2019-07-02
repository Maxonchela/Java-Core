package string_homework;

public class String_Check {
    public String word;

    public String_Check(String word) {
        this.word = word;
    }

    boolean palindrome() {
        int n = this.word.length();
        for (int i = 0; i < (n/2); ++i) {
            if (this.word.charAt(i) != this.word.charAt(n - i - 1)) {
                return false;
            }
        }
        return true;
    }
}
