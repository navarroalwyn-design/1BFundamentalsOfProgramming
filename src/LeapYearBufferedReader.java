import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class LeapYearBufferedReader {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter a year: ");
        int year = Integer.parseInt(reader.readLine());

        boolean isLeap;

        if (year % 400 == 0) {
            isLeap = true;
        } else if (year % 100 == 0) {
            isLeap = false;
        } else if (year % 4 == 0) {
            isLeap = true;
        } else {
            isLeap = false;
        }

        System.out.println(year + (isLeap ? " is a YEAR." : " is NOT a Leap Year. "));
        reader.close();

    }
}