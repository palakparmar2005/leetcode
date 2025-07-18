class Solution {
    public int[][] transpose(int[][] matrix) {
     int rows = matrix.length;
     int cols = matrix[0].length;

     int [][] arr = new int[cols][rows];

     for(int i=0;i<cols;i++){
for(int j=0;j<rows;j++){
    arr[i][j] = matrix[j][i];
}
     }
     return arr;
    }
}
