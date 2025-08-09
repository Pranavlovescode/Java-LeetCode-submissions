class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i=0;i<matrix.length;i++){
            for(int j =0;j<matrix[i].length;j++){
                arr.add(matrix[i][j]);
            }
        }
        System.out.println(arr);
        return (arr.contains(target))? true:false;
    }
}