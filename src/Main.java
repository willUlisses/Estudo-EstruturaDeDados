import Fila.Fila;
import ListasEncadeadas.ListaEncadeada;
import Nodes.No;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        No<Integer> primeiroNo = new No<>(10);
        No<Integer> segundoNo = new No<>(20);
        No<Integer> terceiroNo = new No<>(30);
        No<Integer> quartoNo = new No<>(40);


        Stack<No<Integer>> minhaStack = new Stack<>();

        minhaStack.push(primeiroNo);
        minhaStack.push(segundoNo);
        minhaStack.push(terceiroNo);
        minhaStack.push(quartoNo);

        System.out.println(minhaStack);
       // System.out.println(minhaStack.peek());
        // -------------------------------------------------
        Fila<Integer> minhaFila = new Fila<Integer>();

        minhaFila.enqueue(1);
        minhaFila.enqueue(20);
        minhaFila.enqueue(49);

        System.out.println(minhaFila);

        ListaEncadeada<String> minhaLista = new ListaEncadeada<>();

        minhaLista.add("Teste1");
        minhaLista.add("Teste2");
        minhaLista.add("Teste3");
        minhaLista.add("Teste4");



    }
    }
