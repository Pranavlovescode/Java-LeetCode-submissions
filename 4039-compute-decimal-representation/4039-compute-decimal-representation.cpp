class Solution {
public:
    vector<int> decimalRepresentation(int n) {
        vector<int> v;
        long long i = 1;
        while(n > 0){
            if(n%10 != 0) v.push_back((n%10)*i);            
            n/=10;
            i*=10;
        }
        sort(v.rbegin(),v.rend());
        return v;
    }
};