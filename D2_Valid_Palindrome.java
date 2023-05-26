// https://leetcode.com/problems/valid-palindrome/

class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder sb = new StringBuilder();
        s=s.toLowerCase();
        for(int i=0;i<s.length();i++)
            if(Character.isLetter(s.charAt(i)) || Character.isDigit(s.charAt(i)))
                sb.append(s.charAt(i));
        int i=0,j=sb.length()-1;
        while(i<=j){
            if(sb.charAt(i++)!=sb.charAt(j--))
                return false;
        }
        return true;
    }
}
