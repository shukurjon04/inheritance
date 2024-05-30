public class Lor extends Doctor {
    private String department;

    public Lor(String name, int experience, String department) {
        super(name, experience);
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("Department: " + department);
    }
}
