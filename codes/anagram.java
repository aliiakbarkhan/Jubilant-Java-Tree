public class anagram {
    public static void main(String[] args) {
        String s = "anagram";
        String t = "ngram";

        StringBuilder sb = new StringBuilder(s);
        StringBuilder tb = new StringBuilder(t);
        int count = 0;
        char[] sArray = s.toCharArray();
        // char[] tArray = t.toCharArray();

        for(int i =0; i<sb.length(); i++){
            for(int j = 0; j<tb.length(); j++){
                if (sArray[i] == tb.charAt(j)) {
                    count++;
                    tb.deleteCharAt(j);
                    break;
                }
            }
            
        }
        if (count == s.length()) {
            System.out.println("yes");
        }
        else{
            System.out.println("no");
        }
    }
}
