package ArvoreBinaria;

public abstract class ObjArvore<T> implements Comparable<T>{
   public abstract boolean equals(Object o);
   public abstract int hashCode();
   public abstract int compareTo(T o);
   public abstract String toString();
}
