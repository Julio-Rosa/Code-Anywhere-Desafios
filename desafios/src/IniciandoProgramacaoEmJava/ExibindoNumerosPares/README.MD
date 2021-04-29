<h1>Exibindo Números Pares</h1>

<h2>Desafios</h2>
Crie um programa que leia um número e mostre os números pares até esse número, inclusive ele mesmo.

<h2>Entrada</h2>
Você receberá 1 valor inteiro N, onde N > 0.

<h2>Saída</h2>
Exiba todos os números pares até o valor de entrada, sendo um em cada linha. 

<table style="width:100%">
  <tr>
    <th>Entrada</th>
    <td>Saida</td>
  </tr>
  <tr>
    <th rowspan="3">6</th>
    <td>2</td>
  </tr>
  <tr>
    <td>4</td>
  </tr>
  <tr>
    <td>6</td>
  </tr>
 
</table>
<h2>Código</h2>

`int n = sc.nextInt();` A variável <strong>n</strong> recebe o número a ser comparado

 `for (int i = 0; i <= n; i++)`Itera sobre o número recebido na variável n(0 <= 6)
  ```
  if (i % 2 == 0 && i > 0) {
      System.out.println(i);
   }
   ```
   Se o resto da divisão deste número for igual á 0 então ele é par, então se este mesmo número for par e(&&) for maior do que 0( > 0)  ele sera impresso.
                
