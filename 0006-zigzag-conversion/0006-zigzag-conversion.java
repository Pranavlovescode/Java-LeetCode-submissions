class Solution {
    public String convert(String s, int numRows) {
        if (numRows == 1 || numRows >= s.length()) return s;

        int idx = 0, d =  1;
        ArrayList<ArrayList<Character>> rows = new ArrayList<>(numRows);
        for (int i = 0; i< numRows ; i++) {
            rows.add(new ArrayList<>());
        }
        for (Character ch : s.toCharArray()){
            rows.get(idx).add(ch);
            if (idx == 0) d = 1;
            else if (idx == numRows -1) d = -1;
            idx += d;
        }
        StringBuilder result = new StringBuilder(new String(""));
        for (ArrayList<Character> ch : rows){
            for (Character c : ch){
                result.append(c);
            }
        }
        return result.toString();
    }
}