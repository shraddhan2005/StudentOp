StudentOperations.java
package in.ac.kletech.StudentMgmt.StudentOperation;
import java.util.*;

public interface StudentOperations {
    void addStudent();
    void viewStudents();
    void deleteStudent() throws StudentNotFoundException;
    void searchStudent() throws StudentNotFoundException;
}
