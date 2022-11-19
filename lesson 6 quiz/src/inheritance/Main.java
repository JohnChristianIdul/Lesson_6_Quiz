package inheritance;
import java.util.Scanner;

class Person {
    private String firstName;
    private String lastName;

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String firstName){
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}

class Student extends Person{
    String school;
    String studentId;
    int yearStarted;

    public void setSchool(String school) {
        this.school = school;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public void setYearStarted(int yearStarted) {
        this.yearStarted = yearStarted;
    }

    public String getSchool() {
        return school;
    }

    public String getStudentId() {
        return studentId;
    }

    public int getYearStarted() {
        return yearStarted;
    }

    void displayDetails(){
        System.out.println("Student from " + this.getSchool() + " with ID " + this.getStudentId() + " is " + this.getFirstName() + " "
                + this.getLastName() + " who started on " + this.getYearStarted() + ".");
    }
}

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Student s = new Student();
        System.out.print("School: ");
        String school = in.nextLine();
        System.out.print("Student ID: ");
        String studID = in.nextLine();
        System.out.print("First Name: ");
        String first = in.nextLine();
        System.out.print("Last Name: ");
        String last = in.nextLine();
        System.out.print("Year Started: ");
        int year_start = in.nextInt();

        s.setSchool(school);
        s.setStudentId(studID);
        s.setFirstName(first);
        s.setLastName(last);
        s.setYearStarted(year_start);
        System.out.println("");
        s.displayDetails();
    }

}
