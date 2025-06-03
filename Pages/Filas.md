## ESTRUTURAS DE DADOS - FILAS

Esse tipo de estrutura de dados é muito usado quando é necessária uma "ordem de atendimento", por isso o nome FILAS, já que a dinâmica da estrutura é chamada
de FIFO(First in, First out), em que o primeiro que chega na fila também será o primeiro a ser atendido (assim como uma fila literalmente).

### - Estrutura Base da Fila:

Nas Filas, organizamos os dados (nesse caso os nós) em uma fileira em que cada um desses Nós irá possuir uma <code>refProximoNo</code> que servirá como
uma referência para o Nó logo atrás (próximo da fila) dele, além disso existe também outros dois ponteiros chamados <code>inicio</code> e <code>final</code> 
que servirão para fazer o controle dos nós que entram (no final) e os que saem (os primeiros da fila).

<div align="center">
  <img height="500em" width="1000em" src="https://github.com/willUlisses/Estudo-EstruturaDeDados/blob/master/Images/FILAS/estruturaBase.png"/>
</div>

### - Adicionando um Nó na Fila:

Para adicionar um novo Nó na nossa fila, devemos fazer com que o nosso ULTIMO NÓ aponte sua <code>refProximoNo</code> para o <code>novoNo</code>, que ficará imediatamente atrás dele como o próximo da fila, e para isso atualizaremos a referência de <code>final</code> para o <code>novoNo</code> da seguinte forma: <br>

<code>final.setProximoNo(novoNo);</code ><br>
<code>final = novoNo;</code> <br>

Dessa maneira nós iremos adicionar o <code>novoNo</code> como o útlimo da fila!

<div align="center">
  <img height="600em" width="1100em" src="https://github.com/willUlisses/Estudo-EstruturaDeDados/blob/master/Images/FILAS/AdicionandoNó.png"/>
</div>

### - Removendo um Nó da Fila:

Para remover um nó da fila, apenas iremos atualizar nossa referência de Inicio para o Nó imediatamente próximo dele da seguinte maneira: <br>
<code>inicio = inicio.getProximoNo();</code> <br>
Asssim iremos fazer com que o "primeiro da fila" seja atendido (removido) e o Nó <code>inicio</code> passe a ser o "próximo da fila".

<div align="center">
  <img height="700em" width="1000em" src="https://github.com/willUlisses/Estudo-EstruturaDeDados/blob/master/Images/FILAS/RemovendoNo.png"/>
</div>
