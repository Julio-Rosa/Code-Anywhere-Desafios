package EntradaESaidaCPF;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Locale;

public class Classe{
    public static void main(String[] args) {

        Locale.setDefault(new Locale("en", "US"));

        Scanner sc = new Scanner(System.in);
        //É CRIADO UM SCANNER

        String[] cpf = new String[4];//é criado um array onde sera guardado o cpf.

        cpf = sc.nextLine().split("\\.|-");
        //.split separa as strings usando um regex.
        //Delimita a palavra ao encontrar(um ponto {\\.}) (ou um traço{|-}).






        //for (String cpfs : cpf){
          //  System.out.println(cpfs);
        //}
        //forEach usa um contador interno que não temos acesso.
        //É declarada um variável cpfs que recebe o cpf já iterado internamente.



        for(int i = 0; i < cpf.length;i++)//Percorre as strings já separadas pelo split.

            System.out.printf("%s\n",cpf[i]);//\n insere uma nova linha, fazendo cada parte do cpf ser impresso e linhas separadas.



        sc.close();
    }
}