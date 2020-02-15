package cache;


import java.util.ArrayList;
import java.util.List;

import static cache.animal.Assert;
import static cache.animal.many;

public class animalImpl {
    public static void main(String[] args) {


        List<animal> animalList = new ArrayList<>();

        animalList.add(new animal("name1",4,"class3"));
        animalList.add(new animal("name2",2,"class2"));
        animalList.add(new animal("name3",2,"class1"));

        System.out.println(animalList.get(1).toString());




    }
}
