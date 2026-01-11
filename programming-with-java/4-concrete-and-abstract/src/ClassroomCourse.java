class ClassroomCourse extends Course {

    private String school;
    private String session;

    @Override
    int getMaxAssignmentMarks() {
        return 100;
    }

    @Override
    int getMaxQuizMarks() {
        return 30;
    }

    public ClassroomCourse(Subject subject, String instructor, int fee, String school, String session) {
        super(subject, instructor, fee);
        this.school = school;
        this.session = session;
    }
}