 <h1>Área do Círculo</h1>

A fórmula para calcular a área de uma circunferência é: area = π . raio2. Considerando para este problema que π = 3.14159:
- Efetue o cálculo da área, elevando o valor de raio ao quadrado e multiplicando por π.

<h2>Entrada</h2>
A entrada contém um valor de ponto flutuante (dupla precisão), no caso, a variável raio.

<h2>Saída</h2>
Apresentar a mensagem "A=" seguido pelo valor da variável area, conforme exemplo abaixo, com 4 casas após o ponto decimal. Utilize variáveis de dupla precisão (double). Como todos os problemas, não esqueça de imprimir o fim de linha após o resultado, caso contrário, você receberá "Presentation Error".


<table>
	<thead>
		<tr>
			<td>Exemplos de Entrada</td>
			<td>Exemplos de Saída</td>
		</tr>
	</thead>
	<tbody>
		<tr>
			<td>
			<p>2.00</p>
			</td>
			<td>
			<p>A=12.5664</p>
			</td>
		</tr>
	</tbody>
</table>

<h2>Código</h2>

`double raio = scan.nextDouble();` A variável <strong>raio</strong> recebe um numero do tipo Double

 `double area = 3.14159 * (Math.pow(raio,2));`
  A variavel area recebe o valor retornado de `3.14159 * (Math.pow(raio,2));`
  <strong>Math.pow</strong> , eleva o valor de raio por 2.<strong>(raio * raio)</strong>
  
  `System.out.printf("A=%.4f\n", area);`
   Imprime o valor recebido pela variável raio.
   
   `%.4f` formata a saida para impimir apenas 4 numeros depois do ponto.
