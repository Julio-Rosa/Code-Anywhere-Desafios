package ExibindoNumerosPares;

import java.util.Scanner;

public class NumerosPares {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);

        int n = sc.nextInt();//n recebe o número a ser comparado

        for (int i = 0; i <= n; i++){//Itera sobre o número recebido na variável n(0 <= 6)
            if (i % 2 == 0 && i > 0) {
                //Se o resto da divisão deste número for igual á 0 então ele é par.
                //Se este número for par e for maior do que 0( > 0) então ele sera impresso.
                System.out.println(i);
            }
        }

    }
}
