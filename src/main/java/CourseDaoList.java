import java.time.LocalDate;
import java.util.List;

public class CourseDaoList implements CourseDao{

    private static List<Course> courses;
    @Override
    public Course saveCOurse(Course course) {
        courses.add(course);
        return course;
    }

    @Override
    public Course findById(int id) {
        return null;
    }

    @Override
    public List<Course> findAll(Course course) {
        return null;
    }

    @Override
    public List<Course> findByDate(LocalDate date) {
        return null;
    }

    @Override
    public List<Course> findByName(String name) {
        return null;
    }

    @Override
    public boolean removeCourse(Course course) {
        return courses.remove(course);
    }
}
