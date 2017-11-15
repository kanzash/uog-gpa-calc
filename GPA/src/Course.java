public class Course {

    String name;
    double lecHrs;
    double labHrs;
    double credHrs;
    double percentGrade;
    double GPE; //grade point equivalency (converted from table)
    double WGP; //weighted grade points

    public Course() {

        this.credHrs = 0;
        this.labHrs = 0;
        this.lecHrs = 0;

    }

    public Course (String name, double lecHrs, double labHrs, double percentGrade) {

        this.name = name;
        this.lecHrs = lecHrs;
        this.labHrs = labHrs;
        this.percentGrade = percentGrade;

        this.credHrs = (lecHrs) + (labHrs/2);



        this.GPE = GPEConversion(percentGrade);

        //WGP
        this.WGP = this.GPE * this.credHrs;
    }

    public double GPEConversion(double percentGrade) {

        if(percentGrade >= 0 && percentGrade <= 49) {

            return 0.0;
        }

        else if(percentGrade >= 50 && percentGrade <= 52) {

            return 0.7;
        }

        else if(percentGrade >= 53 && percentGrade <= 56) {

            return 1.0;
        }

        else if(percentGrade >= 57 && percentGrade <= 59) {

            return 1.3;
        }

        else if(percentGrade >= 60 && percentGrade <= 62) {

            return 1.7;
        }

        else if(percentGrade >= 63 && percentGrade <= 66) {

            return 2.0;
        }

        else if(percentGrade >= 67 && percentGrade <= 69) {

            return 2.3;
        }

        else if(percentGrade >= 70 && percentGrade <= 72) {

            return 2.7;
        }

        else if(percentGrade >= 73 && percentGrade <= 76) {

            return 3.0;
        }

        else if(percentGrade >= 77 && percentGrade <= 79) {

            return 3.3;
        }

        else if(percentGrade >= 80 && percentGrade <= 84) {

            return 3.7;
        }

        else if(percentGrade >= 85 && percentGrade <= 100) {

            return 4.0;
        }

        return 0;
    }



    public double getLecHrs() {
        return lecHrs;
    }

    public double getLabHrs() {
        return labHrs;
    }

    public double getCredHrs() {
        return credHrs;
    }

    public double getGPE() {
        return GPE;
    }

    public double getPercentGrade() {
        return percentGrade;
    }

    public String getName() {
        return name;
    }

    public double getWGP() {
        return WGP;
    }

    public void setCredHrs(double credHrs) {
        this.credHrs = credHrs;
    }

    public void setLabHrs(double labHrs) {
        this.labHrs = labHrs;
    }

    public void setLecHrs(double lecHrs) {
        this.lecHrs = lecHrs;
    }

    public void setName(String name) {

        this.name = name;
    }

    public void setGPE(double GPE) {
        this.GPE = GPE;
    }

    public void setPercentGrade(double percentGrade) {
        this.percentGrade = percentGrade;
    }

    public void setWGP(double WGP) {
        this.WGP = WGP;
    }

    public String toString(Course c) {

        return "Course: " + c.name + "\n" + "Lecture Hours: " + c.getLecHrs() + "\n" + "Lab Hours: " + c.getLabHrs() + "\n" + "Grade: " + c.getPercentGrade() + "\n" + "Grade Point Equivalency: " + c.GPE + "\n";
        //return ("Hello");
    }
}
