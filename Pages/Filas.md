## ESTRUTURAS DE DADOS - FILAS

Esse tipo de estrutura de dados é muito usado quando é necessária uma "ordem de atendimento", por isso o nome FILAS, já que a dinâmica da estrutura é chamada
de FIFO(First in, First out), em que o primeiro que chega na fila também será o primeiro a ser atendido (assim como uma fila literalmente).

### - Estrutura Base da Fila:

Nas Pilhas, organizamos os dados (nesse caso os nós) um sobre o outro, cada um desses Nós irá possuir uma <code>refProximoNo</code> que servirá como
uma referência para o Nó logo abaixo dele, além disso existe também outro ponteiro chamado <code>topo</code>, que sempre apontará para o ultimo Nó
que foi adicionado (o topo da pilha).

<div align="center">
  <img height="500em" width="1000em" src="https://github.com/willUlisses/Estudo-EstruturaDeDados/blob/master/Images/FILAS/estruturaBase.png"/>
</div>

### - Adicionando um Nó na Fila:

Para adicionar um novo Nó na nossa Pilha, devemos fazer com que o nosso <code>novoNo</code> aponte sua <code>refProximoNo</code> para o Nó imediatamente abaixo dele
(No caso para o antigo topo), e depois atualizaremos a referência de topo para o novo Nó da seguinte forma: <br>

<code>novoNo.setProximoNo(topo);
topo = novoNo;
</code>

<div align="center">
  <img height="600em" width="1100em" src="https://github.com/willUlisses/Estudo-EstruturaDeDados/blob/master/Images/FILAS/AdicionandoNó.png"/>
</div>

### - Removendo um Nó da Fila:

Para remover um nó da pilha, apenas iremos atualizar nossa referência de topo para o Nó imediatamente abaixo dele da seguinte maneira: <br>
<code>topo = topo.getProximoNo();</code> <br>
Asssim iremos deixar o antigo topo (Nó que acabos de remover) sem nenhuma referência apontada para ele, assim ele será excluído da memória.

<div align="center">
  <img height="500em" width="750em" src="https://github.com/willUlisses/Estudo-EstruturaDeDados/blob/master/Images/FILAS/RemovendoNó.png"/>
</div>
