import java.util.ArrayList;
import java.util.List;

/**This school class collects lists of teachers,
 * students,
 * courses,
 * nonacademic staff
 * applicant.
 * School class implements getters & setters for all fields
 */

public class School {

    private String name;
    private static List<Teacher> teachers = new ArrayList<>();
    private static List<Student> students = new ArrayList<>();
    private static List<Course> courses = new ArrayList<>();
    private static List<NonAcademicStaff> nonAcademicStaffs = new ArrayList<>();
    private static List<Applicant> applicantList = new ArrayList<>();


    public School(String name) {
        this.name = name;
    }

    // Get NonAcademic staff list
    public static List<NonAcademicStaff> getNonAcademicStaffs() {
        return nonAcademicStaffs;
    }

    // Get school list
    public String getName() {
        return name;
    }

    // Get Applicant list
    public static List<Applicant> getApplicantList() {
        return applicantList;
    }

    // Get Teacher list
    public static List<Teacher> getTeachers() {
        return teachers;
    }

    // Get Course list
    public static List<Course> getCourses() {
        return courses;
    }

    // Get Student list
    public static List<Student> getStudents() {
        return students;
    }

}

