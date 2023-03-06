package Recursividad;

public class MatrixRecursiva {
    public static void main(String[] args) {
        int[][]matrix={{1,2,3},{2,3,7},{3,6,8}};
        recorrerMatrix(matrix,0 , 0);
    }
    public static void recorrerMatrix(int[][]matrix,int i , int j){
        if(i<matrix.length) {
            if (j<matrix[i].length) {
                System.out.print(matrix[i][j] + " ");
                j++;
            } else {
                System.out.println(" ");
                i++;
                j=0;
            }
            recorrerMatrix(matrix, i, j);
        }
    }
}
