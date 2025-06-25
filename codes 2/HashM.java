import java.util.*;

public class HashM {
    public static void main(String[] args) {
        HashMap<String, Integer> ali = new HashMap<>();


        //insertion
        ali.put("INDIA", 1200);
        ali.put("USA", 5678);
        ali.put("CHINA", 3445);
        
        System.out.println(ali);
        
        ali.put("CHINA", 45);
        System.out.println(ali);

        //search
        if (ali.containsKey("INDIA")) {
            System.out.println("Present");
        }
        else{
            System.out.println("Not Present");
        }
        System.out.println(ali.get("INDIA"));
        System.out.println(ali.get("india"));

        // int arr[] = {12,15,14};
        // for(int a : arr){
        //     System.out.println(a);
        // }

        for(Map.Entry<String, Integer> e : ali.entrySet()){
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }

        //delete
        ali.remove("CHINA");
        System.out.println(ali);



    }
}
