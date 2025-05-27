## ESTRUTURAS DE DADOS - PILHAS

Assim como pilhas de coisas na vida real, essa estrutura de dados obedece a mesma dinâmica de uma pilha de livros por exemplo, você adiciona
um elemento por vez, um acima do outro e o elemento mais fácil de ser removido é o elemento mais ao topo (o úitimo que chegou na pilha) <br><br>
Abaixo serão mostrados 3 pontos sobre a estrutura de dados chamada de Pilha, sendo elas: Estrutura base, Adição de um nó, Remoção de um Nó.

### - Estrutura Base da Pilha:

Nas Pilhas, organizamos os dados (nesse caso os nós) um sobre o outro, cada um desses Nós irá possuir uma <code>refProximoNo</code> que servirá como
uma referência para o Nó logo abaixo dele, além disso existe também outro ponteiro chamado <code>topo</code>, que sempre apontará para o ultimo Nó
que foi adicionado (o topo da pilha).

<div align="center">
  <img height="450em" width="800em" src="https://github.com/willUlisses/Estudo-EstruturaDeDados/blob/master/Images/PILHAS/EstruturaBase.png"/>
</div>

### - Adicionando um Nó na Pilha:

Para adicionar um novo Nó na nossa Pilha, devemos fazer com que o nosso <code>novoNo</code> aponte sua <code>refProximoNo</code> para o Nó imediatamente abaixo dele
(No caso para o antigo topo), e depois atualizaremos a referência de topo para o novo Nó da seguinte forma: <br>

<code>novoNo.setProximoNo(topo);
topo = novoNo;
</code>

<div align="center">
  <img height="500em" width="750em" src="https://github.com/willUlisses/Estudo-EstruturaDeDados/blob/master/Images/PILHAS/AdicionandoUmNó.png"/>
</div>

### - Removendo um Nó da Pilha:

Para remover um nó da pilha, apenas iremos atualizar nossa referência de topo para o Nó imediatamente abaixo dele da seguinte maneira: <br>
<code>topo = topo.getProximoNo();</code> <br>
Asssim iremos deixar o antigo topo (Nó que acabos de remover) sem nenhuma referência apontada para ele, assim ele será excluído da memória.

<div align="center">
  <img height="500em" width="750em" src="https://github.com/willUlisses/Estudo-EstruturaDeDados/blob/master/Images/PILHAS/RemovendoUmNó.png"/>
</div>
