<h1>Entrada e Saída CPF</h1>

<h2>Desafio</h2>
<p>Elabore um programa que possuas as características abaixo:<p>

Leia os dados de um CPF no formato XXX.YYY.ZZZ-DD;
Imprima os quatro grupos numéricos, sendo um valor por linha.
<h2>Entrada</h2>
A entrada consiste vários arquivos de teste e cada um possuindo uma linha com formato XXX.YYY.ZZZ-DD, onde XXX, YYY, ZZZ, DD são números inteiros.

<h2>Saída</h2>
Para cada arquivo da entrada, tem que ter um arquivo de saída com quatro linhas, e em cada linha um número inteiro de acordo com procedimento 2 descrito no Desafio. Confira o exemplo abaixo:

<table style="width:100%">
  <tr>
    <th>Entrada</th>
    <td>Saida</td>
  </tr>
  <tr>
    <th rowspan="4">320.025.102-01</th>
    <td>320</td>
  </tr>
  <tr>
    <td>025</td>
  </tr>
  <tr>
    <td>102</td>
  </tr>
   <tr>
    <td>01</td>
  </tr>
</table>

<h2>Código</h2>

 `String[] cpf = new String[4];`É criado um array onde será guardado o cpf.
 
 `cpf = sc.nextLine().split("\\.|-");`
  .split separa as strings usando um regex e delimita a palavra ao encontrar(um ponto {\\.}) (ou um traço{|-}).
  
  ` for(int i = 0; i < cpf.length;i++)` Percorre as strings já separadas pelo split.

   `System.out.printf("%s\n",cpf[i]);` \n insere uma nova linha, fazendo cada parte do cpf ser impresso e linhas separadas.

