package cache;

import java.util.concurrent.*;

public class ExecutableServicesImpl {

    public static String transform1()
    {
        sleep(100);
        return "transformed";
    }
    public static String transform2()
    {
        sleep(100);
        return "transformed";
    }
    public static String transform3()
    {
        sleep(100);
        return "transformed";
    }
    public static  void sleep(long ms)
    {
        try
        {
         Thread.sleep(ms);
        }catch(InterruptedException ex)
        {

        }
    }

   private  static  ExecutorService executor = Executors.newCachedThreadPool();

    public static void main(String[] args) {
        Future<String> res=null;
        String ans=null;
        try {
             res= executor.submit(() -> transform1());
             ans=res.get(10, TimeUnit.MILLISECONDS);
        }catch(TimeoutException|InterruptedException | ExecutionException ex)
        {
            if(ex instanceof TimeoutException)
            {
                res.cancel(true);
            }
            else if(ex instanceof ExecutionException )
            {
                System.out.println("executionException");
            }
        }
        finally {
            System.out.println(ans);
        }



    }
}
