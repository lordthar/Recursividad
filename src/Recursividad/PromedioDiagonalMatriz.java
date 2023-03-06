package Recursividad;

public class PromedioDiagonalMatriz {
    public static void main(String[] args) {
        int [][]matriz = {{1,2,3},{2,3,4},{3,2,1}};
        System.out.println(promedioMatriz(matriz,0,0));
    }
    public static double promedioMatriz(int [][]matriz, int i, int j){
        double promedio=0;
        if(i<matriz.length){
            if(j<matriz.length){
                promedio+= matriz[i][j];
                promedio+=promedioMatriz(matriz,i+1,j+1);
            }
            if(i==0){
                return promedio / matriz.length;
            }
        }
     return promedio;
    }
}
