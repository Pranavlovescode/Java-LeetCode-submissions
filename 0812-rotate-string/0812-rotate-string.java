class Solution {
    public boolean rotateString(String s, String goal) {
        int n = s.length() ,j = 0;

        StringBuffer sb = new StringBuffer(s);
        for(int i=0;i<n;i++){
            if(sb.toString().equals(goal)) return true;
            char temp = sb.toString().charAt(0);
            // System.out.println("The char at 0 "+temp);
            sb.deleteCharAt(j);
            sb.append(temp);
            // System.out.println("The string is "+sb.toString());
        }
        return false;
    }

}