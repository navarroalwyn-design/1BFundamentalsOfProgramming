import java.util.Scanner;
public class PayCalculatorScanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter hourly pay rate (Php): ");
        double rate = scanner.nextDouble();
        System.out.print("Enter hours worked: ");
        double hours = scanner.nextDouble();
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
        double netPay = grossPay - withholdingTax;
        //Output results
        System.out.println("\n===== PAY SUMMARY =====");
        System.out.printf("Gross Pay: Php %.2f%n", grossPay);
        System.out.printf("Withholding Tax Rate: %.0f%%%n", taxRate * 100);
        System.out.printf("Withholding Tax: Php %.2f%n", withholdingTax);
        System.out.printf("Net Pay: Php %.2f%n", netPay);
        scanner.close();

    }
}
