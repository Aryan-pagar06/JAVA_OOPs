//Define a student class with field like name, age, and use toString to print details

public class Student
{
    String name = "Aryan";
    int marks = 100;
    int age = 20;

    public Student (String name, int age, int mark) {
        this.name = name;
        this.marks = marks;
        this.age = age;
    }

    @Override
    public String toString () {
        return name + " of age " + age + " who scored " + marks + " marks" ;
    }
    public static void main(String[] args) {
        Student s1 = new Student ("Aryan", 20, 100);
        Student s2 = new Student ("Rahul", 15, 34);
        System.out.println(s1);
        System.out.println(s2);
        
    }
}