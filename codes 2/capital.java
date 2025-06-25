public class capital {
    public static void main(String[] args) {
        String s = "FlaG";
        for( char c : s.toCharArray()){
            if (Character.isUpperCase(c)) {
                System.out.println("True");
                break;
            }
            else{
                System.out.println("False");
            }
        }
    }
}
