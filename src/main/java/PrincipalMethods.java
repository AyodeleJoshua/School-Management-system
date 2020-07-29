/**Interface of principal's Method
 *
 */
public interface PrincipalMethods {
    String disciplineStudent(String studentId);
    String expelStudent(String studentId);
    String admitStudents();
    void introduceNewCourses(String courseName);
    String role();
    void removeCourse(String courseName);
}
