package entity;

import java.util.Scanner;

public class PersonDemo {
    public static void main(String[] args) {

        // scanner object to accept user inputs
        Scanner ob = new Scanner(System.in);

        System.out.print("Enter Person Name : ");
        String name = ob.next();

        System.out.print("Enter age: ");
        int age = ob.nextInt();

        System.out.print("Enter gender: ");
        String gender = ob.next();

        System.out.print("Enter taxable income: ");
        double income = ob.nextDouble();

        // Person object and initialize values using setters
        Person person = new Person();
        person.setName(name);
        person.setAge(age);
        person.setGender(gender);
        person.setIncome(income);

        // display person details before tax calculation
        System.out.println("\nBefore Tax Calculation:");
        System.out.println(person);

        // tax calculation
        TaxCalculation calc = new TaxCalculation();
        calc.calculateTax(person);

        System.out.println("\nAfter Tax Calculation:");
        System.out.println(person);

        ob.close();
    }
}
