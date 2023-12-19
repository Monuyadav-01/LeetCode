public class LeetCode1456 {

    private static boolean isV(char c){
        return (c =='a' || c == 'e' || c == 'i' || c == 'o' || c == 'u');
    }

    public static int maxVowels(String s, int k) {
            int cnt =0;
            for(int i=0;i<k;i++){
                if(isV(s.charAt(i))){
                    cnt++;
                }
            }
            int max_cnt = cnt;

            for(int  i =k ;i<s.length();i++){
                if(isV(s.charAt(i))){
                    cnt++;
                }
                if(isV(s.charAt(i-k))){
                    cnt--;
                }
                max_cnt = Math.max(max_cnt,cnt);
            }
            return max_cnt;
    }

    public static void main(String[] args) {

        String s = "abciiidef";
        int k= 3;
        System.out.println(maxVowels(s,k));

    }
}
