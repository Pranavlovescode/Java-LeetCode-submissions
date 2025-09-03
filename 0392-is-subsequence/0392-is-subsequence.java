class Solution {
    public boolean isSubsequence(String first, String sec) {

        int i=0,j=0;
        while(i<first.length() && j<sec.length()){
            if(first.charAt(i)==sec.charAt(j)){
                i++;                
            }
            j++;
        }

        return i==first.length();
    }
}