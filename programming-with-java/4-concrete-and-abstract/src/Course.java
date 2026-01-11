abstract class Course {

    private Subject subject;
    private String instructor;
    private int fee;
    private int assignmentMarks;
    private int quizMarks;


    public Course(Subject subject, String instructor, int fee) {
        this.subject = subject;
        this.instructor = instructor;
        this.fee = fee;
    }

    public Subject getSubject() {
        return subject;
    }

    public void setAssignmentMarks(int assignmentMarks) {
        this.assignmentMarks = assignmentMarks;
    }

    public void setQuizMarks(int quizMarks) {
        this.quizMarks = quizMarks;
    }

    public int getAssignmentMarks() {
        return assignmentMarks;
    }

    public int getQuizMarks() {
        return quizMarks;
    }

    abstract int getMaxAssignmentMarks();

    abstract int getMaxQuizMarks();

}