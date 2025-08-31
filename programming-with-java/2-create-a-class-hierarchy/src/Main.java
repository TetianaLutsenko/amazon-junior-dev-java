abstract class Person {
    String name;
    MyDate dob;

    abstract void getDetails();
}

class MyDate {
    int dd;
    int mm;
    int yy;

    MyDate(int d, int m, int y) {
        this.dd = d;
        this.mm = m;
        this.yy = y;
    }

    String getDate() {
        return String.format("%02d-%02d-%04d", dd, mm, yy);
    }
}

class Student extends Person {
    String subject;
    Teacher teacher;

    Student(String name, MyDate dob, Teacher teacher, String subject) {
        this.name = name;
        this.dob = dob;
        this.teacher = teacher;
        this.subject = subject;
    }

    @Override
    void getDetails() {
        System.out.println("Name of Student: " + this.name);
        System.out.println("Date of Birth: " + this.dob.getDate());
        System.out.println("Subject: " + this.subject);
        System.out.println("Teacher: " + teacher.name);
    }
}

abstract class Employee extends Person {
    MyDate myDateOfAppointment;
    int salary;

    abstract void setSalary(int sal);
    abstract int getSalary();

}

class Teacher extends Employee{
    String subject;
    String qualification;

    Teacher(String name, MyDate dob, MyDate myDateOfAppointment, String subject, String qualification) {
        this.name = name;
        this.dob = dob;
        this.myDateOfAppointment = myDateOfAppointment;
        this.subject = subject;
        this.qualification = qualification;
    }

    @Override
    void getDetails() {
        System.out.println("Name of Teacher: " + name);
        System.out.println("Date of Birth: " + dob.getDate());
        System.out.println("Date of Appointment: " + myDateOfAppointment.getDate());
        System.out.println("Subject: " + subject);
        System.out.println("Qualifications: " + qualification);
        System.out.println("Salary: " + getSalary());
    }

    @Override
    void setSalary(int sal) {
        this.salary = sal;
    }

    @Override
    int getSalary() {
        return salary;
    }
}

public class Main {
    public static void main(String[] args) {

        MyDate dobOfStudent = new MyDate(1, 1, 2005);
        MyDate dobOfTeacher = new MyDate(10, 10,1995);
        MyDate dobOfAppointment = new MyDate(1, 4, 2024);

        Teacher teacher = new Teacher("Koval", dobOfTeacher, dobOfAppointment, "Electronics", "MTech");
        teacher.setSalary(50000);
        Student student = new Student("Belinda", dobOfStudent, teacher, "Electronics");

        teacher.getDetails();
        student.getDetails();

    }
}
