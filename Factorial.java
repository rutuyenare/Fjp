import java.util.Scanner;

public class factorial {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Welcome to factorial calculator");
        System.out.print("Enter the number: ");
        int num = in.nextInt();

        factorial ob = new factorial();
        int factorial = ob.fact(num);

        System.out.println("factorial of "+ num+" is "+factorial);

    }

    int fact(int num){

        int fact = 1;
        int i=num;
        while(i>0){
            fact = fact * i;
            i--;
        }
        return fact;
    }
}
