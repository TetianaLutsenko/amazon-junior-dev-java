class Student extends Person implements StudentInterface {
    private String subject;
    private int marks;

    public Student(String name, int age, String subject, int marks) {
        super(name, age);
        this.subject = subject;
        this.marks = marks;
    }

    public String getSubject() {
        return subject;
    }

    public int getMarks() {
        return marks;
    }

    @Override
    public void getDetails() {
        super.getDetails();
        System.out.println("Subject: " + getSubject());
        System.out.println("Marks: " + getMarks());
    }

    @Override
    public void result() {
        if (getMarks() > 50) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }
    }

    @Override
    public void fee(int fee) {
        System.out.println("Student pays the fees " + fee);
    }
}