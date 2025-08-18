package entity;

public class Person {

    private String name;
    private double income;
    private String gender;
    private int age;
    private double tax;

    // Default constructor
    public Person() {}

    // Parameterized constructor
    public Person(String name, double income, String gender, int age, double tax) {
        this.name = name;
        this.income = income;
        this.gender = gender;
        this.age = age;
        this.tax = tax;
    }

    // Getters and Setters
    public double getTax() {
        return tax;
    }

    public void setTax(double tax) {
        this.tax = tax;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getIncome() {
        return income;
    }

    public void setIncome(double income) {
        this.income = income;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age < 0) {
            throw new IllegalArgumentException("Age cannot be negative.");
        }
        this.age = age;
    }

    // Object class method to return string representation of Person object
    @Override
    public String toString() {
        return "Person [name=" + name + ", income=" + income + ", gender=" + gender 
                + ", age=" + age + ", tax=" + tax + "]";
    }
}
