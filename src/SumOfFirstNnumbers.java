import java.util.Scanner;

public class SumOfFirstNnumbers {
    static int findSum(int n)
    {
        int sum = 0;
        for (int x = 1; x <= n; x++)
            sum = sum + x;
        return sum;
    }

    // Driver code
    public static void main(String args[])
    {
        Scanner i = new Scanner(System.in);
        int n = i.nextInt();
        System.out.println(findSum(n));
    }
}
