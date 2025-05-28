package Fila;

import Nodes.No;

public class Fila<T> {
     No<T> fim;
     No<T> inicio;

     public Fila() {
         this.inicio = null;
         this.fim = null;
     }

     public boolean isEmpty() {
         return inicio == null;
     }

     public void enqueue(T conteudo) {
         No<T> novoNo = new No(conteudo);
         if (isEmpty()) {
            inicio = novoNo;
            fim = novoNo;
         } else {
             fim.setProximoNo(novoNo);
             fim = novoNo;
         }
     }

     public String dequeue() {
         No<T> refDequeue = inicio;
         inicio = inicio.getProximoNo();
         return "Dequeued={" + refDequeue+"}";
     }

     public String first() {
         if (!isEmpty()) {
             return "\nFirst= " + inicio;
         }
         return null;
     }

     @Override
     public String toString() {
         String stringRetorno = "--------------\n";
         stringRetorno += "\t Fila\t\n";
         stringRetorno += "--------------\n";

         No<T> noAuxiliar = inicio;

         if (inicio != null) {
             stringRetorno += "Inicio == ";
             while (true) {
                 stringRetorno += "[No{dado=" + noAuxiliar.getConteudo() +"}]----> ";
                 if (noAuxiliar.getProximoNo() != null) {
                     noAuxiliar = noAuxiliar.getProximoNo();
                 } else {
                     stringRetorno += "Fim";
                     break;
                 }
             }
         } else {
             throw new NullPointerException("A fila está vazia");
         }
         stringRetorno += "\n============";
         return stringRetorno;
     }
    }


