import java.util.Scanner;

//     [Write a program to print the factorial of a number by defining a method named 'Factorial'.](https://www.javatpoint.com/factorial-program-in-java)
//    Factorial of any number n is represented by n! and is equal to 1 * 2 * 3 * .... * (n-1) *n. E.g.- <br/>
//<pre>
//4! = 1 * 2 * 3 * 4 = 24
//        3! = 3 * 2 * 1 = 6
//        2! = 2 * 1 = 2
//    Also,
//            1! = 1
//            0! = 1
//</pre>
public class FactorialOfGivenNumber {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Please Enter your Number Here : ");
        int number = in.nextInt();
        int factorialOfNumber = factorial(number);
        System.out.println("The factorial of is "+factorialOfNumber);

    }
    static int factorial(int num){
        int i,fact = 1;
        for(i=1;i<=num;i++){
            fact = fact*i;
        }
        return fact;

    }

}
