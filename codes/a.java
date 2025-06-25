public class a {
    public static void main(String[] args) {
        int[] arr;
        arr = new int[5];
        arr[0] = 1;
        arr[1] = 34;
        arr[2] = 76;
        arr[3] = 89;
        arr[4] = 43;

        int[] two = arr;
        two[2] = 500;

        for(int i = 0; i< 5; i++){
            System.out.print("Loop one:"+ arr[i]);
            
            System.out.print("Loop two:"+ two[i]);
        }
    }
}
