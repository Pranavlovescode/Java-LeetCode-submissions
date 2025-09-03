class Solution {
    public String addBinary(String a, String b) {
        int i = a.length() - 1;
        int j = b.length() - 1;
        StringBuffer result = new StringBuffer();
        int carry = 0;
        while (i >= 0 || j >= 0 || carry > 0) {
            int sum = (i >= 0 ? a.charAt(i) - '0' : 0) +
                    (j >= 0 ? b.charAt(j) - '0' : 0) +
                    carry;
            result.insert(0,sum % 2);
            carry = sum / 2;
            i--;
            j--;
        }
        // System.out.println(result.toString());
        return result.toString();
    }
}