public class transposeMatrix {
    public static int[][] tranposeMatrix(int[][] matrix){
        int[][] transMatrixResult = new int[matrix[0].length][matrix.length];
    
        for(int col=0; col<matrix[0].length; col++){
          for(int row=0;row<matrix.length;row++){
            transMatrixResult[col][row] = matrix[row][col];
          }
        }
    
        return transMatrixResult;
    }
}
