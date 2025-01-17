import org.example.EmptyStudentListException;
import org.example.StudentSystem;
import org.example.Student;
import org.junit.Test;
import java.util.List;
import static org.junit.Assert.*;

public class StudentSystemTest {

    String filePath = "/Users/skendimac/Documents/java/Friends/src/main/java/org/example/students.csv";

    @Test
    public void testIfStudentListIsNotEmpty(){

       List<Student> students = StudentSystem.readStudents(filePath);

       assertFalse("The student list should not be empty.", students.isEmpty());
   }

    @Test
    public void testStudentWithId100() {
        assertTrue("Student with ID 100 should exist.", StudentSystem.getStudentById(100).isPresent());
    }

    @Test
    public void testHighestGPAStudent() {
        Student student = StudentSystem.getHighestGPAStudent();

        assertNotNull("The highest GPA student should not be null.", student);
        assertEquals("Student with highest GPA should have a GPA of 9.8.", 9.8, student.getGpa(), 0.001); // Delta added
    }

    @Test
    public void testExceptionMessageForEmptyStudentList(){

        StudentSystem.students.clear();

        Exception exception = assertThrows(
                EmptyStudentListException.class,
                StudentSystem::getHighestGPAStudent
        );

        assertEquals("List of students is empty.", exception.getMessage());
    }


}
