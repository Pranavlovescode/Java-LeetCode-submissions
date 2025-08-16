class Solution {
    public int maximum69Number (int num) {
        String nums = Integer.toString(num);
        int maxVal = num;
        StringBuffer sb = new StringBuffer(nums);
        for(int i=sb.length()-1;i>=0;i--){
            if(sb.charAt(i) == '6'){
                sb.setCharAt(i,'9');
                maxVal = Math.max(maxVal, Integer.parseInt(sb.toString()));
                // System.out.println(maxVal);
                sb.setCharAt(i,'6');
            }
            else{
                sb.setCharAt(i,'6');
                maxVal = Math.max(maxVal, Integer.parseInt(sb.toString()));
                // System.out.println(maxVal);
                sb.setCharAt(i,'9');
            }

        }
        return maxVal;
    }
}