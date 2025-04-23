package pluralsight;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class PayrollCalculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        System.out.println("Enter the name of the employee file to process: ");
        String inputFile = sc.nextLine();

        System.out.println("Enter the name of the payroll file to create: ");
        String outputFile = sc.nextLine();

        List<Employee> employees = new ArrayList<>();



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

                Employee emp = new Employee(id, name, hoursWorked, payRate);
                employees.add(emp);
                System.out.printf("ID: %d | Name: %s | Gross Pay: $%.2f%n",
                        emp.getEmployeeId(), emp.getName(), emp.calculateGrossPay());
            }

            }

        catch (IOException e) {
            System.out.println("Could not read the file.");
        }

        System.out.println("\n ------ All Employee Info -------");
        for (Employee emp : employees) {
            System.out.printf("ID: %d | Name: %s | Hours: %.2f | Rate: %.2f | Gross Pay: $%.2f%n",
                    emp.getEmployeeId(),
                    emp.getName(),
                    emp.getHoursWorked(),
                    emp.getPayRate(),
                    emp.calculateGrossPay());
        }


        // Write payroll data
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile))) {
            if (outputFile.endsWith(".csv")) {
                writer.write("id|name|gross pay\n");
                for (Employee emp : employees) {
                    writer.write(emp.getEmployeeId() + "|" +  emp.getName() + "|" +
                            String.format("%.2f", emp.calculateGrossPay()) + "\n");
                }
            }
            System.out.println("Payroll file written successfully: " + outputFile);

        } catch (IOException e) {
            System.out.println("FAILURE!!! WHAT DID YOU DO?!?!?!?!!!");
        }
        sc.close();


    }

}
