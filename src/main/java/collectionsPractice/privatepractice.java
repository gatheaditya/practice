package collectionsPractice;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class privatepractice {


    public static void main(String[] args)  throws ClassNotFoundException , IllegalAccessException , InvocationTargetException, InstantiationException {



       Class testprivate = Class.forName("collectionsPractice.testprivate");
        Object  privateinstance =testprivate.newInstance();
         Method[] methods=testprivate.getDeclaredMethods();
         for(Method m : methods) {
             m.setAccessible(true);
             System.out.println("in Method " + m.getName());
             System.out.println(m.invoke(privateinstance, 2, 3));
         }

    }
}
