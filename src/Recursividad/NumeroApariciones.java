package Recursividad;

public class NumeroApariciones {
    public static void main(String[] args) {
        int[]arreglo={4,3,4,5,4};
        System.out.println(recorrerArreglo(arreglo, 0, arreglo.length, 4  ));
    }
    public static int recorrerArreglo(int[]arreglo, int inicio, int fin, int elem){
        int c=0;
        if(inicio<fin){
            if(elem == arreglo[inicio]){
                c++;
            }
            c+= recorrerArreglo(arreglo,++inicio,fin,elem);
        }
        return c;
   }

}
