<h1>DDD</h1>
<p>Leia um número inteiro que representa um código de DDD para discagem interurbana.
Em seguida, informe à qual cidade o DDD pertence, considerando a tabela abaixo:</p>
<img alt="" src="https://resources.urionlinejudge.com.br/gallery/images/problems/UOJ_1050.png" style="height:175px; width:368px">
Se a entrada for qualquer outro DDD que não esteja presente na tabela acima, o programa deverá informar:
DDD nao cadastrado.
<h2>Entrada</h2>
A entrada consiste de um único valor inteiro.
<h2>Saída</h2>
Imprima o nome da cidade correspondente ao DDD existente na entrada. Imprima DDD nao cadastrado caso não existir DDD correspondente ao número digitado.

<table>
	<thead>
		<tr>
			<td>Exemplo de Entrada</td>
			<td>Exemplo de Saída</td>
		</tr>
	</thead>
	<tbody>
		<tr>
			<td>
			<p>11</p>
			</td>
			<td>
			<p>Sao Paulo</p>
			</td>
		</tr>
	</tbody>
</table>

``int DDD = leitor.nextInt();``
<p>leitor.nextInt lê um inteiro, que é adicionado na variâvel DDD</p>

``Map<Integer,String> DDDs = new HashMap<Integer,String>();``
<p>Map recebe dois parâmetros<Chave,Valor>, Onde a chave é o DDD e o valor é a cidade pertencente a este ddd.</p>

 ``DDDs.put(61,"Brasilia");``
 <p>DDs.put insere os valores no HashMap</p>

 ```
 if (DDDs.get(DDD) != null){
    System.out.println(DDD +" "+ DDDs.get(DDD));
 }else {
    System.out.println("DDD Não cadastrado");
 }
 ```
 <p>No bloco acima é verificado se há algum valor relacionado a chave(DDD), caso não haja retornara null e será impresso "DDD Não Cadastrado",
  Caso não seja null(!null) então quer dizer que existe um valor relacionado a está chave, então o valor será impresso.</p>
             
          
            
