package B_Sxema;

class Subwoofer extends Sounds {
    private String subFrequencyRange;
    private String enclosureType;

    public String getSubFrequencyRange() {
        return subFrequencyRange;
    }

    public void setSubFrequencyRange(String subFrequencyRange) {
        this.subFrequencyRange = subFrequencyRange;
    }

    public String getEnclosureType() {
        return enclosureType;
    }

    public void setEnclosureType(String enclosureType) {
        this.enclosureType = enclosureType;
    }
}