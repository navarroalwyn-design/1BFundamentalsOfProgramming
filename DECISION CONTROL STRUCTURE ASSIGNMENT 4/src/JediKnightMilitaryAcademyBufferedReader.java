import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class JediKnightMilitaryAcademyBufferedReader {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter height in cm: ");
        int height = Integer.parseInt(reader.readLine());
        System.out.print("Enter age: ");
        int age = Integer.parseInt(reader.readLine());
        System.out.print("Citizenship code (C = Endor citizen, N = No-recomendee): ");
        String citizenship = reader.readLine().toUpperCase();
        System.out.print("Recomendee code (R= Recommendee, N = Non-recommendee): ");
        String recommendee = reader.readLine().toUpperCase();
        //Check conditions
        boolean isRecommended = recommendee.equals("R");
        boolean meetsRequirements = height >= 200 && (age >= 21 && age <= 25) && citizenship.equals("C");
        if (isRecommended || meetsRequirements) {
            System.out.println("ACCEPTED");
        } else {
            System.out.println("REJECTED");
        }
    }
}
