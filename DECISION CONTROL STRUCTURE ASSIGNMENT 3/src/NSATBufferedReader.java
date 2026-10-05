import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class NSATBufferedReader {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter NSAT score: ");
        int nsat = Integer.parseInt(reader.readLine());
        System.out.print("Enter parents' monthly salary: ");
        double salary = Double.parseDouble(reader.readLine());
        System.out.print("Enter entrance exam score: ");
        int entrance = Integer.parseInt(reader.readLine());
        //Check rejected conditions
        boolean rejected = salary <= 10000 || nsat < 90 || entrance < 85;
        //Check accepted conditions
        double average = (nsat + entrance) / 2.0;
        boolean accepted = salary <= 3500 && average >= 91;
        //Decision
        if (rejected) {
            System.out.println("REJECTED");
        } else if (accepted) {
            System.out.println("ACCEPTED");
        } else {
            System.out.println("FOR FURTHER STUDY");
        }
    }
}
