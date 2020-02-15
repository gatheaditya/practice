package collectionsPractice;


import java.util.*;
import java.util.stream.Collectors;


public class SetPractice {

    public static void main(String[] args) {
        HashSet<Integer> s = new HashSet();
        s.add(4);
        s.add(1);
        s.add(2);
        s.add(3);
        s.add(2);

        TreeSet<Integer> ts = new TreeSet<>();

        List l = Arrays.asList(new Integer[]{1});

//        s.retainAll(l);
//        s.removeAll(Arrays.asList(new Integer[]{5,6,7,8,9}));
//        s.retainAll(Arrays.asList(new Integer[]{5,6,7,8,9}));
        s.addAll(Arrays.asList(new Integer[]{5,6,7,8,9}));

       List greaterthan2= s.stream()
                .map(e-> e*2)
               .filter(e->e>4)
                .collect(Collectors.toList());
        System.out.println("Strat");
       for(Object i :greaterthan2)
           System.out.println(i);

        System.out.println("End");
        ts.addAll(s);

        System.out.println("Tress set operations begin");
        Iterator treeitr = ts.descendingIterator();

        while(treeitr.hasNext()) {
            System.out.println(treeitr.next());
        }

        System.out.println("=============");
        System.out.println(s.size());
        System.out.println("=============");
        Iterator itr =  s.iterator();

        while (itr.hasNext())
            System.out.println(itr.next());
    }



}
