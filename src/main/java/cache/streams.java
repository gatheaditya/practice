package cache;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class streams {

    public static void main(String[] args) {

        int sum=0;
       List<Integer> integers=Stream.iterate(1, e->e+2)
                .limit(12)
                .collect(Collectors.toList());

        integers.stream().filter(e->e%2>0)
            .forEach(System.out::println);

        List<Integer> list = Arrays.asList(1,2,3,4,5,6);

//        System.out.println(IntStream.range(1,10).sum());

//        Stream.of("aditya","a","b","mani  ","g","l")
//                .sorted()
//                .filter(e->e.startsWith("m"))
//                .findFirst()
//                .ifPresent(e-> System.out.println(e));
        System.out.println("===========");
        System.out.println(Stream.iterate(1,e->e+1)
        .map(e->e+1)

        .limit(2)
        .reduce((e1,e2)->e1+e2));

        System.out.println("============");


        System.out.println(Stream.of("a","b","c","a","b","d")
                .filter(e->e.equals("a"))
                .count());
                 }


}
