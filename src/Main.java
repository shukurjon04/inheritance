//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Xirurg xirurg = new Xirurg("Dr. John Doe", 15, "Xirurg");
        Lor lor = new Lor("Dr. Jane Smith", 10, "FOP");

        System.out.println("Xirurg Info:");
        xirurg.showInfo();
        System.out.println();

        System.out.println("Lor Info:");
        lor.showInfo();

    }
}