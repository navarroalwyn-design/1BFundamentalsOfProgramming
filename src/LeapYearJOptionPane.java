import javax.swing.JOptionPane;
public class LeapYearJOptionPane {
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("Enter a YEAR: ");
        int year = Integer.parseInt(input);

        boolean isLeap = (year % 400 == 0) || (year % 4 == 0 && year % 100 != 0);
        String msg = year + (isLeap ? " is a LEAP YEAR." : " Is NOT a Leap Year.");

        JOptionPane.showMessageDialog(null, msg);
    }
}
