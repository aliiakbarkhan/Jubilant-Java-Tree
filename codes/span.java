import java.util.Scanner;

public class span {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("ENTER N: ");
        int n = scn.nextInt();
        int[] arr;
        arr = new int[n];
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        
        for(int i  = 0; i<n; i++){
            arr[i] = scn.nextInt();
            if (arr[i]>max) {
                max = arr[i];
            }
            if (arr[i]<min) {
                min = arr[i];
                
            }
        }
        System.out.println("Min: "+min);
        System.out.println("Max: "+max);
        System.out.println("Span: "+(max-min));






        scn.close();
    }
}
