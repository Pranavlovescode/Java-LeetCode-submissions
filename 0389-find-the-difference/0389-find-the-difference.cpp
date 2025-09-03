class Solution {
public:
    char findTheDifference(string s, string t) {
        int sum1=0;
        int sum2=0;
        for(auto i: s){
            sum1 += (int) i;
        }
        for(auto i: t){
            sum2 += (int) i;
        }
        int res = sum2-sum1;
        return (char) res;
    }
};