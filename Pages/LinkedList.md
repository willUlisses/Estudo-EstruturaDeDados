## LISTAS - LINKED LISTS:

Esse tipo de estrutura de dados é o mais semelhante de todos com as Filas, nele temos nós encadeados por referências, basicamente cada nó da nossa lista contém uma referência para o próximo Nó,
mas não temos uma ordem estrita a ser seguida aqui, podemos adicionar e remover Nós de qualquer lugar da lista, o que será descrito mais abaixo.

### Estrutura Básica de uma Linked List:

Na esquerda da imagem temos a representação dos Nós, contendo um conteúdo(<code>Object();</code>) e uma referência para o próximo nó dele, tida como <code>refProximoNo</code>,
além de conter uma referência de entrada(inicio) e de final na lista, em que seu uso será descrito mais abaixo.

<div align="center">
   <img height="600em" width="1100em" src="https://github.com/willUlisses/Estudo-EstruturaDeDados/blob/master/Images/LISTAS/ListasEncadeadas/estruturaBasica.png"/>
</div>

### Adição de um Nó na Lista:

Como dito acima, nas Listas Encadeadas nós conseguimos adicionar Nós em qualquer lugar da nossa estrutura de dados, tanto no final, como no meio e no começo, e abaixo vou ilustrar cada uma dessas 
situações.

#### --> Adicionando no Final:

Quando queremos adicionar o nosso <code>novoNo</code> no final da lista, a operação é bem mais simples, nós iremos apenas atualizar as referências do nó que estava anteriormente no final e iremos
atualizar a própria referência de fim da lista da seguinte forma:

<code>final.setProximoNo(novoNo);</code> <br>
<code>final = novoNo</code>

<div align="center">
   <img height="600em" width="1000em" src="https://github.com/willUlisses/Estudo-EstruturaDeDados/blob/master/Images/LISTAS/ListasEncadeadas/AdicionandoNoFinal.png"/>
</div>

#### --> Adicionando no Meio:

Para adicionar um Nó no meio da lista teremos que utilizar de um índice, no nosso caso como temos 3 Nós na lista original então temos os índices do 0 ao 2. Vamos tentar adicionar um Nó no índice 1, ou seja, no lugar do No 2 para isso nossa lista será percorrida até o índice anterior ao 1, ou seja vai até o Nó 1 que está no ìndice 0, e com isso já podemos manipular as referências. <br> Vamos chamar o Nó 1 (Nó no indice que o loop chegou) de <code>noAtual</code> e então vamos atualizar a referência de próximo Nó do <code>novoNo</code> para o Nó 2 e iremos depois colocar a referência de próximo Nó do Nó 1 (que estamos chamando de <code>noAtual</code>) para o <code>novoNo</code>, assim vamos colocar o <code>novoNo</code> na posição 1 entre o Nó 1 e Nó 2. Abaixo vai o código:


<code>novoNo.setProximoNo(noAtual.getProximoNo());</code> <br>
<code>noAtual.setPrOximoNo(novoNo);</code>

> detalhe, quando usamos <code>noAtual.getProximoNo()</code> na primeira linha, estamos nos referindo ao Nó 2, porque se noAtual é o No 1 então o próximo à ele seria o Nó 2 (ainda não tinhamos atualizado a referência do Nó 1 para o novoNo).

<div align="center">
   <img height="500em" width="900em" src="https://github.com/willUlisses/Estudo-EstruturaDeDados/blob/master/Images/LISTAS/ListasEncadeadas/AdicionandoNoMeio.png"/>
</div> 

#### --> Adicionando no Começo:

Pra Adicionar um Nó no começo o processo é tão simples quanto no final, nós vamos verificar se o índice que estamos passando é o primeiro da lista, se for então iremos atualizar as referências de entrada e a do próprio
<code>novoNo</code> da seguinte forma:

<code>if (index == 0) {
         novoNo.setProximoNo(refEntrada);
         refEntrada = novoNo;
      }</code>

<div align="center">
   <img height="500em" width="900em" src="https://github.com/willUlisses/Estudo-EstruturaDeDados/blob/master/Images/LISTAS/ListasEncadeadas/AdicionandoNoComeço.png"/>
</div> 
