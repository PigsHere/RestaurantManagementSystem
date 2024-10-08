package Models;

public class Manager extends Employees {

    // MANAGER JOB

    private int managedEmployees;

    public Manager(String employeeName, String employeePost, String employeeAddress, String employeeEmail, int employeeNumber, int managedEmployees) {
        super(employeeName, employeePost, employeeAddress, employeeEmail, employeeNumber);
        this.managedEmployees = managedEmployees;
    }

    // GETTER SECTION

    public int getManagedEmployees() {
        return managedEmployees;
    }

    // SETTER SECTION

    public void setManagedEmployees(int managedEmployees) {
        this.managedEmployees = managedEmployees;
    }

    public void scheduleEmployees() {
        System.out.println("Scheduling employees for the week.");
    }
}
