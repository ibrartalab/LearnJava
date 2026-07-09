package DSAJava.leetcode;

public class LongestPalindromicSubString {
    static void main() {
        String s = "ac";
        String re =  findPalindromicSubString(s);
        System.out.println(re);
    }

    // Brute force solution
    public static String findPalindromicSubString(String s){
        if(s.length() == 1) return s;
        if(s.length() > 1 && s.charAt(0) != s.charAt(s.length()-1)){
            return s.substring(0,1);
        }
        for (int i = 0; i < s.length(); i++) {
            for (int j = i; j < s.length(); j++) {
//                System.out.println(s.substring(i,j));
                String subS = s.substring(i,j);
                if(subS.length() > 1){
                    if(subS.charAt(0) == subS.charAt(subS.length()-1)){
                        return subS;
                    }
                }
            }
        }
        return "";
    }
}
