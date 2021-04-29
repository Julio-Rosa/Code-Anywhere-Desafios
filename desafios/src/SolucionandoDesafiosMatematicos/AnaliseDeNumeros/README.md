<h1> Análise de Números</h1>

<h2>Desafio</h2>
Você deve fazer a leitura de 5 valores inteiros. Em seguida mostre quantos valores informados são pares, quantos valores informados são ímpares, quantos valores informados são positivos e quantos valores informados são negativos.

<h2>Entrada</h2>
Você receberá 5 valores inteiros.

<h2>Saída</h2>
Exiba a mensagem conforme o exemplo de saída abaixo, sendo uma mensagem por linha e não esquecendo o final de linha após cada uma.

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
			<p>-5<br>
			0<br>
			-3<br>
			-4<br>
			12</p>
			</td>
			<td>
			<p>3 valor(es) par(es)<br>
			2 valor(es) impar(es)<br>
			1 valor(es) positivo(s)<br>
			3 valor(es) negativo(s)</p>
			</td>
		</tr>
	</tbody>
</table>

<h2>Código</h2>

```
for (int i = 1; i <= 5; i++) {
    Integer numero = leitor.nextInt();
}
```
A váriavel <strong>número</strong> recebe valores de <strong>leitor.nextInt</strong>, até que o contador chegue em 5.


```
if (numero < 0){
   negativos++;
}
```
Se o número é menor(<) que 0 então ele é negativo, então o contador de negativos recebe +1.

```
else if (numero > 0){
  positivos++;
}
```
Se o número é menor(>) que 0 então ele é positivo, então o contador de positivos recebe +1.

```
if (numero % 2 == 0){
  pares++;
}
```
 Um número é par se esse o resto da divisão(%) deste número por 2(numero % 2) for igual a 0, então a variavel pares recebe +1.

```            
else {
 impares++;
}
```
Se o resto da divisão deste número, não for igual a 0 então ele é impar, a variavel impares recebe +1.



