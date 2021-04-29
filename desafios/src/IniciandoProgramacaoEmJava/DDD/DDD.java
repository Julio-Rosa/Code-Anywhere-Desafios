package DDD;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DDD {
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        int DDD = leitor.nextInt();//Lê o DDD a ser pesquisado

        Map<Integer,String> DDDs = new HashMap<Integer,String>();
        //Map rece dois parametros<Chave,Valor>, Onde valor é o DDD e o valor é a cidade pertencente a este ddd.

        DDDs.put(61,"Brasilia");
        DDDs.put(71,"Salvador");
        DDDs.put(11,"São Paulo");
        DDDs.put(21,"Rio de Janeiro");
        DDDs.put(32,"Juiz de Fora");
        DDDs.put(19,"Campinas");
        DDDs.put(27,"Vitoria");
        DDDs.put(31,"Belo Horizonte");
        //Aqui é adicionado os valores no Map



        //Verifica se há algum valor relacionado a chave(DDD), caso não haja retornara null e será impresso "DDD Não Cadastrado",
        //Caso não seja null(!null) então quer dizer que existe um valor relacionado a está chave, então o valor será impresso.
            if (DDDs.get(DDD) != null){
                System.out.println(DDD +" "+ DDDs.get(DDD));
            }else {
                System.out.println("DDD Não cadastrado");
            }




    }
}

