import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Introduzca un número: ");

        int numero = entrada.nextInt();

        if(numero%2==0) {
            System.out.println("El numero es par");
        }else{
            System.out.println("El numero es impar");
        }
        }

}
