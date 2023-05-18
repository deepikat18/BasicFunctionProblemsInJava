import java.util.Scanner;

public class CheckPalindromeOrNot {
    public static void main(String[] args) {
        Scanner i = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = i.nextInt();
        boolean palindrome = checkPalindrome(num);
        if (palindrome == true){
            System.out.println("Yes , It is a palindrome Number ");
        }
        else {
            System.out.println("It is Not a palindrome number ");
        }

    }
    static boolean checkPalindrome(int n){
        int reverse=0;
        int temp = n;
        while (temp !=0){
            reverse = (reverse*10)+(temp%10);
            temp = temp/10;
        }
        return reverse==n;

    }
}
