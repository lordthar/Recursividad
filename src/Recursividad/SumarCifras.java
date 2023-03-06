package Recursividad;

public class SumarCifras {
    public static void main(String[] args) {
        int numero= 9845;
        System.out.println(sumarCifras(numero));
    }
    public static int sumarCifras(int numero){
        if(numero<10){
            return numero;
        }
        return (numero % 10) + sumarCifras(numero/10);
    }
}
