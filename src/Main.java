import model.Student;

public class Main {

    public static void main(String[] args) {
        Student student = new Student("TestName", "男", 22, "150202491");
        System.out.println(student.toString());
    }
}