package pluralsight;
import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedReader;


public class PayrollCalculator {

    public static void main(String[] args) {
        String filePath = "C:\\Users\\Student\\pluralsight\\workbook-3\\BedtimeStories\\DataFiles\\employees.csv";

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            reader.readLine(); //skip the header
            String line;

            while ((line = reader.readLine()) != null) {
                String[] tokens = line.split("\\|");

                int id = Integer.parseInt(tokens[0]);
                String name = tokens[1];
                double hoursWorked = Double.parseDouble(tokens[2]);
                double payRate = Double.parseDouble(tokens[3]);

                Employee emp1 = new Employee(id, name, hoursWorked, payRate);
                System.out.printf("ID: %d | Name: %s | Gross Pay: $%.2f%n",
                        emp1.getEmployeeId(), emp1.getName(), emp1.calculateGrossPay());
            }

            }

        catch (IOException e) {
            System.out.println("Could not read the file.");
        }


























    }




}
