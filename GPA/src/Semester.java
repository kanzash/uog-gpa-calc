public class Semester {

    Course c1;
    Course c2;
    Course c3;
    Course c4;
    Course c5;
    Course c6;

    double semesterGPA;
    double totalCreditHrs = 0;
    double totalWGP = 0;

    public Semester() {
    }

    public Semester(Course c1) {

        this.totalCreditHrs = c1.getCredHrs();
        this.totalWGP = c1.getWGP();
    }

    public Semester(Course c1, Course c2) {

        this.totalCreditHrs = c1.getCredHrs() + c2.getCredHrs();
        this.totalWGP = c1.getWGP() + c2.getWGP();
    }

    public Semester(Course c1, Course c2, Course c3) {

        this.totalCreditHrs = c1.getCredHrs() + c2.getCredHrs() + c3.getCredHrs();
        this.totalWGP = c1.getWGP() + c2.getWGP() + c3.getWGP();
    }

    public Semester(Course c1, Course c2, Course c3, Course c4) {

        this.totalCreditHrs = c1.getCredHrs() + c2.getCredHrs() + c3.getCredHrs() + c4.getCredHrs();
        this.totalWGP = c1.getWGP() + c2.getWGP() + c3.getWGP() + c4.getWGP();
    }

    public Semester(Course c1, Course c2, Course c3, Course c4, Course c5) {

        this.totalCreditHrs = c1.getCredHrs() + c2.getCredHrs() + c3.getCredHrs() + c4.getCredHrs() + c5.getCredHrs();
        this.totalWGP = c1.getWGP() + c2.getWGP() + c3.getWGP() + c4.getWGP() + c5.getWGP();
    }

    public Semester(Course c1, Course c2, Course c3, Course c4, Course c5, Course c6) {

        this.totalCreditHrs = c1.getCredHrs() + c2.getCredHrs() + c3.getCredHrs() + c4.getCredHrs() + c5.getCredHrs() + c6.getCredHrs();
        this.totalWGP = c1.getWGP() + c2.getWGP() + c3.getWGP() + c4.getWGP() + c5.getWGP() + c6.getWGP();
    }

    public void setSemesterGPA(double totalCreditHrs, double totalWGP) {

        this.semesterGPA = this.totalWGP/this.totalCreditHrs;
    }

    public void setTotalCreditHrs(double creditHrs) {

        this.totalCreditHrs = creditHrs;
    }

    public void setTotalWGP (double WGP) {

        this.totalWGP = WGP;
    }

}
