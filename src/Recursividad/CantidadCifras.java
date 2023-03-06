package Recursividad;

public class CantidadCifras {
    public static void main(String[] args) {
        int numeroEntero= 40000;
        System.out.println(cifrasNumeroEntero(numeroEntero));
    }
    public static int cifrasNumeroEntero(int numeroEntero){
        int c=0;
        if(numeroEntero != 0){
            c++;
            c+= cifrasNumeroEntero(numeroEntero/10);
        }
     return c;
    }
}
