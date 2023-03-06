package Recursividad;

public class arrayRecursiva {
    public static void main(String[] args) {
        int[]arreglo={5,6,7,8,9,45};
        recorrerArregloR(arreglo,0);
    }
    public static void recorrerArregloR(int[]arreglo , int i){
        if(i<arreglo.length){
            System.out.println(arreglo[i]);
            recorrerArregloR(arreglo,i+1);
        }
    }
}
