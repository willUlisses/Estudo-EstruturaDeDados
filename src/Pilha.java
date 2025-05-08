public class Pilha<T> {
    No<T> topo;

    public Pilha() {
        this.topo = null;
    }

    public void push(No<T> novoNo) {
        No<T> refProxNo = topo;
        topo = novoNo;
        novoNo.setProximoNo(refProxNo);
    }

    public No<T> top() {
        if (isEmpty()) {
            throw new IllegalStateException("This Stack is Empty");
        }
        return topo;
    }

    public No<T> pop() {
        if (isEmpty()) {
            throw new IllegalStateException("This Stack is Empty");
        }
        No noPopped = topo;
        topo = topo.getProximoNo();
        return noPopped;
    }

    public boolean isEmpty() {
        return topo == null;
    }

    @Override
    public String toString() {
        String stringRetorno = "-------------\n";
        stringRetorno += "\t Pilha\n";
        stringRetorno += "-------------\n";

        No noAuxiliar = topo;

        while (true) {
            if (noAuxiliar != null) {
                stringRetorno += "[No{dado=" + noAuxiliar.getConteudo() +"}]\n";
                noAuxiliar = noAuxiliar.getProximoNo();
            } else {
                break;
            }
        }
        stringRetorno += "============\n";
        return stringRetorno;
    }
}
