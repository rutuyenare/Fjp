import java.util.Scanner;

public class sumAvg {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("sum and average");
        System.out.println("enter range of N numbers: ");
        int n = in.nextInt();
        int sum=0;

        for (int i = 0; i <= n ; i++) {
            sum += i;
        }
        System.out.println("sum of n numbers is : "+sum);
        int avg = sum/n;
        System.out.println("average of N numbers is : "+avg);

    }
}
