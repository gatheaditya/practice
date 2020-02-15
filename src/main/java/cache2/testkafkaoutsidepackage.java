package cache2;


import cache.kafka;

import java.util.HashMap;
import java.util.Map;

public class testkafkaoutsidepackage {

    public static void main(String[] args) {

        Map<String ,String> map = new HashMap<>();
        map.put("a","1");
        map.put("b","2");

        kafka k= kafka.INSTANCE;








    }





}
