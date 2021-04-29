package SolucionandoDesafiosMatematicos.FolhaDePagamento;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Locale;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Classe {
    public static void main(String[] args) throws IOException {
        Locale.setDefault(new Locale("en","EUA"));
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(sc.readLine());
        int numeroDoFuncionario = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(sc.readLine());
        int horasTrabalhadas = Integer.parseInt(st.nextToken());



        st = new StringTokenizer(sc.readLine());
        double valorPorHora = Double.parseDouble(st.nextToken());

        double salario =  horasTrabalhadas * valorPorHora;


        System.out.println("NUMBER = " + numeroDoFuncionario);
        System.out.printf("SALARY = U$ %.2f",salario);

    }
}
