abstract class Person {
    private String name;
    private MyDate dob;

    public Person(String name, MyDate dob) {
        this.name = name;
        this.dob = dob;
    }

    public String getName() {
        return name;
    }

    public MyDate getDob() {
        return dob;
    }

    abstract void getDetails();
}

class MyDate {
    private int dd, mm, yy;

    public MyDate(int d, int m, int y) {
        this.dd = d;
        this.mm = m;
        this.yy = y;
    }

    String getDate() {
        return String.format("%02d-%02d-%04d", dd, mm, yy);
    }
}

class Student extends Person {
    private String subject;
    private Teacher teacher;

    Student(String name, MyDate dob, Teacher teacher, String subject) {
        super(name, dob);
        this.teacher = teacher;
        this.subject = subject;
    }

    @Override
    void getDetails() {
        System.out.println("Name of Student: " + getName());
        System.out.println("Date of Birth: " + getDob().getDate());
        System.out.println("Subject: " + subject);
        System.out.println("Teacher: " + teacher.getName());
    }
}

abstract class Employee extends Person {
    private MyDate dateOfAppointment;
    private int salary;

    public Employee(String name, MyDate dob, MyDate myDateOfAppointment, int salary) {
        super(name, dob);
        this.dateOfAppointment = myDateOfAppointment;
        this.salary = salary;
    }

    public MyDate getDateOfAppointment() {
        return dateOfAppointment;
    }

    public void setSalaryInEmployee(int salary) {
        this.salary = salary;
    }

    public int getSalaryFromEmployee() {
        return salary;
    }

    abstract void setSalary(int sal);
    abstract int getSalary();

}

class Teacher extends Employee{
    private String subject;
    private String qualification;

    public Teacher(String name, MyDate dob, MyDate dateOfAppointment, String subject, String qualification, int salary) {
        super(name, dob, dateOfAppointment, salary);
        this.subject = subject;
        this.qualification = qualification;
    }


    @Override
    void getDetails() {
        System.out.println("Name of Teacher: " + getName());
        System.out.println("Date of Birth: " + getDob().getDate());
        System.out.println("Date of Appointment: " + getDateOfAppointment().getDate());
        System.out.println("Subject: " + subject);
        System.out.println("Qualifications: " + qualification);
        System.out.println("Salary: " + getSalary());
    }

    @Override
    void setSalary(int sal) {
        setSalaryInEmployee(sal);
    }

    @Override
    int getSalary() {
        return getSalaryFromEmployee();
    }
}

public class Main {
    public static void main(String[] args) {

        MyDate dobOfStudent = new MyDate(1, 1, 2005);
        MyDate dobOfTeacher = new MyDate(10, 10,1995);
        MyDate dobOfAppointment = new MyDate(1, 4, 2024);

        Teacher teacher = new Teacher("Koval", dobOfTeacher, dobOfAppointment, "Electronics", "MTech", 50000);
        Student student = new Student("Belinda", dobOfStudent, teacher, "Electronics");

        teacher.getDetails();
        student.getDetails();

    }
}
