import java.util.Scanner;

public class PythagoreanTriplet {
    public static void main(String[] args) {
        Scanner i = new Scanner(System.in);
        int[] arr = { 3, 1, 4, 6, 5 };
        int[] arr1 = {10, 4, 6, 12, 5};
        int n = arr.length;
        boolean pythagoreanArray = CheckArray(arr,n);
        boolean pythagoreanArray1 = CheckArray(arr1,n);
        System.out.println(pythagoreanArray);
        System.out.println(pythagoreanArray1);
    }
    static boolean CheckArray(int arr[],int n){

        for (int i =0;i<n;i++){
            for (int j=i+1;j<n;j++){
                for (int k=j+1;k<n;k++){
                    int x = arr[i]*arr[i],y=arr[j]*arr[j],z=arr[k]*arr[k];
                    if (x == y+z || y ==x+z||z==x+y ){
                        return true;
                    }

                }
            }
        }

        return false;
    }
}
