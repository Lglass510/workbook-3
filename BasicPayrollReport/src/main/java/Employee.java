

public class Employee {
    //Fields inside class outside method
    int id;
    String name;
    double payRate;
    double hoursWorked;

    public Employee(String name, int id, double payRate, double hoursWorked){
        this.name = name;
        this.id = id;
        this.payRate = payRate;
        this.hoursWorked = hoursWorked;

    }



    public void grossPay() {
       grossPay = payRate * hoursWorked;
    }
















}
