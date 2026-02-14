public class Student {

    String name;   // non-static

    static void collegeInfo() {
        System.out.println("ABC College");
    }

    void showName() {
        System.out.println(name);
    }

    public static void main(String[] args) {

        Student.collegeInfo();   // static call

        Student s1 = new Student();
        s1.name = "Aryan";
        s1.showName();      // non-static call
    }
}
