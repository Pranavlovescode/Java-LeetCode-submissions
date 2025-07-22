class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        Set<Integer> arr = new HashSet<>();

        int i =0,j=0,sum = 0, maxVal = Integer.MIN_VALUE;

        while(j < nums.length){
            while(arr.contains(nums[j])){
                sum -= nums[i];
                arr.remove(nums[i]);
                i++;
            }
            arr.add(nums[j]);
            sum += nums[j];
            maxVal = Math.max(sum,maxVal);
            j++;
        }
        return maxVal;
    }
}