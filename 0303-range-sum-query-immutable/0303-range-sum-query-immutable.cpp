class NumArray {
public:
    vector<int> num;
    NumArray(vector<int>& nums) {
        for(auto&& n:nums){
            num.push_back(n);
        }
    }
    
    int sumRange(int left, int right) {
        int sumRes = 0;
        for(int i=left;i<=right;i++){
            // cout << sumRes << endl;
            sumRes+=num[i];
        }
        return sumRes;
    }
};

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray* obj = new NumArray(nums);
 * int param_1 = obj->sumRange(left,right);
 */