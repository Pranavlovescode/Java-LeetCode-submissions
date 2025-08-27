class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        for(int i:nums){
            System.out.println(i);
        }
        return nums[nums.length/2];
    }
}