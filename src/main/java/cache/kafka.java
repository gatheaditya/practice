package cache;

import java.util.Map;

public enum kafka {
    INSTANCE;
    private int conf1;
    private String config2;


     void init(Map<String,String> config)
    {

        this.config2=config.get("b");
    }


    public void Printconfigdetails()
    {
        System.out.println(conf1);
        System.out.println(config2);
    }

    public int getMap()
    {
        return this.conf1;
    }
}


