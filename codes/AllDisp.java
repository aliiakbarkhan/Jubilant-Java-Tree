import java.util.HashSet;
//448
public class AllDisp {
    public static void main(String[] args) {
        int[] n = {4,3,2,7,8,2,3,1};
        HashSet<Integer> set = new HashSet<>();
        for(int num : n){
            set.add(num);
        }
        for(int i = 1; i<=n.length; i++){
            if (set.contains(i)) {
                set.remove(i);
            }
            else{
                set.add(i);
            }
        }
        // write a program to add two numbers
        int[] ali = new int[set.size()];
        int j = 0;
        for(int val : set){
            ali[j++]=val;
        }
        for(int i  = 0; i<ali.length; i++){
            System.out.println(ali[i]);
        }
        //code is corroct and working well just need to return list or array i don't know
    }
}
