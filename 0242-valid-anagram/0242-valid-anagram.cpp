class Solution {
public:
    bool isAnagram(string s, string t) {
        if(s.length() != t.length()) return false;
        // map<char,int> freq;
        // for (auto i: s){
        //     freq[i]++;
        // }
        // for(auto it : t){
        //     if(freq.find(it) == freq.end() || freq[it] == 0) return false;
        //     freq[it]--;
        // }
        // return true;

        sort(s.begin(), s.end());
        sort(t.begin(),t.end());
        if(s != t) return false;
        return true;
    }
};