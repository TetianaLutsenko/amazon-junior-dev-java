public class Learner implements Assessments{

    private String name;
    private Course course;
    private double gradeScore;

    public Learner(String name, Course course) {
        this.name = name;
        this.course = course;
    }

    public Course getCourse() {
        return course;
    }

    public String toString() {
        return "Name: " + this.name + " " + "Course: " + this.course.getSubject().getTitle();
    }

    @Override
    public void assignmentScore(int marks) {
        course.setAssignmentMarks(marks);
    }

    @Override
    public void quizScore(int marks) {
        course.setQuizMarks(marks);
    }

    public double calculateGrade() {
        int maxAssignmentMarks = course.getMaxAssignmentMarks();
        int maxQuizMarks = course.getMaxQuizMarks();

        double assignmentGrade = (double) course.getAssignmentMarks() / maxAssignmentMarks * 10;
        double quizGrade = (double) course.getQuizMarks() / maxQuizMarks * 10;

        gradeScore = (assignmentGrade + quizGrade) / 2;

        return this.gradeScore;
    }
}
