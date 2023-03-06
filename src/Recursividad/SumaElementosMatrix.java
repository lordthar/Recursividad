package Recursividad;

public class SumaElementosMatrix {
    public static void main(String[] args) {
        int[][]matrix = {{1,2,3},{2,3,7},{3,6,8}};
        System.out.println( sumaMatrix(matrix, 0,matrix.length-1));
    }
    public static int sumaMatrix(int[][]matrix, int i, int j){
        int suma=0;
        if(i<matrix.length){
            if(j>=0){
                suma+= matrix[i][j];
                --j;
            }else{
                i++;
                j=matrix.length-1;
            }
            suma+=sumaMatrix(matrix,i,j);
        }
        return suma;
    }
}
