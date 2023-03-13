package Recursividad;

public class NumeroPerfecto {
    public static void main(String[] args) {
        System.out.println(perfeccion(345,1));
    }
    public static int perfeccion(int numero, int divisor){
        int c=0;
        if(divisor<numero){
            if(numero%divisor == 0){
                c+=divisor;
                c+=perfeccion(numero,divisor+1);
            }
            if(divisor==1){
                if(c==numero){
                    return c;
                }
            }else{
                c= -1;
            }
        }
        return c;
    }
}
