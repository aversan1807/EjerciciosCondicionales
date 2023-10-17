import java.util.Scanner;
//He intentado realizar los porcentajes, pero no se me ocurría nada, sólo he podido dar el precio de las llamadas por minuto.
public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Indique cuántos minutos ha estado hablando: ");
        double tiempo = entrada.nextDouble();
        System.out.println("Indique que día de la semana es, 1 para domimgo, 2 para resto de días ");
        int día = entrada.nextInt();
        System.out.println("Indique el turno: , 1 para mañana, 2 para tarde");
        int turno = entrada.nextInt();

        if (tiempo <= 5) {
            double costeTotal = tiempo * 1;
            System.out.println("El coste total es de: " + costeTotal + " euros ");
        } else if (tiempo <= 8) {
            double costeTotal = 1 + 0.80 * (tiempo);
            System.out.println("El coste total es de: " + costeTotal + " euros ");

        } else if (tiempo <= 10) {
            double costeTotal = 1 + 0.80 + 0.70 * (tiempo);
            System.out.println("El coste total es de: " + costeTotal + "euros");

        } else if (tiempo >= 11) {
            double costeTotal = 1 + 0.80 + 0.70 + 0.50 * (tiempo);
            System.out.println("El coste total es de: " + costeTotal + "euros");
        }

        if(día==1){

        }
    }

}
