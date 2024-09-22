package Models;

public class SousChef extends Chef {


    // SOUS CHEF JOB

    private int staffSupervised;

    public SousChef(String employeeName, String employeePost, String employeeAddress, String employeeEmail, int employeeNumber, String specialtyDish, int staffSupervised) {
        super(employeeName, employeePost, employeeAddress, employeeEmail, employeeNumber, specialtyDish);
        this.staffSupervised = staffSupervised;
    }

    // GETTER SECTION

    public int getStaffSupervised() {
        return staffSupervised;
    }

    // SETTER SECTION

    public void setStaffSupervised(int staffSupervised) {
        this.staffSupervised = staffSupervised;
    }

    public void superviseKitchenStaff() {
        System.out.println("Supervising " + staffSupervised + " kitchen staff.");
    }

    public void assistChef() {
        System.out.println("Assisting in preparing " + getSpecialtyDish());
    }

}
