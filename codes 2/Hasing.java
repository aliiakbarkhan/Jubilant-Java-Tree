import java.util.HashSet;
import java.util.Iterator;

public class Hasing {
    public static void main(String[] args) {
        //creating
        HashSet<Integer> set = new HashSet<>();
        
        //insert
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(5);
        set.add(6);
        set.add(8);

        //size
        System.out.println("size of set: "+set.size());

        //print all elements
        System.out.println(set);

        //search - contains
        if(set.contains(1)){
            System.out.println("Set contain 1");
        }
        if (!set.contains(16)) {
            System.out.println("dose not contain 16");
        }

        //delete
        set.remove(1);

        if(!set.contains(1)){
            System.out.println("no one is present");
        }

        //iterator
        Iterator it = set.iterator();
        
        while (it.hasNext()) {
            System.out.println(it.next());
        }

    }
}
