package ImplementacoesNativas;

import java.util.Stack;

public class NativaStack {

        public static void main(String[] args) {

            Stack<Integer> myStack = new Stack<>();

            myStack.push(10);
            myStack.push(20);
            myStack.push(30);

            System.out.println(myStack);
            myStack.pop();
            System.out.println(myStack);
            System.out.println(myStack.peek());
            System.out.println(myStack.empty());

        }

}
