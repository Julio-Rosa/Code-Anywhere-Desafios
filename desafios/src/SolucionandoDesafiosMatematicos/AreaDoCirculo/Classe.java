package SolucionandoDesafiosMatematicos.AreaDoCirculo;

import java.util.Scanner;

public class Classe{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        double raio = scan.nextDouble();// raio recebe um numero do tipo Double

        double area = 3.14159 * (Math.pow(raio,2));
        // Area recebe o valor retornado de de 3.14159 * (Math.pow(raio,2));
        // Math.pow , eleva o valor de raio por 2.(raio * raio)
        System.out.printf("A=%.4f\n", area);
        //Imprime o valor recebido pela variável raio.
        //%.4f pede para impimir apenas 4 numeros depois do ponto.
    }
}