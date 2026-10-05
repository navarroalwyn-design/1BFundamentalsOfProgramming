import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class PayCalculatorBufferedReader {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter hourly pay rate (Php): ");
        double rate = Double.parseDouble(reader.readLine());
        System.out.print("Enter hours worked: ");
        double hours = Double.parseDouble(reader.readLine());
        //Calculate gross pay
        double grossPay = hours * rate;
        //Determine withoholding tax rate
        double taxRate;
        if (grossPay <= 2000.00) {
            taxRate = 0.10;
        }else if (grossPay <= 4000.00) {
            taxRate = 0.12;
        } else if (grossPay <= 10000.00) {
            taxRate = 0.15;
        } else {
            taxRate = 0.20;
        }
        //Calculate withholding and net pay
        double withholdingTax = grossPay * taxRate;
        double netPay = grossPay - withholdingTax;
        //Output results
        System.out.println("\n===== PAY SUMMARY =====");
        System.out.printf("Gross Pay: Php %.2f%n", grossPay);
        System.out.printf("Withholding Tax Rate: %.0f%%%n", taxRate * 100);
        System.out.printf("Withholding Tax: Php %.2f%n", withholdingTax);
        System.out.printf("Net Pay: Php %.2f%n", netPay);
    }
}
