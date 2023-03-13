package Recursividad;

public class PotenciaNumero {
    public static void main(String[] args) {
        System.out.println(PotenciaNumero(5,6));
    }
    public static int PotenciaNumero(int potencia, int base){
        int resultadoPotencia =1;
        if(potencia > 0){
            resultadoPotencia*=PotenciaNumero(potencia-1,base);
            resultadoPotencia*=base;
        }
        return resultadoPotencia;
    }
}
