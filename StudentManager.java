import java.util.ArrayList;

public class StudentManager {
    private ArrayList<Student> students = new ArrayList<>();

    public void addStudent(Student student) {
        students.add(student);
        System.out.println("Student added successfully!");
    }

    public void displayStudents() {
        if (students.isEmpty()) {
            System.out.println("No students found.");
            return;
        }

        System.out.println("\n--- Student List ---");

        for (Student student : students) {
            student.display();
        }
    }

    public void findStudent(int id) {
        for (Student student : students) {
            if (student.getId() == id) {
                System.out.println("Student found:");
                student.display();
                return;
            }
        }

        System.out.println("Student not found.");
    }
}