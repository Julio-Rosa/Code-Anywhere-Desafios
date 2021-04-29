package SolucionandoDesafiosMatematicos.AnaliseDeNumeros;

import java.io.IOException;
import java.util.Scanner;

public class Classe {

    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);

        int pares = 0;
        int impares = 0;
        int positivos = 0;
        int negativos = 0;



//continue a solução
        for (int i = 1; i <= 5; i++) {
            Integer numero = leitor.nextInt();//A váriavel número recebe valores de leitor.nextInt, até que o contador chegue em 5.
            if (numero < 0){//Se o número é menor(<) que 0 então ele é negativo, então o contador de negativos recebe +1.

                negativos++;
            }else if (numero > 0){
                //Se o número é menor(>) que 0 então ele é positivo, então o contador de positivos recebe +1.


                positivos++;
            }
            if (numero % 2 == 0){
                // Um número é par se esse o resto da divisão(%) deste número por 2(numero % 2) for igual a 0, então a variavel pares recebe +1.

                pares++;
            }else {
                //Se o resta da divisão deste número, não for igual a 0 então ele é impar, a variavel impares recebe +1.

                impares++;
            }

        }

        System.out.println( pares + " valor(es) par(es)");
        System.out.println( impares + " valor(es) impar(es)");
        System.out.println( positivos + " valor(es) positivo(s)");
        System.out.println( negativos + " valor(es) negativo(s)");
    }

}