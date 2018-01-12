import java.util.Scanner;

import java.util.ArrayList;

public class Main {

    ArrayList<Course> allCourse = new ArrayList<Course>();

    public static void main(String[] args) {

        Main m = new Main();
        m.UserInterface();

        //GUI g = new GUI();

        //g.setVisible(true);

    }

    private boolean isInteger(String s) {

        try {

            Integer i = Integer.parseInt(s);
            return i > 0;

        } catch (NumberFormatException e) {

            return false;
        }
    }


    private boolean isDouble(String s) {

        try {

            Double d = Double.parseDouble(s);
            return d >= 0;
        } catch (NumberFormatException e) {

            return false;
        }
    }

    public void UserInterface() {

        System.out.println("Welcome to GPA Calculator");

        Scanner s = new Scanner(System.in);

        boolean running = true;

        while(running) {

            System.out.println("1.Enter grades for new course");
            System.out.println("2.View all courses entered");
            System.out.println("3.View GPA for all courses entered");
            System.out.println("4. Quit");

            String input = s.nextLine();

            switch (input) {

                case "1":
                    CourseInfo();
                    break;

                case "2":
                    PrintCourseInfo();
                    break;

                case "3":
                    TotalGPA();
                    break;

                case "4":
                    running = false;
                    break;

                default:
                    break;
            }
        }
    }

    private void CourseInfo() {

        Course c = new Course();

        Scanner s = new Scanner(System.in);

        System.out.println("Enter course name / course code");
        String courseName = s.nextLine();
        //c.setName(courseName);
        System.out.println(courseName);

        System.out.println("Enter number of lecture hours per week");
        String courseLec = s.nextLine();
        //c.setLecHrs(Double.valueOf(courseLec));
        while(!isDouble(courseLec)) {

            System.out.println("Enter valid values");
            courseLec = s.nextLine();
        }
        System.out.println(courseLec);

        System.out.println("Enter number of lab hours per week");
        String courseLab = s.nextLine();
       // c.setLabHrs(Double.valueOf(courseLab));
        while(!isDouble(courseLab)) {

            System.out.println("Enter valid values");
            courseLab = s.nextLine();
        }
        System.out.println(courseLab);

        System.out.println("Enter grade received in course 0-100");
        String avg = s.nextLine();
        //c.setPercentGrade(Double.valueOf(avg));
        while(!isDouble(avg)) {

            System.out.println("Enter valid values");
            avg = s.nextLine();
        }
        System.out.println(avg);

        //DE courses? seminars vs lectures //labs vs seminars

        Course c1 = new Course(courseName,Double.valueOf(courseLec),Double.valueOf(courseLab), Double.valueOf(avg));

        //allCourse.add(c);
        allCourse.add(c1);


        //System.out.println(c.toString(c));

        PrintCourseInfo();
    }

    private void TotalGPA() {

        double totalCreditHrs = 0;
        double totalWGP = 0;
        double GPA = 0;

        for(int i = 0; i < allCourse.size(); i++) {

            totalCreditHrs += allCourse.get(i).getCredHrs();

            totalWGP += allCourse.get(i).getWGP();
        }

        GPA = totalWGP / totalCreditHrs;

        System.out.println("Your GPA is: " + GPA);
    }

    private void PrintCourseInfo() {

        Course c = new Course();

        for(int i = 0; i < allCourse.size(); i++) {

            System.out.println( c.toString(allCourse.get(i)) );
        }
    }

    public void CalculateSemesterAverage() {

        int numCourses = 0;

        for(int i = 0; i < numCourses; i++) {

            //for each course, gather information
            CourseInfo();
        }

        if (allCourse.size() == 1) {

            Semester s = new Semester(allCourse.get(0));
        }

        else if(allCourse.size() == 2) {

            Semester s = new Semester(allCourse.get(0), allCourse.get(1));
        }

        else if(allCourse.size() == 3) {

            Semester s = new Semester(allCourse.get(0), allCourse.get(1), allCourse.get(2));
        }

        else if(allCourse.size() == 4) {

            Semester s = new Semester(allCourse.get(0), allCourse.get(1), allCourse.get(2), allCourse.get(3));
        }

        else if(allCourse.size() == 5) {

            Semester s = new Semester(allCourse.get(0), allCourse.get(1), allCourse.get(2), allCourse.get(3), allCourse.get(4));
        }

        else if(allCourse.size() == 6) {

            Semester s = new Semester(allCourse.get(0), allCourse.get(1), allCourse.get(2), allCourse.get(3), allCourse.get(4), allCourse.get(5));
        }
    }

}
