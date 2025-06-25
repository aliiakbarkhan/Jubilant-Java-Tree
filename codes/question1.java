import java.util.Scanner;

public class question1 {
    public static void main(String[] args) {
        //Given a string s, the task is to check if it is palindrome or not.
        Scanner scn = new Scanner(System.in);
        String s = scn.next();
        StringBuilder sb = new StringBuilder(s);
        if (s.compareTo(sb.reverse().toString()) == 0) {
            System.out.println(s + " is palindrome as : " + sb);
        }
        else{
            System.out.println(s + " is not palindrome as : " + sb);

        }

        scn.close();
        }
}
