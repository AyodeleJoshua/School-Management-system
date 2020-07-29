public class NonAcademicStaff extends Staff {

    public NonAcademicStaff(String name, String role) {
        super(name, role);
        addToList(this);
    }

    private void addToList(NonAcademicStaff nonAcademicStaff){
        School.getNonAcademicStaffs().add(nonAcademicStaff);
    }

    public String role() {
        return this.getName() + " with " + this.getId() + " has a role of " + this.getRole();
    }
}
