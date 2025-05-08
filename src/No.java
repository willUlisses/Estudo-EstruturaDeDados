public class No<T> {

    private T conteudo;
    private No proximoNo;

    public No(T conteudo) {
        this.conteudo = conteudo;
        this.proximoNo = null;
    }

    public No(T conteudo, No proximoNo) {
        this.conteudo = conteudo;
        this.proximoNo = proximoNo;
    }

    public T getConteudo() {
        return conteudo;
    }

    public void setConteudo(T conteudo) {
        this.conteudo = conteudo;
    }

    public void setProximoNo(No<T> proximoNo) {
        this.proximoNo = proximoNo;
    }

    public No<T> getProximoNo() {
        return proximoNo;
    }

    @Override
    public String toString() {
        return "No: {Conteudo: " + conteudo +"}";
    }
}
