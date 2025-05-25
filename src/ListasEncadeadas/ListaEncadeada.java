package ListasEncadeadas;

public class ListaEncadeada<T> {

    No<T> refEntrada;

    public ListaEncadeada() {
        this.refEntrada = null;
    }

    public int size() {
        int listSize = 0;
        No<T> refTamanho = refEntrada;
        while(true) {
            if (refTamanho != null) {
                listSize++;
                if (refTamanho.getProximoNo() != null) {
                    refTamanho = refTamanho.getProximoNo();
                } else break;
            } else break;
        }
        return listSize;
    }

    private void validaIndice(int index) {
        if (index >= size()) {
            throw new IndexOutOfBoundsException("The index " + index + " is higher than the size of this list");
        }
    }

    private No<T> getNo(int index) {
        validaIndice(index);
        No<T> noAuxiliar = refEntrada;
        No<T> noRetorno = null;
        for (int i = 0; i <= index; i++) {
            noRetorno = noAuxiliar;
            noAuxiliar = noAuxiliar.getProximoNo();
        }
        return noRetorno;
    }

    public T get(int index) {
        return getNo(index).getConteudo();
    }

    public void add(T conteudo) {
        No<T> novoNo = new No<>(conteudo);
        if (isEmpty()) {
            refEntrada = novoNo;
            return;
        }

        No<T> refAuxiliar = refEntrada;
        for (int i = 0; i < this.size() - 1; i++) {
            refAuxiliar = refAuxiliar.getProximoNo();
        }
        refAuxiliar.setProximoNo(novoNo);
    }

    public T remove(int index) {
        No<T> noRemovido = this.getNo(index);
        if (index == 0) {
            refEntrada = noRemovido.getProximoNo();
            return noRemovido.getConteudo();
        }

        No<T> noAnterior = getNo(index - 1);
        noAnterior.setProximoNo(noRemovido.getProximoNo());

        return noRemovido.getConteudo();
    }

    private boolean isEmpty() {
        return refEntrada == null;
    }

    @Override
    public String toString(){
        String stringRetorno = "";
        No<T> noAtual = refEntrada;

        for (int i = 0; i <= size() - 1; i++) {
            stringRetorno += "Nodes.No{Conteudo=" + noAtual.getConteudo()+"}-----> ";
            noAtual = noAtual.getProximoNo();
        }
        stringRetorno += "null";
        return stringRetorno;
    }

}
