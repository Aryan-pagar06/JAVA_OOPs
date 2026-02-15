

public class Course
{
    String CourseName;
    int enrolledStudents;
    static int maxCapacity=100;
    static void setMaxCapacity(int maxCapacity)
    {
        Course.maxCapacity=maxCapacity;
    }
    void enroll(String studentname)
    {
       System.out.println("Student enrolled");
       maxCapacity--;
       System.out.println("Seats remaining = " + maxCapacity);
    }
    void unenroll(String studentname)
    {
       System.out.println("Student unenrolled");
       maxCapacity++;
       System.out.println("Seats remaining = " + maxCapacity);  
    }

    public static void main(String[] args) {
        Course s1= new Course();
        s1.enroll("aryan");
        Course s2= new Course();
        s2.enroll("ram");
        Course s3= new Course();
        s3.enroll("rahul");
        s3.unenroll("Aryan");

    }



}