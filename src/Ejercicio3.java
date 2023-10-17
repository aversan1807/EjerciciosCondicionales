import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Introduce el primer número:");
        double num1 = entrada.nextInt();

        System.out.println("Introduce el segundo número:");
        double num2 = entrada.nextInt();

        double division = num1 % num2;
        System.out.println("La división de los dos números es: " + division);

        if (num2 == 0){ ;

            System.out.println("ERROR");

        }else{
            double resultado = num1 % num2;
            System.out.println("El resultado de la división es: " + resultado);
        }

        entrada.close();
    }


}