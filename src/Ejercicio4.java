import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Introduzca la base: ");
        double base = entrada.nextDouble();

        System.out.println("Introduzca el exponente:");

        double exponente = entrada.nextDouble();

        double resultado = Math.pow(base, exponente);

        if (exponente > 0) {
            System.out.println("El resultado es: " + resultado);

        }else {

        }

        if(exponente==0){
            System.out.println("El resultado es: 1 ");

        }else{

        }
        if(exponente < 0){

        }
    }
}
