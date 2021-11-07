import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

public class StudenDaoList implements StudentDao{
private static List<Student> students;

    @Override
    public Student saveStudent(Student student) {
        students.add(new Student(1,"Ahmed Mukhtar","mukhtar1100@hotmail.com","Ystarvägen 1390, 906 25, Umeå"));
        return student;
    }

    @Override
    public Student findByEmail(String student) {
      students.stream()
                .map(Student::getEmail).collect(Collectors.toList());
        return null;
    }

    @Override
    public List<Student> findByName(String name) {
        students.stream()
                .map(Student::getName).collect(Collectors.toList());
        return students;
    }

    @Override
    public Student findByID(int id) {
        return students.get(id);
    }

    @Override
    public Student findAll(Student student) {
        return student;
    }

    @Override
    public boolean deleteStudent(Student student) {
        return false;
    }
}
