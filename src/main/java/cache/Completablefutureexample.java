package cache;

import java.util.concurrent.*;

public class Completablefutureexample {





private static  void sleep(long ms)
{
    try
    {
     Thread.sleep(ms);
    }catch(InterruptedException ex)
    {
        System.out.println(ex);
    }
}

public static  String  transform()
    {
        sleep(100);
//        int i=8/0;
        return "transormed";

    }
    public static void main(String[] args) {
        ExecutorService taskexecutor = Executors.newCachedThreadPool();
        CompletableFuture<String> completewithintime=null;
        String result=null;
    try {
       Future<String> future1= taskexecutor.submit(()->transform());
        completewithintime= CompletableFuture.supplyAsync(() -> transform());
        result=completewithintime.get(10, TimeUnit.MILLISECONDS);

    }catch(InterruptedException |TimeoutException | ExecutionException ex)
    {
        if(ex instanceof TimeoutException)
        {
            completewithintime.cancel(true);
        }
        else if(ex  instanceof ExecutionException )
        {
            System.out.println("Exception During Execution"+ex.getCause());
        }
    }
    finally {
        System.out.println(result);

    }
    }
}
