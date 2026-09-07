package SalaryCalculator;

import java.util.Scanner;

public class Program {
    static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        ProgramClasses programClasses = new ProgramClasses();
        System.out.println("Name: ");
        programClasses.name = sc.nextLine();

        System.out.println("Gross Salary: ");
        programClasses.grossSalary = sc.nextDouble();

        System.out.println("Tax: ");
        programClasses.tax = sc.nextDouble();

        System.out.println("Employee: "+ programClasses);

        System.out.println("Which percentage to increase salary? ");
        double increaseTax = sc.nextDouble();
        programClasses.increaseSalary(increaseTax);

        System.out.println("Updated data: "+programClasses);

        sc.close();
    }


}
