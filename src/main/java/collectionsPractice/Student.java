package collectionsPractice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Student implements Comparable<Student> {


    public int age;
    public String name;
    public String course;

    public Student(int age,String name,String course)
    {
        this.age=age;
        this.course=course;
        this.name=name;
    }

    @Override
    public int compareTo(Student student) {

        if(age==student.age)
            return 0;
       else  if(age<student.age)
            return 1;
        else
            return -1;
    }

    @Override
    public String toString() {
        return "["+this.name+" "+this.course+" "+this.age+"]";
    }

    public static void main(String[] args) {

        Student s1 = new Student(20,"aditya","angular");
        Student s2 = new Student(30,"john","react");
        Student  s3 = new Student(45,"mark","html5");

        List<Student> studentlist = new ArrayList<Student>();

        studentlist.add(s1);
        studentlist.add(s2);
        studentlist.add(s3);
        Collections.sort(studentlist);
        Iterator<Student> studentIterator = studentlist.iterator();

        while(studentIterator.hasNext())
            System.out.println(studentIterator.next().toString());

        Collections.sort(studentlist, new nameComparator());

        System.out.println("==============");

        for(Student s :studentlist)
            System.out.println(s.toString());
    }
}
