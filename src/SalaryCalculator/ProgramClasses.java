package SalaryCalculator;

public class ProgramClasses {

    public String name;
    public double grossSalary;
    public double tax;

    public double netSalary() {

        return grossSalary - tax;
    }

    public void increaseSalary(double increaseTax) {

        this.grossSalary += (grossSalary * (increaseTax / 100));
    }

    public String toString() {
        return "Employee: "
                + name
                +", $"
                + netSalary();
    }

}
