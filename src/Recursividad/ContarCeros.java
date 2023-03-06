package Recursividad;

public class ContarCeros {
    public static void main(String[] args) {
        int[]arreglo = {0,0,0,2,0,0};
        System.out.println(EncontrarCeros(arreglo,0));

    }
    public static int EncontrarCeros( int[]arreglo, int i ){
        int c=0;
        if(i<arreglo.length){
            if(arreglo[i]== 0){
                c++;
            }
            c+=EncontrarCeros(arreglo,i+1);
        }
        return c;
    }
}
