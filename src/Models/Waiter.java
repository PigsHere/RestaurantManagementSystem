package Models;

public class Waiter extends Employees {

    // WAITER JOB

    private int tablesAssigned;

    public Waiter(String employeeName, String employeePost, String employeeAddress, String employeeEmail, int employeeNumber, int tablesAssigned) {
        super(employeeName, employeePost, employeeAddress, employeeEmail, employeeNumber);
        this.tablesAssigned = tablesAssigned;
    }

    // GETTER SECTION

    public int getTablesAssigned() {
        return tablesAssigned;
    }

    // SETTER SECTION

    public void setTablesAssigned(int tablesAssigned) {
        this.tablesAssigned = tablesAssigned;
    }

    public void serveCustomer() {
        System.out.println("Serving customer at table " + getTablesAssigned());
    }

}
