package ImplementacoesNativas;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class NativaHashSet {
    public static void main(String[] args) {

        Set<Integer> myHashSet = new HashSet<>();

        myHashSet.add(10);
        myHashSet.add(20);
        myHashSet.add(30);
        myHashSet.add(40);
        myHashSet.add(50);

        System.out.println(myHashSet);


        Set<Integer> myTreeSet = new TreeSet<>();

        myTreeSet.add(10);
        myTreeSet.add(20);
        myTreeSet.add(30);
        myTreeSet.add(40);
        myTreeSet.add(50);

        System.out.println(myTreeSet);

    }
}
