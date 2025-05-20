public class ListaDuplamenteEncadeada<T> {

    private NoDuplo<T> refInicio;
    private NoDuplo<T> refFim;

    private int tamanhoLista;

    public ListaDuplamenteEncadeada() {
        refInicio = null;
        refInicio = null;
        tamanhoLista = 0;
    }

    private int size() {
        return tamanhoLista;
    }

}
