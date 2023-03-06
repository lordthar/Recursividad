package Recursividad;

public class BuscarElementoArray {
    public static void main(String[] args) {
        int[]arreglo= {2,5,6,7,8};
        buscarElemento(arreglo,0,5);
    }
    public static void buscarElemento(int[]arreglo, int i, int elem){
        if(i<arreglo.length){
            if(arreglo[i] == elem){
                System.out.println(arreglo[i]);
            }
            buscarElemento(arreglo, i+1, elem);
        }
    }
}
