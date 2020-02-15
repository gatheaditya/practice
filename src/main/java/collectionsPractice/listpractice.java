package collectionsPractice;

import java.util.*;

public class listpractice {

    public static void main(String[] args) {
        Vector<Integer>  vectorlist = new Vector();
       for(int i =0;i<100;i++)
           vectorlist.add(i);

        System.out.println(vectorlist.size());

        System.out.println("iterator forward direction ");
        Iterator itr = vectorlist.iterator();
        while (itr.hasNext())
            System.out.print(itr.next()+" ");

        ListIterator listiterator = vectorlist.listIterator();
        System.out.println("=============");
        System.out.println("listiterator forward direction ");
        while (listiterator.hasNext())
            System.out.print(listiterator.next()+" ");
        System.out.println("=============");
        System.out.println("listiterator reverse iteration  ");
        while (listiterator.hasPrevious())
            System.out.print(listiterator.previous()+" ");


//        System.out.println(vector.spliterator().characteristics());
    }
}
