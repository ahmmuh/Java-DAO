import java.time.LocalDate;
import java.util.List;

public interface CourseDao {
    Course saveCOurse(Course course);
    Course findById(int id);
    List<Course> findAll(Course course);
    List<Course> findByDate(LocalDate date);
    List<Course> findByName(String name);
    boolean removeCourse(Course course);
}
