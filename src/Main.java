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

       // System.out.println(minhaStack.toString());
       // System.out.println(minhaStack.peek());
        // -------------------------------------------------
        Fila<Integer> minhaFila = new Fila<>();

        minhaFila.enqueue(1);
        minhaFila.enqueue(20);
        minhaFila.enqueue(49);

        ListaEncadeada<String> minhaLista = new ListaEncadeada<>();

        minhaLista.add("Teste1");
        minhaLista.add("Teste2");
        minhaLista.add("Teste3");
        minhaLista.add("Teste4");


        int[] numeros = {1,2,3,4,5};
        System.out.println(somaArray(numeros, 0));
        System.out.println(contaDigitos(3021));
        System.out.println(palindromo("casa"));

        System.out.println(maioresElementos(numeros, 2, 0));
        System.out.println(maiorDoArray(numeros,0));
    }

    static String stringInvertida(String str) {
        if (str.isEmpty()) {
            return str;
        } else
            return stringInvertida(str.substring(1)) + str.charAt(0);
    }

    static int fibonnaci(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;

        return fibonnaci(n-1) + fibonnaci(n - 2);
    }

    static int somaNumeros(int n) {
       if (n < 10) return 1;

       return (n % 10) + somaNumeros(n/10);
    }

    static int potencia(int n, int y) {
        if (y == 1) return n;

        if (y == 0) return 1;

        return n * potencia(n, y - 1);
    }

    static int somaArray(int[]  numeros, int i) {
        if (i == numeros.length) return 0;

        int soma = numeros[i];

        return soma + somaArray(numeros, i + 1);
    }

    static Boolean palindromo(String str) {
        if (str.length() <= 1) return true;

        if (str.charAt(0) != str.charAt(str.length() - 1)) return false;

        return palindromo(str.substring(1, str.length() - 1));
    }

    static int contaDigitos(int n) {
        if (n < 10) return 1;

        return 1 + contaDigitos(n / 10);
    }

    static int maioresElementos(int[] arr, int x, int i) {
        if (i == arr.length) return 0;

        int contaElementoMaior = (arr[i] > x) ? 1 : 0;

        return contaElementoMaior + maioresElementos(arr, x, i + 1);
    }

    static int maiorDoArray(int[] arr, int i) {
        if (i == arr.length - 1) return arr[i];

        int maior = maiorDoArray(arr, i + 1);

        if (arr[i] > maior) {
            return arr[i];
        } else
            return maior;
    }
    }
