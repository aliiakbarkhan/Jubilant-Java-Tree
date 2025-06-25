public class revString {
    public static void main(String[] args) {
        char[] s = {'h','e','l','l','o'};
        StringBuilder sb = new StringBuilder();

        for(char word : s){
            sb.append(word).append("");
        }
        
        // String result = String.join("", s);
        // for(int i = 0; i< result.length()/2; i++){
        //     int first = i;
        //     int last = result.length() -1 -i;

        //     char firstChar = result
        // }
        String result = sb.reverse().toString();
        char[] s2 = result.toCharArray();
        for(int i = 0; i<s.length; i++){
            s[i] = s2[i];
        }
        System.out.println(s); 
        
    }
}
