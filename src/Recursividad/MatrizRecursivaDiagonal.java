package Recursividad;

public class MatrizRecursivaDiagonal {
    public static void main(String[] args) {
        int[][]matrix = {{1,2,3},{2,3,4},{3,2,1}};
        System.out.println(sumarDiagonalMatrix(matrix, 0, 0));
    }
    public static int sumarDiagonalMatrix(int[][]matrix, int i, int j){
        int suma =0;
        if(i<matrix.length){
            if(j<matrix.length){
                suma+=matrix[i][j];
                j++;
            }else{
                i++;
                j=0;
            }
            suma+=sumarDiagonalMatrix(matrix,i+1,j+1);
        }
        return suma;
    }
}
