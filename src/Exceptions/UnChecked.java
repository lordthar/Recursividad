package Exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class UnChecked {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {

            System.out.println("diga algo: ");
            int x = scanner.nextInt();
            System.out.println("complemente el algo: ");
            int y = scanner.nextInt();
            int w = x / y;

            System.out.println("resultado waseish: " + w);

        } catch (ArithmeticException e) {
            System.out.println("usted es nuv como va dividir por 0, JAJAJA");
        }catch(InputMismatchException e){
            System.out.println("vos sos tonto como vas a colocar palabras");
        }catch (IllegalArgumentException e){
            System.out.println("usted si no lo criaron bien mijo muy F");
        }catch (Exception e){
            System.out.println("a pero sos re malo mijo devuelvase a preescolar");
        }
        finally{
           scanner.close();
        }



    }
}
