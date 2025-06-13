package ImplementacoesNativas;

import java.util.ArrayList;
import java.util.List;

public class NativaList {
    public static void main(String[] args) {

        List<Integer> myList = new ArrayList<Integer>();

        myList.add(10);
        myList.add(20);
        myList.add(30);
        myList.add(40);
        System.out.println(myList);

        myList.add(0,5);
        System.out.println(myList);

        //myList.clear();
        //System.out.println(myList);

        System.out.println(myList.get(3));
        System.out.println(myList.set(3, 31));
        System.out.println(myList);



    }
}
