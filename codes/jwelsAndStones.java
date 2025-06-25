public class jwelsAndStones {
    public static void main(String[] args) {
        String jewels = "z";
        String stones = "ZZ";
        int count = 0;

        char[] jChar = jewels.toCharArray();
        StringBuilder sb = new StringBuilder(stones);

        for(int i =0; i<jChar.length; i++){
            System.out.println("Index: "+ i +" and char: "+ jChar[i]);
            for(int j = 0; j<sb.length(); j++){
                if (jChar[i]== sb.charAt(j)) {
                    count++;
                    System.out.println("Count is now : "+ count);
                    System.out.println("Deleted char : " + sb.charAt(j));
                    // sb.deleteCharAt(j);
                    // break;
                }
            }
        }
        System.out.println(count);
    }
}
