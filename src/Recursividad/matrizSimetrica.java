package Recursividad;

public class matrizSimetrica {
    public static void main(String[] args) {
        int [][] matriz = {{1,2,3},{2,3,4},{3,2,1}};
        System.out.println(verificarSimetria(matriz, 0,0, true));
    }
    public static boolean verificarSimetria(int [][] matriz, int i, int j, boolean simetria){

        if(i<matriz.length-1){
            if(i!=j){
                if(matriz[i][j] != matriz[j][i]){
                    simetria = false;
                }
            }
            if(j<matriz[0].length-1){
                j++;
            }else{
                i++;
                j=0;
            }
            simetria= verificarSimetria(matriz,i,j, simetria);
        }
        return simetria;
    }
}
