package Nodes;

public class NoArvore <T extends Comparable<T>>{

    private T conteudo;
    private NoArvore<T> noEsq;
    private NoArvore<T> noDir;

    public NoArvore(T conteudo) {
        this.conteudo = conteudo;
        this.noEsq = this.noDir = null;
    }

    public T getConteudo() {
        return conteudo;
    }

    public void setConteudo(T conteudo) {
        this.conteudo = conteudo;
    }

    public NoArvore<T> getNoDir() {
        return noDir;
    }

    public void setNoDir(NoArvore<T> noDir) {
        this.noDir = noDir;
    }

    public NoArvore<T> getNoEsq() {
        return noEsq;
    }

    public void setNoEsq(NoArvore<T> noEsq) {
        this.noEsq = noEsq;
    }

    public String toString() {
        return "NoBin{Conteudo= " + this.getConteudo() +"}";
    }

}
