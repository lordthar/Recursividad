package Recursividad;

public class InvertirPalabra {
    public static void main(String[] args) {
        String nombre = "wasa";
        System.out.println(invertirPalabra(nombre, 0));
    }

    public static String invertirPalabra(String nombre, int i){
        String conc= "";
        if(i<nombre.length()){
            conc+= invertirPalabra(nombre,i+1);
            conc+= nombre.charAt(i);
        }
        return conc;
    }
}
