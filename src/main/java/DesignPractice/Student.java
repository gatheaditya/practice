package DesignPractice;

public class Student {

    private String name;
    private int age;
    private String course;


    Student(String name,int age, String course)
    {
        this.name=name;
        this.age=age;
        this.course=course;
    }
    @Override
    public String toString() {
        return "Student{" +
                "name='" + this.name + '\'' +
                ", age=" + this.age +
                ", course='" + this.course + '\'' +
                '}';
    }

public static class Builder
{
    private String name;
    private int age;
    private String course;



    public Builder setName(String name)
    {
        this.name=name;
        return this;
    }
    public Builder setCourse(String course)
    {
        this.course=course;
        return this;
    }
    public Builder setAge(int name)
    {
        this.age=age;
        return this;
    }

    public Student build()
    {
        return new Student(this.name,this.age,this.course);
    }
}



}
