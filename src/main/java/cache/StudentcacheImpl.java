package cache;

class StudentcacheImpl {

    public static void main(String[] args) {

        ProxyStudent s1 = new ProxyStudent(new RealStudent(1,"aditya",new String[]{"test1","test2","test3"}));

        System.out.println(s1.getRealStudent().toString());



    }
}
