package B_Sxema;

class Loudspeaker extends Sounds {
    private double sensitivityRating;
    private int impedance;

    public double getSensitivityRating() {
        return sensitivityRating;
    }

    public void setSensitivityRating(double sensitivityRating) {
        this.sensitivityRating = sensitivityRating;
    }

    public int getImpedance() {
        return impedance;
    }

    public void setImpedance(int impedance) {
        this.impedance = impedance;
    }
}