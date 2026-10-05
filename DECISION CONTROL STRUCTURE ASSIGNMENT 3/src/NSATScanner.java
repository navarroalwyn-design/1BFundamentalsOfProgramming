import java.util.Scanner;
public class NSATScanner {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter NSAT score: ");
        int nsat = input.nextInt();
        System.out.print("Enter parents' monthly salary: ");
        double salary = input.nextDouble();
        System.out.print("Enter entrance exam score: ");
        int entrance = input.nextInt();
        boolean rejected = salary > 10000 || nsat < 90 || entrance < 85;
        double average = (nsat + entrance) / 2.0;
        boolean accepted = salary <= 3500 && average >= 91;
        if (rejected) {
            System.out.println("REJECTED");
        } else if (accepted) {
            System.out.println("ACCEPTED");
        } else {
            System.out.println("FOR FURTHER STUDY");
        }
        input.close();
    }
}
