import java.util.Scanner;

public class GradesBasedOnMarks {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please Enter your Marks Here : ");
        int sub1 = in.nextInt();
        int sub2 = in.nextInt();
        int sub3 = in.nextInt();
        int sub4 = in.nextInt();
        int sub5 = in.nextInt();
        int marks = (sub1+sub2+sub3+sub4+sub5)/5;
        String checkGrades = gradesAllocation(marks);
        System.out.println(checkGrades);

    }
// Marks        Grade
//91-100         AA
//81-90          AB
//71-80          BB
//61-70          BC
//51-60          CD
//41-50          DD
//<=40          Fail
    static String gradesAllocation(int marks){
       if (marks <= 100 && marks >= 91)
           return ("AA");
       else if (marks <= 90 && marks >= 81)
           return "AB";
       else if (marks <= 80 && marks >= 71)
           return "BB";
       else if (marks <= 70 && marks >= 61)
           return "BC";
       else if (marks <= 60 && marks >= 51)
           return "CD";
       else if (marks <= 50 && marks >= 41)
           return "DD";
       else
           return "fail";
    }
}
