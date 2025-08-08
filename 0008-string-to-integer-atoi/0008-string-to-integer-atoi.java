class Solution {
    public int myAtoi(String s) {
        String noSpaces = s.trim();
        if (noSpaces.isEmpty()) return 0;

        boolean negative = false;
        int start = 0;

        // Handle sign
        if (noSpaces.charAt(0) == '-') {
            negative = true;
            start++;
        } else if (noSpaces.charAt(0) == '+') {
            start++;
        }

        StringBuffer sb = new StringBuffer();

        // Skip leading zeros
        while (start < noSpaces.length() && noSpaces.charAt(start) == '0') {
            start++;
        }

        // Build number until non-digit
        while (start < noSpaces.length() && Character.isDigit(noSpaces.charAt(start))) {
            sb.append(noSpaces.charAt(start));
            start++;
        }

        if (sb.length() == 0) return 0; // no digits found

        int num = 0;
        try {
            num = Integer.parseInt(sb.toString());
        } catch (NumberFormatException e) {
            return negative ? Integer.MIN_VALUE : Integer.MAX_VALUE;
        }

        return negative ? -num : num;
    }
}