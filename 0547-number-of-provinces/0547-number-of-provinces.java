class Solution {
    public void dfs(ArrayList<ArrayList<Integer>> adj, int node, boolean[] vis) {
        vis[node] = true;
        for (Integer x : adj.get(node)) {
            if (!vis[x]) {
                dfs(adj, x, vis);
            }
        }

    }

    public int findCircleNum(int[][] isConnected) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        int n = isConnected[0].length;
        // System.out.println(isConnected.length);
        // initializing the adjacency list
        for (int i = 0; i < n; i++) {
            adj.add(new ArrayList<>());
        }

        for (int i = 0; i < isConnected.length; i++) {
            for (int j = 0; j < isConnected[i].length; j++) {
                if (isConnected[i][j] == 1 && i != j) {
                    adj.get(i).add(j);
                    adj.get(j).add(i);
                }
            }
        }

        boolean[] vis = new boolean[n+1];
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            if (!vis[i]) {
                cnt++;
                dfs(adj, i, vis);
            }
        }
        return cnt;
    }
}