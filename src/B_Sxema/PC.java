package B_Sxema;

class PC extends Computers {
    private String formFactor;
    private boolean hasMonitor;

    public String getFormFactor() {
        return formFactor;
    }

    public void setFormFactor(String formFactor) {
        this.formFactor = formFactor;
    }

    public boolean isHasMonitor() {
        return hasMonitor;
    }

    public void setHasMonitor(boolean hasMonitor) {
        this.hasMonitor = hasMonitor;
    }
}