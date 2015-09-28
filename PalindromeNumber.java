public class Solution {
    public boolean isPalindrome(int x) {
        boolean positive = true;
        if (x < 0) return positive = false;
        Integer x1 = x;
        String str =  x1.toString();

        int i = 0;
        int j = str.length() - 1;
        
        
        while (i < j)
        {
                if (str.charAt(i++) != str.charAt(j--) ) return false;
        }
        return true;
    }
}