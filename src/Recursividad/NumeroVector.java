package Recursividad;

public class NumeroVector {
    public static void main(String[] args) {
        int [] arreglo = {2,3,4,5,6,7};
        System.out.println(buscarObjeto(arreglo, arreglo.length, 0, 3));
    }
    public static int buscarObjeto (int[]arreglo, int tamano, int i, int objeto ){
        int c=0;
        if(i<arreglo.length){
            if(objeto == arreglo[i]){
                c++;
            }
            c+=buscarObjeto(arreglo,tamano,++i,objeto);
        }
        return c;
    }

}
