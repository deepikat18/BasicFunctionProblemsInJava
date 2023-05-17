import java.util.Scanner;

public class IsPrimeOrNot {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a Number to check whether it is prime or not : ");
        int n = in.nextInt();
        String Check = CheckPrime(n);
        System.out.println(Check);

    }
    static String CheckPrime(int num){
        if (num <=1){
            return "Not a Prime Number";
        }
        int c = 2;
        while (c*c <= num){
            if (num%c == 0){
                return "Not a Prime Number";
            }
            c++;
        }
        if (c*c > num){
            return "It is Prime Number";
        }
        return "Not a Prime Number";
    }
}
