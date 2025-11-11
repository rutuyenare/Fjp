


import java.util.Scanner;

public class PrimeNumbers {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Welcome to prime number calculator");
        System.out.println("First 50 prime numbers are : ");
        for (int i = 0; i <= 50; i++) {
            if(isPrime(i)){
                System.out.print(i+" ");
            }

        }

    }

    public static boolean isPrime(int n){

        if(n <2) return false;

        for (int i = 2; i < n/2; i++) {
            if(n%i ==0){
                return false;
            }
        }
        return true;
    }


}

	


