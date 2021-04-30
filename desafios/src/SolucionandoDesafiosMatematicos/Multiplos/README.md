<h1>Múltiplos</h1>
Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma mensagem "Sao Multiplos" ou "Nao sao Multiplos", indicando se os valores lidos são múltiplos entre si.

<h2>Entrada</h2>
A entrada contém valores inteiros.

<h2>Saída</h2>
A saída deve conter uma das mensagens conforme descrito acima.
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
			<p>6 24</p>
			</td>
			<td>
			<p>Sao Multiplos</p>
			</td>
		</tr>
	</tbody>
  <tbody>
		<tr>
			<td>
			<p>6 25</p>
			</td>
			<td>
			<p>Nao sao Multiplos</p>
			</td>
		</tr>
	</tbody>
</table>

<h2>Código</h2>


```
int n1 = sc.nextInt();
int n2 = sc.nextInt();
```
 As variáveis n1 e n2 recebem um numero inteiro.

```
if( ( n1 % n2 == 0) |( n2 % n1 == 0)){
  System.out.println("Sao multiplos");
}
```
Se o resto da divisão de (n1 por n2) ou(|) (n2 por n1) for igual zero então os numeros são multiplos.

```
else {
  System.out.println("Nao sao Multiplos");
}
```
Caso o resto da divisão for diferente de zero, é impresso na tela "Não sao Multiplos"
