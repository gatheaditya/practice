package cache;

import java.sql.SQLOutput;
import java.util.concurrent.CompletableFuture;

public class asyncTest {

    public static void sleep(long ms)
    {
        try
        {
            Thread.sleep(ms);
        }
        catch(InterruptedException ex)
        {
            System.out.println("" +
                    "exception");
        }
    }

    public static boolean methodA( )
    {
        System.out.println("Method A Started");

        System.out.println("Meyhod A Ended");
        return true;
    }

    public static boolean methodB()
    {
        System.out.println("Method b started");

        System.out.println("Method b Ended");
        return true;
    }

    public static boolean  divideByZero()
    {
        System.out.println(8/0);
        return  true;
    }

    private static  void asncmethod()
    {
        CompletableFuture<Boolean> res2 = CompletableFuture.supplyAsync(() -> methodA())
                .thenApplyAsync((a) -> methodB())
                .thenApplyAsync((a) -> methodA())
                .thenApplyAsync((a)->divideByZero())
                .handleAsync((res,ex)->{
                    if(ex!=null)
                    {

                        System.out.println("ex"+ex.toString());
                        throw new RuntimeException(ex);
                    }
                    return res;
                });

//        res2.whenCompleteAsync((res,ex)->{ throw new RuntimeException(ex);});
    }

    public static void main(String[] args) {


for(int i=0;i<10;i++) {
    asncmethod();
}



    }
}
