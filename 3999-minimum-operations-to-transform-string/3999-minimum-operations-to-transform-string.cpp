class Solution {
public:
    int minOperations(string s) {
        int cnt =0;
        for(auto it: s){
            if(it != 'a'){
                cnt = max('z'-it+1, cnt);
            }
        }
        return cnt;
    }
};