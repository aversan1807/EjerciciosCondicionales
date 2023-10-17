import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("El numero de alumnos es: ");
        double alumnos = entrada.nextInt();

        if(alumnos > 99){
            System.out.println("El costo por cada alumno es de 65 euros");
            double pagoTotal = alumnos * 65;
            System.out.println("El precio total es de: " + pagoTotal);
        }else{

        }

        if(alumnos > 29 && alumnos < 50){

            System.out.println("El coste es de 95 euros");
            double pagoTotal = alumnos * 95;
        }else{

        }

        if(alumnos < 30){

            System.out.println("El costo de la renta del autobús es de 4.000 euros");
            double pagoIndividual = 4000.0 / alumnos;
            System.out.println("El pago por cada alumno es de: " + pagoIndividual);
        }else{

        }


    }
}
