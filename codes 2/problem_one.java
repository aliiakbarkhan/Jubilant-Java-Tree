import java.util.*;

public class problem_one {
    public static void main(String[] args) {
        //Write a Java program to append the specified element to the end of a hash set.
        HashSet<String> ali = new HashSet<>();
        ali.add("A");
        ali.add("B");
        ali.add("C");
        ali.add("D");
        ali.add("E");
        ali.add("F");
        ali.add("G");
        ali.add("H");
        ali.add("J");
        ali.add("K");
        Iterator it = ali.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
