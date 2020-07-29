import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class SchoolTest {

    Principal principal;

    Teacher joshua;
    Teacher john;
    Teacher micheal;
    Teacher halleluyah;
    Teacher Mondris;
    Teacher jones;

    Student samuel;
    Student ogundele;
    Student wumi;

    NonAcademicStaff mike;
    NonAcademicStaff angie;
    NonAcademicStaff hannat;
    NonAcademicStaff tina;
    NonAcademicStaff nurudeen;
    NonAcademicStaff mikey;

    Applicant mariam;
    Applicant Aalbers;
    Applicant aarhus;
    Applicant aamodt;
    Applicant aamot;
    Applicant aalto;
    Applicant aaronson;
    Applicant aakre;
    Applicant neto;
    Applicant mariamma;


    @BeforeEach
    void initList() {
        principal = new Principal("Mrs. Bayero Anu");

        //List of Teachers
        joshua = new Teacher("Ayodele Joshua");
        john = new Teacher("Orando John");
        micheal = new Teacher("Begge Micheal");
        halleluyah = new Teacher("Theophillus Halleluyah");
        Mondris = new Teacher("Sekoni Mondris");
        jones = new Teacher("Jonah Jones");

        //List of NonAcademic Staff
        mike = new NonAcademicStaff("Angelia Mike", "Secretary");
        angie = new NonAcademicStaff("Jone Angie", "Admin. Officer");
        hannat = new NonAcademicStaff("Ewusoko Hannat", "Bursar");
        tina = new NonAcademicStaff("James Tina", "Cleaner");
        nurudeen = new NonAcademicStaff("Baban Nurudeen", "Security Officer");
        mikey = new NonAcademicStaff("Sam Mikey", "Secretary");

        //List of Students
        samuel = new Student("Okezie Samuel", "Jss1");
        ogundele = new Student("Ogundele Samuel", "Jss2");
        wumi = new Student("Ogundele Wumi", "Jss3");

        //List of Applicants
        mariam = new Applicant("Ally Mariam", 10, "Jss1");
        Aalbers = new Applicant("Aanenson Aalbers", 9, "Jss1");
        aarhus = new Applicant("Aaron Aarhus", 12, "Jss2");
        aamodt = new Applicant("Aas Aamodt", 7, "Jss1");
        aamot = new Applicant("Aarons Aamot", 16, "Jss3");
        aalto = new Applicant("Aase Aalto", 14, "Jss3");
        aaronson = new Applicant("Aardema Aaronson", 18, "Jss2");
        aakre = new Applicant("Aamodt Aakre", 12, "Jss1");
        neto = new Applicant("Aalbers Neto", 20, "Jss3");
        mariamma = new Applicant("Aalbers Mariamma", 17, "Jss2");
    }

    /** Carry out all tests on nonacademic staff */
    @Test
    void nonAcademicStaff() {
        assertEquals("SH/STAFF/2012/021", mike.getId());
        assertEquals("Angelia Mike with SH/STAFF/2012/021 has a role of Secretary", mike.role());
    }

    /** Carry out all tests on principal */
    @Test
    void principal() {
        assertEquals("No student with Id SH/STUD/2012/050 exist", principal.expelStudent("SH/STUD/2012/050"));
        principal.admitStudents();
        //assertEquals(6, School.getApplicantList().size());
    }

}