package cache;

import java.util.concurrent.ConcurrentHashMap;

class StudentCache {

    private ConcurrentHashMap<Integer , RealStudent> cache = new ConcurrentHashMap<>();


    public void put(ProxyStudent student)
    {
        this.cache.put(student.getRollno(),student);
    }
    public void remove(int rollno)
    {
        this.cache.remove(rollno);
    }
}
