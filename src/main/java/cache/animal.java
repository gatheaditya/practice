package cache;

public class animal {

    private String type;
    private int nooflegs;
    private String family;

    public animal(String type, int nooflegs, String family) {
        this.type = type;
        this.nooflegs = nooflegs;
        this.family = family;
    }

    @Override
    public String toString() {
        return "animal{" +
                "type='" + type + '\'' +
                ", nooflegs=" + nooflegs +
                ", family='" + family + '\'' +
                '}';
    }

    static
    {
        System.out.println("print when animal is created");

    }

    public static boolean Assert(String expected,String actual)
    {
        return expected.equals(actual);
    }

    public static void many()
    {
        System.out.println("static methosd is called.....");
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getNooflegs() {
        return nooflegs;
    }

    public void setNooflegs(int nooflegs) {
        this.nooflegs = nooflegs;
    }

    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }
}
