import javax.swing.JOptionPane;
public class NSATJOptionPane {
    public static void main(String[] args) {
        String nsatStr = JOptionPane.showInputDialog("Enter NSAT SCORE: ");
        int nsat = Integer.parseInt(nsatStr);
        String salaryStr = JOptionPane.showInputDialog("Enter parents' monthly salary: ");
        double salary = Double.parseDouble(salaryStr);
        String entranceStr = JOptionPane.showInputDialog("Enter entrance exam score: ");
        int entrance = Integer.parseInt(entranceStr);
        boolean rejected = salary > 10000 || nsat < 90 || entrance < 85;
        double average = (nsat + entrance) / 2.0;
        boolean accepted = salary <= 3500 && average >= 91;
        String result;
        if (rejected) {
            result = "REJECTED";
        } else if (accepted) {
            result = "ACCEPTED";
        } else {
            result = "FOR FURTHER STUDY";
        }
        JOptionPane.showMessageDialog(null, result);
    }
}
