class Solution {
private:
    void dfs(vector<vector<int>>& image,vector<vector<int>>& ans ,int row, int col, int color,
int deltaRow[], int deltaCol[], int iniColor){
        ans[row][col] = color;
        int n = image.size();
        int m = image[0].size();
        for(int i=0;i<4;i++){
            int nrow = row + deltaRow[i];
            int ncol = col + deltaCol[i];
            if(nrow >=0 && nrow < n && ncol >= 0 && ncol < m && image[nrow][ncol] == iniColor && ans[nrow][ncol] != color){
                dfs(image,ans, nrow, ncol, color, deltaRow, deltaCol, iniColor);
            }            
        }
    }
public:
    vector<vector<int>> floodFill(vector<vector<int>>& image, int sr, int sc, int color) {
        int iniColor = image[sr][sc];
        vector<vector<int>> ans = image;
        int deltaRow[] = {-1,0,1,0};
        int deltaCol[] = {0,1,0,-1};
        dfs(image, ans, sr, sc, color, deltaRow, deltaCol, iniColor);
        return ans;
    }
};