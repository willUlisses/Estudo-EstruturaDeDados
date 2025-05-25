package ListasEncadeadas;

public class ListaDuplamenteEncadeada<T> {

    private NoDuplo<T> refInicio;
    private NoDuplo<T> refFim;

    private int tamanhoLista;

    public ListaDuplamenteEncadeada() {
        refInicio = null;
        refInicio = null;
        tamanhoLista = 0;
    }

    public int size() {
        return this.tamanhoLista;
    }


    private NoDuplo<T> getNo(int index) {
        validaIndice(index);

        NoDuplo<T> noAuxiliar = refInicio;
        for (int i = 0; (i < index) && (noAuxiliar != null) ; i++) {
            noAuxiliar = noAuxiliar.getProximoNo();
        }
        return noAuxiliar;
    }

    public T get(int index) {
        return getNo(index).getConteudo();
    }

    public void add(T conteudo) {
        NoDuplo<T> novoNo = new NoDuplo<>(conteudo);
        novoNo.setProximoNo(null);
        novoNo.setNoAnterior(refFim);

        if (refInicio == null) {
            refInicio = novoNo;
        }
        if (refFim != null) {
            refFim.setProximoNo(novoNo);
        }
        refFim = novoNo;
        tamanhoLista++;
    }

    public void add(T conteudo, int index) {
        NoDuplo<T> noAuxiliar = getNo(index);
        NoDuplo<T> novoNo =  new NoDuplo<>(conteudo);
        novoNo.setProximoNo(noAuxiliar);

        if (novoNo.getProximoNo() != null) {
            novoNo.setNoAnterior(noAuxiliar.getNoAnterior());
            novoNo.getProximoNo().setNoAnterior(novoNo);
        } else {
            novoNo.setNoAnterior(refFim);
            novoNo.setProximoNo(null);
            refFim = novoNo;
        }

        if (index == 0) {
            refInicio = novoNo;
        } else {
            novoNo.getNoAnterior().setProximoNo(novoNo);
        }

        tamanhoLista++;
    }


    public void remove(int index) {
        validaIndice(index);
        if (index == 0) {
            refInicio = refInicio.getProximoNo();
            if (refInicio != null) {
                refInicio.setNoAnterior(null);
            }
        } else {
            NoDuplo<T> noRemovido = getNo(index);
            noRemovido.getNoAnterior().setProximoNo(noRemovido.getProximoNo());

            if (noRemovido != refFim) {
                noRemovido.getProximoNo().setNoAnterior(noRemovido.getNoAnterior());
            } else {
                refFim = refFim.getNoAnterior();
            }
        }

        tamanhoLista--;
    }

    private boolean validaIndice(int index) {
        if (index <= this.size())
            return true;
        else
            throw new IndexOutOfBoundsException("Index " + index + " out of bounds, original size: " + this.size());
    }

    @Override
    public String toString() {
        NoDuplo<T> noAuxiliar = refInicio;
        String stringRetorno = "--- Lista Duplamente Encadeada ---\n ==========\n";

        if (refInicio == null) {
            return "A lista está vazia.";
        }

        stringRetorno += "Inicio --> ";

        for (int i = 0; i < size() ; i++) {
            stringRetorno += "<---[Nodes.No" + i + "{Conteudo: " + noAuxiliar.getConteudo() + "}]---> ";
            if (noAuxiliar.getProximoNo() != null) {
                noAuxiliar = noAuxiliar.getProximoNo();
            }
        }
        stringRetorno += "<--Fim\n";
        stringRetorno += "==========";
        return stringRetorno;
    }

}
