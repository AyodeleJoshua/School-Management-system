import java.util.List;
/**Principal class is a prototype of states and behaviour of each principal
 *
 */
public class Principal extends Staff implements PrincipalMethods {
    public Principal(String name) {
        super(name, "PRINCIPAL");
    }

    @Override
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

    @Override
    public String expelStudent(String studentId) {
        List<Student> studentList = School.getStudents();
        for (int i = 0; i < studentList.size(); i++) {
            String currentId = studentList.get(i).getId();
            String currentName = studentList.get(i).getName();
            if(currentId.equals(studentId)) {
                studentList.remove(i);
                return currentName + " has been EXPELLED!";
            }
        }
        return "No student with Id " + studentId + " exist";
    }

    @Override
    public String admitStudents() {
        List<Student> studentList = School.getStudents();
        List<Applicant> applicantList = School.getApplicantList();
        for (int i = 0; i < applicantList.size(); i++) {
            String currentId = applicantList.get(i).getId();
            int currentAge = applicantList.get(i).getAge();

            if (currentAge >= 10 && currentAge <= 17) {
                studentList.add(new Student(applicantList.get(i).getName(), applicantList.get(i).getClassTo()));
                System.out.println("New student added!");
            } else {
                System.out.println("Student with application number " + currentId +
                        " has not been given admission");
            }


        }
        return "Admission given to eligible students";
    }

    @Override
    public void introduceNewCourses(String courseName) {
        final Course course = new Course(courseName);
        System.out.println(courseName + "added!");
    }


    @Override
    public String role() {
        return this.getName() + " with " + this.getId() + " is a " + this.getRole();
    }

    @Override
    public void removeCourse(String courseName) {

        for (int i = 0; i < School.getCourses().size(); i++) {
            if (School.getCourses().get(i).getName().equals(courseName)) {
                School.getCourses().remove(i);
                System.out.println(courseName + " deleted!");
            }
        }
    }

}
