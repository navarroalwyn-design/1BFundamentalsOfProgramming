import javax.swing.JOptionPane;
public class PayCalculatorJOptionPane {
    public static void main(String[] args) {
        //Get inputs
        String rateInput = JOptionPane.showInputDialog("Enter hourly pay rate (Php):");
        double rate = Double.parseDouble(rateInput);
        String hoursInput = JOptionPane.showInputDialog("Enter hours worked:");
        double hours = Double.parseDouble(hoursInput);
        //Calculate gross pay
        double grossPay = hours * rate;
        //Determine withholding tax rate
        double taxRate;
        if (grossPay <= 2000.00) {
            taxRate = 0.10;
        } else if (grossPay <= 4000.00) {
            taxRate = 0.12;
        } else if (grossPay <= 10000.00) {
            taxRate = 0.15;
        } else {
            taxRate = 0.20;
        }
        //Calculate withholding and net pay
        double withholdingTax = grossPay * taxRate;
        Double netPay = grossPay - withholdingTax;
        //Build result message
        String result = "===== PAY SUMMARY =====\n" +
                String.format("Gross Pay: Php %.2f5n", grossPay) +
                String.format("Withholding Tax Rate: %.2f%%%n", taxRate * 100) +
                String.format("Withholding Tax: Php %.2f%n", withholdingTax) +
                String.format("Net Pay: Php %.2f%n", netPay);
        //Show results
        JOptionPane.showMessageDialog(null, result, "PAY CALCULATION", JOptionPane.INFORMATION_MESSAGE);
    }
}
