/**Student class is a prototype of states and behaviour of each student
 *
 */
public class Student {

    private static int studentNumber = 100;
    private String id;
    private String name;
    private String _class;

    //Student class constructor
    public Student(String name,String _class){
        studentNumber++;
        id = "SH/STUD/2012/0" + studentNumber;
        this.name=name;
        this._class = _class;
        addToList(this); //method call add current object to School.studentList
    }

    // method add student object to School.student
    private void addToList(Student student){
        School.getStudents().add(student);
    }

    //get student Id
    public String getId() {
        return id;
    }

    //get student name
    public String getName() {
        return name;
    }

    //get student class
    public String get_class() {
        return _class;
    }
}
