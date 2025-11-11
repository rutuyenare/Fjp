import java.util.Scanner;

		public class factorial {

		    public static void main(String[] args) {

		        Scanner sc = new Scanner(System.in);
		        System.out.println("Welcome to factorial calculator");
		        
		        int num = 5;
		        System.out.print("Enter the number: " +num);

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


