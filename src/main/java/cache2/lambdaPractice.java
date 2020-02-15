package cache2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class lambdaPractice {

    public static void main(String[] args) {

        List<String> list1 = new ArrayList<>(1);

       list1 = Arrays.asList("one","two","three","four","five");

        list1.stream()
               .filter((data)->data.contains("o"))
                .map((data)->data.replace("o","i"))
               .forEach(System.out::println);




    }
}
