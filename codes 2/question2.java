import java.util.Scanner;

public class question2 {
    public static void main(String[] args) {
        // Given a string s, the task is to reverse the string. Reversing a string means rearranging the characters such that the first character becomes the last, the second character becomes second last and so on.
        Scanner scn = new Scanner(System.in);
        String s = scn.next();
        StringBuilder sb = new StringBuilder(s);
        System.out.println(sb.reverse());
        scn.close();
    }
}
