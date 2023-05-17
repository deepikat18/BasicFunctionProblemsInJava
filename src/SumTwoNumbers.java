import java.util.Scanner;

public class SumTwoNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the first Number : ");
        int first = in.nextByte();
        System.out.println("Enter the second Number : ");
        int second = in.nextInt();

        int sum = sumOfTwoNums(first,second);
        System.out.println("Sum of Two number is : "+sum);
        int mul = MulOfTwoNums(first,second);
        System.out.printf("Multiplication of Two number is %d : %n",mul);

        System.out.println("Enter the Radius Of the circle : ");
        double radius = in.nextFloat();
        double area = CircumferenceOfCircle((float) radius);
        System.out.println("Circumference of the circle is: "+area);



    }

    private static double CircumferenceOfCircle(float rad) {
        return 3.14*2*rad;
    }

    private static int sumOfTwoNums(int first, int second) {
        return first+second;
    }
    private static int MulOfTwoNums(int first, int second) {
        return first*second;
    }
}
