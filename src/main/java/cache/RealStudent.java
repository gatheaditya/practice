package cache;

import cache.Student;

import java.util.Arrays;

public class RealStudent  implements Student {

    private int rollno;
    private  String name;
    private String[] cources;

    RealStudent(RealStudent student)
    {
        this.rollno=student.rollno;
        this.name= student.name;
        this.cources=student.cources;
    }

    public RealStudent(int rollno, String name, String[] cources) {
        this.rollno = rollno;
        this.name = name;
        this.cources = cources;
    }

    public int getRollno() {
        return rollno;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "RealStudent{" +
                "rollno=" + rollno +
                ", name='" + name + '\'' +
                ", cources=" + Arrays.toString(cources) +
                '}';
    }

    public String[] getCources() {
        return cources;
    }

    public void setCources(String[] cources) {
        this.cources = cources;
    }



    @Override
    public Student getStudent(int roll) {
        return null;
    }
}
