package cache2;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class filterPractice {

    public static void main(String[] args) {

        List<Integer>  list = new ArrayList<>();

        for(int i=0;i<100;i++)
        {
            list.add(i);
        }
        System.out.println(list.spliterator().characteristics());
        System.out.println(list.spliterator().getExactSizeIfKnown());
        System.out.println();


String a = "aditya";
String e = "aditya";
String b= new String("aditya");
String c =b;
//        list.stream()
//                .map((a)->a*2)
//                .collect(Collectors.toList())
//                .forEach(System.out::println);

        int x=10;
        String f="ab";


        f.charAt(1);


    }
}
