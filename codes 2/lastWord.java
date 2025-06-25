public class lastWord {
    public static void main(String[] args) {
        String s = "Hello World";
        s = s.trim();
        int val = s.lastIndexOf(" ") + 1;
        System.out.println(s.substring(val).length());
    }
}
