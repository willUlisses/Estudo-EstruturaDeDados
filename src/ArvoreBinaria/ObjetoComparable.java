package ArvoreBinaria;

import java.util.Objects;

public class ObjetoComparable extends ObjArvore<ObjetoComparable> {

    Integer meuValor;

    public ObjetoComparable(Integer meuValor) {
        this.meuValor = meuValor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ObjetoComparable obj = (ObjetoComparable) o;
        return Objects.equals(meuValor, obj.meuValor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(meuValor);
    }

    @Override
    public int compareTo(ObjetoComparable o) {
        int i = 0;

        if (this.meuValor > o.meuValor){
            i = 1;
        } else if(this.meuValor < o.meuValor) {
            i = -1;
        }
        return i;
    }

    @Override
    public String toString() {
        return meuValor.toString();
    }
}
