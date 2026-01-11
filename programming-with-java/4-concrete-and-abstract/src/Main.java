import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        Subject subject1 = new Subject("Java", 5);
        Subject subject2 = new Subject("Java Online", 5);
        Subject subject3 = new Subject("JavaScript", 7);
        Subject subject4 = new Subject("JavaScript Online", 7);

        System.out.println("Choose a course: ");
        System.out.println("1 = Java");
        System.out.println("2 = Java Online");
        System.out.println("3 = JavaScript");
        System.out.println("4 = JavaScript Online");

        int choice = in.nextInt();
        in.nextLine();

        Course course1 = null;
        if (choice == 1) {
            course1 = new ClassroomCourse(subject1, "Lee", 1000, "SHS", "Spring");
        } else if (choice == 2) {
            course1 = new OnlineCourse(subject2, "Lee", 1500, 10, 40);
        } else if (choice == 3) {
            course1 = new ClassroomCourse(subject3, "Lee", 1100, "SHS", "Spring");
        } else {
            course1 = new OnlineCourse(subject4, "Lee", 1300, 9, 45);
        }

        System.out.println("Enter learner's name: ");
        String learnerName = in.nextLine();
        Learner learner = new Learner(learnerName, course1);

        System.out.println("Assignment mark: ");
        int mark1 = in.nextInt();

        System.out.println("Quiz mark: ");
        int mark2 = in.nextInt();

        learner.assignmentScore(mark1);
        learner.quizScore(mark2);

        double grade = learner.calculateGrade();

        System.out.println("Grade = " + grade);

        if (grade >= 5) {
            System.out.println("Congratulation " + learnerName + "! You successfully passed " + learner.getCourse().getSubject().getTitle() + " course.");
        }
        else {
            System.out.println("Congratulation " + learnerName + "! You successfully completed " + learner.getCourse().getSubject().getTitle() + " course.");
        }
    }
}