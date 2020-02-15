package DesignPractice;

public class BuilderImpl {


    public static void main(String[] args) {


        Student s1 = new Student.Builder()
                .setName("aditya")
                .setAge(34)
                .setCourse("Angular")
                .build();
        System.out.println(s1.toString());
    }
}
