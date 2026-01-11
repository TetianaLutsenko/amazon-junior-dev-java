class OnlineCourse extends Course {

    private int weeks;
    private int videoLessons;

    @Override
    int getMaxAssignmentMarks() {
        return 30;
    }

    @Override
    int getMaxQuizMarks() {
        return 10;
    }
    public OnlineCourse(Subject subject, String instructor, int fee, int weeks, int videoLessons) {
        super(subject, instructor, fee);
        this.weeks = weeks;
        this.videoLessons = videoLessons;

    }
}