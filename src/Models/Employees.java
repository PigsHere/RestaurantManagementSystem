package Models;

public class Employees {

    // EMPLOYEE DATA SECTION
    private String employeeName;
    private String employeePost;
    private String employeeAddress;
    private String employeeEmail;
    private int employeeNumber;

    // Constructor
    public Employees(String employeeName, String employeePost, String employeeAddress, String employeeEmail, int employeeNumber) {
        this.employeeName = employeeName;
        this.employeePost = employeePost;
        this.employeeAddress = employeeAddress;
        this.employeeEmail = employeeEmail;
        this.employeeNumber = employeeNumber;
    }

    // GETTER SECTION
    public String getEmployeeName() {
        return employeeName;
    }

    public String getEmployeePost() {
        return employeePost;
    }

    public String getEmployeeAddress() {
        return employeeAddress;
    }

    public String getEmployeeEmail() {
        return employeeEmail;
    }

    public int getEmployeeNumber() {
        return employeeNumber;
    }

    // SETTER SECTION
    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public void setEmployeePost(String employeePost) {
        this.employeePost = employeePost;
    }

    public void setEmployeeAddress(String employeeAddress) {
        this.employeeAddress = employeeAddress;
    }

    public void setEmployeeEmail(String employeeEmail) {
        this.employeeEmail = employeeEmail;
    }

    public void setEmployeeNumber(int employeeNumber) {
        this.employeeNumber = employeeNumber;
    }

    // EMPLOYEE INFO DISPLAY

    public void displayInfo() {
        System.out.println("Name: " + employeeName);
        System.out.println("Post: " + employeePost);
        System.out.println("Address: " + employeeAddress);
        System.out.println("Email: " + employeeEmail);
        System.out.println("Employee Number: " + employeeNumber);
    }
}
