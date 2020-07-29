import java.util.List;

public class Teacher extends Staff{
    public Teacher(String name) {
            super(name, "TEACHER");
            addToList(this);
        }

    public String disciplineStudent(String studentId) {
        List<Student> studentList = School.getStudents();
        for (int i = 0; i < studentList.size(); i++) {
            String currentId = studentList.get(i).getId();
            String currentName = studentList.get(i).getName();
            if(currentId.equals(studentId)) {
                return currentName + " has been disciplined";
            }
        }
        return "No student with Id " + studentId + " exist";
    }

    public String teachCourse(String courseName) {

        List<Course> courseList = School.getCourses();
        for (int i = 0; i < courseList.size(); i++) {
            String currentCourseName = courseList.get(i).getName();
            String currentName = courseList.get(i).getName();
            if(courseList.equals(currentName)) {
                return currentName + " taken!";
            }
        }
        return "No subject with such name (" + courseName + ")";
    }

    private void addToList(Teacher teacher){
        School.getTeachers().add(teacher);
    }

    public String role() {
        return this.getName() + " with " + this.getId() + " is a " + this.getRole();
    }
}
