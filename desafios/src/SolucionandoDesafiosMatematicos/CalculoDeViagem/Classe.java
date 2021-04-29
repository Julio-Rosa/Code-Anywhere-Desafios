package SolucionandoDesafiosMatematicos.CalculoDeViagem;



import java.util.Locale;
import java.util.Scanner;

public class Classe {
    public static void main(String[] args) {
        Locale.setDefault(new Locale("en","EUA"));

        Scanner sc = new Scanner(System.in);
        float tempoGasto = sc.nextFloat();//A variavel tempoGasto Recebe o tempo gasto na viagem
        float velocidadeMedia = sc.nextFloat();//A variavel velocidadeMedia recebe a velocidade média da viagem
        int litrosPorKm = 12;// A variavel litrosPorKm recebe a quantidade de litros de gasolina o carro gasta por kilometro.
        System.out.printf("%.3f\n",(tempoGasto * velocidadeMedia)/litrosPorKm);
        //(tempoGasto * velocidadeMedia)/litrosPorKm) Calcula a quantidade de litros necessaria para realizar a viagem.


    }
}
