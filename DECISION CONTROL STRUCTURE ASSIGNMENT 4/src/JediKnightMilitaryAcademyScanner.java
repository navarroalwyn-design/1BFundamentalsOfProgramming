import java.util.Scanner;
public class JediKnightMilitaryAcademyScanner {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter height in cm: ");
        int height = input.nextInt();
        System.out.print("Enter age: ");
        int age = input.nextInt();
        input.nextLine(); // consume newline
        System.out.print("Citizenship code (C = Endor citizen, N = Non-citizen): ");
        String citizenship = input.nextLine().toUpperCase();
        System.out.print("Recommendee code (R = Recommende, N = Non=recommendee): ");
        String recommendee = input.nextLine().toUpperCase();
        boolean isRecommended = recommendee.equals("R");
        boolean meetsRequirements = height >= 200 && (age >= 21 && age <= 25) && citizenship.equals("C");
        if (isRecommended || meetsRequirements) {
            System.out.println("ACCEPTED");
        } else {
            System.out.println("REJECTED");
        }
        input.close();
    }
}
