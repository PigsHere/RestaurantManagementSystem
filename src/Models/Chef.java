package Models;

public class Chef extends Employees {

    // CHEF JOB

    private String specialtyDish;

    public Chef(String employeeName, String employeePost, String employeeAddress, String employeeEmail, int employeeNumber, String specialtyDish) {
        super(employeeName, employeePost, employeeAddress, employeeEmail, employeeNumber);
        this.specialtyDish = specialtyDish;
    }

    // GETTER SECTION

    public String getSpecialtyDish() {
        return specialtyDish;
    }

    // SETTER SECTION

    public void setSpecialtyDish(String specialtyDish) {
        this.specialtyDish = specialtyDish;
    }

    public void cookDish() {
        System.out.println("Cooking " + specialtyDish);
    }

}
