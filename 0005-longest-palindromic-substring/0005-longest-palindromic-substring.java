class Solution {
    public String longestPalindrome(String s) {
        String longest = "";
        if (s.length() < 2)
            return s;
        for (int i = 0; i < s.length(); i++) {
            for (int j = i; j < s.length(); j++) {
                if (s.charAt(i) == s.charAt(j)) {
                    String str = s.substring(i, j + 1);
                    String revStr = new StringBuilder(str).reverse().toString();
                    if (str.equals(revStr) && longest.length() < str.length()) {
                        longest = str;
                    }
                }
            }
        }
        return longest;
    }
}