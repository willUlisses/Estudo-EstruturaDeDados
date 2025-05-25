package Nodes;

public class NoDuplo<T> {

    private NoDuplo<T> proximoNo;
    private NoDuplo<T> NoAnterior;
    private T conteudo;

    public NoDuplo(T conteudoNo) {
        this.conteudo = conteudoNo;
        proximoNo = null;
        NoAnterior = null;
    }

    public void setConteudo(T conteudo) {
        this.conteudo = conteudo;
    }

    public T getConteudo() {
        return conteudo;
    }

    public void setNoAnterior(NoDuplo<T> noAnterior) {
        this.NoAnterior = noAnterior;
    }

    public void setProximoNo(NoDuplo<T> proximoNo) {
        this.proximoNo = proximoNo;
    }

    public NoDuplo<T> getProximoNo() {
        return proximoNo;
    }

    public NoDuplo<T> getNoAnterior() {
        return NoAnterior;
    }

    @Override
    public String toString() {
        return "Nodes.NoDuplo{Conteudo: " + conteudo + '}';
    }
}
