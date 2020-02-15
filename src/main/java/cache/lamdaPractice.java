package cache;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ForkJoinPool;

public class lamdaPractice {
 private  static List<Integer> numbers = new ArrayList<>();





public static  int transform(int a,int b)
{
    int i=0;
    int result=1;
    while(i<b) {

        result = a * result;
        i++;
    }
    return result;

    }

    public static void createArray()
    {
        for(int i=0;i<10000;i++)
        {
            numbers.add(new Random().nextInt(20));
        }

    }
    public static void main(String[] args) {
        List<person> personList = new ArrayList<person>();
        personList.add(new person("aditya","M",20));
        personList.add(new person("aditya1","f",32));
        personList.add(new person("aditya2","M",20));
        personList.add(new person("aditya3","f",30));
        personList.parallelStream().filter(e->e.getAge()==20).map(e->e.getName());
        ForkJoinPool.getCommonPoolParallelism();
        long start=System.currentTimeMillis();
//      createArray();
        numbers.parallelStream().map(e->transform(e,5)).forEach(e->System.out.println(e+"-->"+Thread.currentThread()));
        System.out.println("took -->"+(System.currentTimeMillis()-start)+" Ms");
        System.out.println(Runtime.getRuntime().availableProcessors()+"No of threads" +ForkJoinPool.getCommonPoolParallelism());

        CompletableFuture<String> future = new CompletableFuture<>();

    }
}
