import java.util.Scanner;
public class LeapYearScanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a year: ");
        int year = scanner.nextInt();

        boolean isLeap = (year % 400 == 0) || (year % 4 == 0 && year % 100 != 0);

        System.out.println(year + (isLeap ? " is a LEAP YEAR." : " is NOT a Leap Year."));
        scanner.close();

    }
}
