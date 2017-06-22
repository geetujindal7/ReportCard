public class ReportCard {
    private String student_name;
    private String grade_student;
    private final result=0;
    private final total=0;
    private int student_rollno;
    private int subject1Marks = 0;
    private int subject2Marks = 0;
    private int subject3Marks = 0;
    private int subject4Marks = 0;

    public Report(String name, int rollNo, int subject1, int subject2, int subject3, int subject4) {
        this.student_name = name;
        this.student_rollno = rollNo;
        this.subject1Marks = subject1;
        this.subject2Marks = subject2;
        this.subject3Marks = subject3;
        this.subject4Marks = subject4;
    }

    public String getstudentname() {
        return student_name;
    }

    public String getstudentrollno() {
        return student_rollno;
    }

    public String getsubject1Marks() {
        return subject1Marks;
    }

    public String getsubject2Marks() {
        return subject2Marks;
    }

    public String getsubject3Marks() {
        return subject3Marks;
    }

    public String getsubject4Marks() {
        return subject4Marks;
    }

    public void setname(String name) {
        this.student_name = name;
    }

    public void setrollNo(int rollNo) {
        this.student_rollno = rollNo;
    }

    public void setsubject1(int subject1) {
        this.subject1Marks = subject1;
    }

    public void setsubject2(int subject2) {
        this.subject2Marks = subject2;
    }

    public void setsubject3(int subject3) {
        this.subject3Marks = subject3;
    }

    public void setsubject4(int subject4) {
        this.subject4Marks = subject4;
    }

    private String perc(int subject1Marks, int subject2Marks, int subject3Marks, int subject4Marks) {
        total = subject1Marks + subject2Marks + subject3Marks + subject4Marks;
        result = total / 4;
        if (result >= 91) {
            grade_student = "A+";
        } else if (result >= 81) {
            grade_student = "A";
        } else if (result >= 71) {
            grade_student = "B";
        } else if (result >= 61) {
            grade_student = "C";
        } else if (result >= 41) {
            grade_student = "D"
        } else if (result >= 33) {
            grade_student = "E"
        } else {
            grade_student = "FAIL";
        }
        return grade_student;
    }

    @Override
    public String toString() {
        return "Report " + "\n" +
                "Roll No = " + getstudentrollno(student_rollno) + "\n" +
                "Name = " + getstudentname(student_name) + "\n" +
                "Grade = " + perc(getsubject1Marks(), getsubject2Marks(), getsubject3Marks(), getsubject4Marks()) + "\n" +
                "Marks In Subject1 = " + subject1Marks + "\n" +
                "Marks In Subject2 = " + subject2Marks + "\n" +
                "Marks In Subject3 = " + subject3Marks + "\n" +
                "Marks In Subject4 = " + subject4Marks + "\n" +
                "ThankYou...";
    }

}