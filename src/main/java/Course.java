/**Course class is a prototype of states and behaviour of each course
 *
 */

public class Course {
    private String name;

    //Course constructor
    public Course(String name) {
        this.name = name;
        addCourse(this); //method call add course to School.courselist
    }

    //Get subject name
    public String getName() {
        return name;
    }

    //method call add course to School.course list
    private void addCourse(Course course) {
        School.getCourses().add(course);
    }
}
