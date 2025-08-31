class Employee extends Person implements EmployeeInterface {
    private int basicPay;

    public Employee(String name, int age, int basic) {
        super(name, age);
        this.basicPay = basic;
    }

    public int getBasicPay() {
        return basicPay;
    }

    @Override
    public double computeSalary() {
        double salary;
        salary = getBasicPay() + (getBasicPay() * 0.5);
        return salary;
    }

    @Override
    public double computeTax() {
        double tax;
        tax = getBasicPay() * 0.1;
        return tax;
    }

    @Override
    public void getDetails() {
        super.getDetails();
        System.out.println("Basic pay: " + getBasicPay());
        System.out.println("Salary: " + computeSalary());
        System.out.println("Tax: " + computeTax());
    }
}