package ListasEncadeadas;

import Nodes.No;

public class ListaCIrcular <T> {
    No<T> cabeca;
    No<T> cauda;
    private int tamanhoLista;

    public ListaCIrcular() {
        cauda = null;
        cabeca = null;
        tamanhoLista = 0;
    }


    private No<T> getNo(int index) {
        if (isEmpty()) throw new IndexOutOfBoundsException("Index : " + index + " Size: " + tamanhoLista);

        if (index == 0) {
            return this.cauda;
        }

        /*Detalhe: o teste de noAuxiliar != null não é necessário pois como é uma lista circular
        nenhum dos nós irá apontar para null, eles estão em um "loop", mas a verificação
        irá continuar ai por fins didáticos.*/
        No<T> noAuxiliar = this.cauda;
        for (int i = 0; (i <= index) && (noAuxiliar != null); i++) {
            noAuxiliar = noAuxiliar.getProximoNo();
        }
        return noAuxiliar;
    }

    public T get(int index) {
        return getNo(index).getConteudo();
    }

    public void add(T conteudo) {
        No<T> novoNo = new No<>(conteudo);
        if (isEmpty()) {
            this.cabeca = novoNo;
            this.cauda = this.cabeca;
            this.cabeca.setProximoNo(cauda);
        } else {
            novoNo.setProximoNo(this.cauda);
            this.cabeca.setProximoNo(novoNo);
            this.cauda = novoNo;
        }
        this.tamanhoLista++;
    }

    public void remove(int index) {
        if (index >= this.tamanhoLista) throw new IndexOutOfBoundsException("Index : " + index + " Size: " + tamanhoLista);

        No<T> noRemove = this.cauda;
        if (index == 0) {
            this.cauda = cauda.getProximoNo();
            this.cabeca.setProximoNo(this.cauda);
        } else if (index == 1) {
            this.cauda.setProximoNo(this.cauda.getProximoNo().getProximoNo());
        } else {
            for (int i = 0; i < index - 1; i++) {
                noRemove = noRemove.getProximoNo();
            }
            noRemove.setProximoNo(noRemove.getProximoNo().getProximoNo());
        }
        this.tamanhoLista--;
    }


    public int size() {
        return this.tamanhoLista;
    }

    private boolean isEmpty() {
        return tamanhoLista == 0;
    }

}
