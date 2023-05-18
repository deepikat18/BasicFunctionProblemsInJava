import java.util.Scanner;

public class PrimeNumberBetweenTheInterval {
    public static void main(String[] args) {

        Scanner i = new Scanner(System.in);
        int first = i.nextByte();
        int second = i.nextByte();
        primeNumbers(first,second);

    }

    static void primeNumbers(int low,int high) {
        while (low < high) {
            boolean flag = false;

            for (int i = 2; i <= low / 2; ++i) {
                // condition for nonprime number
                if (low % i == 0) {
                    flag = true;
                    break;
                }
            }

            if (!flag && low != 0 && low != 1)
                System.out.print(low + " ");

            ++low;

        }
    }
}


