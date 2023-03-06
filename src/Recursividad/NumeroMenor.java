package Recursividad;

public class NumeroMenor {
    public static void main(String[] args) {
        int[]arreglo = {2,3,5,6,7};
        numeroMenor(arreglo,0,arreglo.length);
    }

    public static void numeroMenor(int[]arreglo,int inicio, int fin){
        if(inicio<fin){
            System.out.println(arreglo[inicio]);
            numeroMenor(arreglo,++inicio,fin);
        }
    }
}
