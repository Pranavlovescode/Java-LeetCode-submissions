class Solution {
    public String countAndSay(int n) {
        if (n == 1) return "1";
        
        String prev = countAndSay(n - 1);
        StringBuilder sb = new StringBuilder();
        
        int count = 1;
        for (int i = 1; i < prev.length(); i++) {
            if (prev.charAt(i) == prev.charAt(i - 1)) {
                count++;
            } else {
                sb.append(count);
                sb.append(prev.charAt(i - 1));
                count = 1;
            }
        }
        
        // Append the last group
        sb.append(count);
        sb.append(prev.charAt(prev.length() - 1));
        
        return sb.toString();
    }
}
