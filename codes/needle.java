public class needle {
    public static void main(String[] args) {
        String haystack = "sadbutsad";
        String needle = "sad";

        if (haystack.contains(needle)) {
            System.out.println("Index is: "+ haystack.indexOf(needle));

        }
        else{
            System.out.println("False");
        }
    }
}
