import java.util.List;

public interface StudentDao {

    Student saveStudent(Student student);
    Student findByEmail(String student);
    List<Student> findByName(String name);
    Student findByID(int id);
    Student findAll(Student student);
    boolean deleteStudent(Student student);
}
