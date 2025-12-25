class NumArray {
    ArrayList<Integer> arr = new ArrayList<>();

    public NumArray(int[] nums) {
        for(Integer n:nums){
            arr.add(n);
        }
    }
    
    public int sumRange(int left, int right) {
        int res=0;
        for(int i=left;i<=right;i++){
            res+=arr.get(i);
        }
        return res;
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */