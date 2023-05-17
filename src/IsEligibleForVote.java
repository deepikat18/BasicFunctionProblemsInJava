import java.util.Scanner;

public class IsEligibleForVote {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please Enter your Age Here : ");
        int age = in.nextInt();
        String checkAge = checkEligibility(age);
        System.out.println(checkAge);

    }
    static String checkEligibility(int num){
        if (num >= 18 ){
            return "You can Vote";
        }
        else if (num < 18 && num > 0){
            return "Yor are unable to Vote";
        }
        else
            return "Please enter valid Age";
    }
}
