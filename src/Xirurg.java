public class Xirurg extends Doctor{
    private String specialty;

    public Xirurg(String name, int experience, String specialty) {
        super(name, experience);
        this.specialty = specialty;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("Specialty: " + specialty);
    }
}
