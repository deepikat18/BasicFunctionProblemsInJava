import java.util.Scanner;

public class EvenOrOddOfGivenNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = in.nextInt();
        String check = checkEvenOrOdd(n);
        System.out.println(check);
    }
    static String checkEvenOrOdd(int num){
        if (num % 2==0) {
            return "Even";
        }
        else{
            return "Odd";
        }
    }
}
