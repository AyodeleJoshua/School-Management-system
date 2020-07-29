/**Abstract Staff class creates structure that will
 * be inherited by the principal, academic staff and other non academic staff
 *
 */

public abstract class Staff{

    private static int staffNumber = 0;
    private final String id;
    private final String name;
    private String role;
    private final int SALARY;
    private int salaryEarned;

    // constructor
    public Staff(String name, String role){
        staffNumber++;
        id = "SH/STAFF/2012/0" + staffNumber;
        this.name=name;
        this.role = role;
        if (id.equals("SH/STAFF/2012/01")) {
            SALARY = 40000;
        } else {
            SALARY = 30000;
        }
    }

    //get Id for staff
    public String getId(){
        return id;
    }

    //get Name for staff
    public String getName(){
        return name;
    }

    //get Role for Staff
    public String getRole(){
        return  role;
    }

}
