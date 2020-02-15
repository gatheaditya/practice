package cache;

import cache.Student;

public class ProxyStudent extends RealStudent {

    private RealStudent realStudent;
    private long timestamp;

    @Override
    public String toString() {
        return "ProxyStudent{" +
                "realStudent=" + realStudent +
                ", timestamp=" + timestamp +
                '}';
    }

    public ProxyStudent(RealStudent student)
    {
        super(student);
        this.setRealStudent(student);


        this.timestamp=System.currentTimeMillis();
    }

    public RealStudent getRealStudent() {
        return realStudent;
    }

    private void setRealStudent(RealStudent realStudent) {
        this.realStudent = realStudent;
    }

    public long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }

    @Override
    public Student getStudent(int roll) {
        return this.realStudent;
    }


}
