import java.util.HashMap;
import java.util.Map;

public class StudentCourses {
    private Map<String, Integer> courseMarks = new HashMap<>();

    public void addCourseMark(String course, int mark) {
        courseMarks.put(course, mark);
    }

    public void displayCourseInformation() {
        System.out.println("Courses and Marks:");
        for (Map.Entry<String, Integer> entry : courseMarks.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    public static void main(String[] args) {
        // Example usage
        StudentCourses studentCourses = new StudentCourses();
        studentCourses.addCourseMark("Math", 90);
        studentCourses.addCourseMark("Science", 85);
        studentCourses.displayCourseInformation();
    }
}
