package SolucionandoDesafiosMatematicos.Multiplos;

import java.util.Scanner;

public class Classe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        //n1 e n2 recebe um numero inteiro


        if( ( n1 % n2 == 0) |( n2 % n1 == 0)){
            System.out.println("Sao multiplos");
            // Se o resto da divisão de (n1 por n2) ou (n2 por n1) for igual zero então os numeros são multiplos.

        }else {
            //Caso o resto da divisão for diferente de zero, é impresso na tela "Não sao Multiplos"
            System.out.println("Nao sao Multiplos");

        }
    }
}
