import java.util.Scanner;

public class find {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter N : ");
        int n = scn.nextInt();
        System.out.println("Enter Find Element : ");
        int find = scn.nextInt();
        int[] arr;
        arr = new int[n];
        for(int i = 0; i<n; i++){
            arr[i] = scn.nextInt();
            if (find == arr[i]) {
                find = i; 
            }
            else if (find != arr[i] && i==n-1) {
                find = -1;                
            }
        }
        System.out.println("On Index: " + find);


        scn.close();
    }
}
