/**Student class is a prototype of states and behaviour of each student
 *
 */

public class Applicant {
    private static int registrationNumber = 0;
    private String id;
    private String name;
    private int age;
    private String classTo;

    //Applicant class constructor
    public Applicant(String name, int age, String classTo) {
        registrationNumber++;
        this.name = name;
        this.age = age;
        this.classTo = classTo;
        id = "SH/APPLIC/2012/0" + registrationNumber;
    }

    //ge applicant Id
    public String getId() {
        return id;
    }

    //get applicant name
    public String getName() {
        return name;
    }

    // get applicant Age
    public int getAge() {
        return age;
    }

    //Get the class applicant is applying to
    public String getClassTo() {
        return classTo;
    }

}
