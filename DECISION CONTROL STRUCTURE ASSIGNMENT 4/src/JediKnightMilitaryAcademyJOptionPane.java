import javax.swing.JOptionPane;
public class JediKnightMilitaryAcademyJOptionPane {
    public static void main(String[] args) {
        String heightStr = JOptionPane.showInputDialog("Enter height in cm: ");
        int height = Integer.parseInt(heightStr);
        String ageStr = JOptionPane.showInputDialog("Enter age: ");
        int age = Integer.parseInt(ageStr);
        String citizenship = JOptionPane.showInputDialog("Citizenship code:\nC = Endor citizen\nN = Non-citizen").toUpperCase();
        String recommendee = JOptionPane.showInputDialog("Recommendee code:\nR = Recommende\nN = Non-recommendee").toUpperCase();
        boolean isRecommended = recommendee.equals("R");
        boolean meetsRequirements = height >= 200 && (age >= 21 && age <= 25) && citizenship.equals("C");
        String result;
        if (isRecommended || meetsRequirements) {
            result = "ACCEPTED";
        } else {
            result = "REJECTED";
        }
        JOptionPane.showMessageDialog(null, result);
    }
}
