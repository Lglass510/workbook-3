package pluralsight;

public class Employee {
    private int employeeId;

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public double getPayRate() {
        return payRate;
    }

    public void setPayRate(double payRate) {
        this.payRate = payRate;
    }

    private String name;
    private double hoursWorked;
    private double payRate;


    public Employee(int employeeId, String name, double payRate, double hoursWorked){
        this.employeeId = employeeId;
        this.name = name;
        this.payRate = payRate;
        this.hoursWorked = hoursWorked;

    }

    public double calculateGrossPay() {
        return hoursWorked * payRate;
    }



}