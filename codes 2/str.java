public class str {
    public static void main(String[] args) {
        String s = "race a car";
        StringBuilder modd = new StringBuilder(s.toLowerCase().replaceAll("[^a-zA-Z0-9]", ""));
        String modd2 = modd.toString();
        for(int i = 0; i<modd.length()/2; i++){
            int first = i;
            int last = modd.length() - 1 - i;

            char firstchar = modd.charAt(first);
            char lastchar = modd.charAt(last);

            modd.setCharAt(first, lastchar);
            modd.setCharAt(last, firstchar);
            

        }
        System.out.println(modd);
        System.out.println(modd2);
        if (modd2.compareTo(modd.toString()) == 0){
            System.out.println("Palindrome"); 
        }
        else{
            System.out.println("Not Palindrome");
        }
    }
}
