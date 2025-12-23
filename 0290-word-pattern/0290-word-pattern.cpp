class Solution {
public:
    bool wordPattern(string pattern, string s) {
        vector<string> words;
        string temp = "";

        // Split string s into words
        for (char c : s) {
            if (c == ' ') {
                words.push_back(temp);
                temp = "";
            } else {
                temp.push_back(c);
            }
        }
        words.push_back(temp);

        // Length mismatch
        if (pattern.size() != words.size())
            return false;

        unordered_map<char, string> p2w;
        unordered_map<string, char> w2p;

        for (int i = 0; i < pattern.size(); i++) {
            char p = pattern[i];
            string w = words[i];

            if (p2w.count(p) && p2w[p] != w)
                return false;

            if (w2p.count(w) && w2p[w] != p)
                return false;

            p2w[p] = w;
            w2p[w] = p;
        }

        return true;
    }
};
