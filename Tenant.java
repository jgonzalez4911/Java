
/*
CSE 17
Julio Gonzalez
JCG322@lehigh.edu
Program Description:creates object class for prog2. contains methods to store tenant info.
Program #2
*/
public class Tenant {
    private String firstName;
    private String lastName;
    private String aptNumber;
    private double yearlyRent;

    public Tenant() {
        firstName = "joe";
        lastName = "smith";
        aptNumber = "123";
        yearlyRent = 600.0;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAptNumber(String aptNumber) {
        this.aptNumber = aptNumber;
    }

    public void setYearlyRent(double yearlyRent) {
        this.yearlyRent = yearlyRent;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getAptNumber() {
        return aptNumber;
    }

    public double getYearlyRent() {
        return yearlyRent;
    }

    public double firstPayment() {
        double monthlyRent = 0;
        monthlyRent = yearlyRent / 12;
        monthlyRent = Math.round((3 * monthlyRent) * 100);

        return monthlyRent / 100;
    }

    public double monthlyPayment() {
        double monthlyRent1 = 0;
        monthlyRent1 = (yearlyRent - 2 * yearlyRent / 12) / 11;
        monthlyRent1 = Math.round(monthlyRent1 * 100);
        return monthlyRent1 / 100;
    }

    public String fullName() {
        String name = firstName + " " + lastName;
        return name;
    }

}