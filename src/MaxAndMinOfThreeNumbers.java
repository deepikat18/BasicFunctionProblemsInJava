import java.util.Scanner;

public class MaxAndMinOfThreeNumbers {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        System.out.println("!------------------------Welcome to Java Programs----------------------------!");
        int a,b,c;
        System.out.println("Enter the 1st number : ");
        a  = in.nextInt();
        System.out.println("Enter the 2st number : ");
        b= in.nextInt();
        System.out.println("Enter the 3st number : ");
        c=in.nextInt();

        int largestNum = largestNumberAmongThree(a,b,c);
        int smallestNum =smallestNumberAmongThree(a,b,c);
        System.out.printf("Largest Number among %d, %d, %d is %d %n ",a,b,c,largestNum);
        System.out.printf("Smallest Number among %d, %d, %d is %d %n ",a,b,c,smallestNum);
    }
    static int largestNumberAmongThree(int a,int b,int c){
        int max = a;
        if (b>a){
            max = b;
        }
        if (c>a){
            max = c;
        }

        return max;
    }
    static int smallestNumberAmongThree(int a, int b,int c){
        int min = a;
        if (b<a){
            min = b;
        }
        if (c<a){
            min = c;
        }

        return min;
    }
}
