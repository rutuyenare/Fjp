package calculator;
import java.util.Scanner;

		public class calculator {
		    public static void main(String[] args) {
		        Scanner in = new Scanner(System.in);
		        System.out.println("Welcome to calculator");
		       
		        int a= 15;
		        System.out.print("Enter 1st number: " +a);
		        
		        int b= 50;
		        System.out.print("Enter 2nd number: " +b);

		        calculator ob = new calculator();
		        int c;
		        do {
		        System.out.println("MENU: 1.Addition  2.Subtraction 3.Multiplication 4.Division 5.Exit");
		        System.out.println("Enter your choice");
		         c = in.nextInt();

		            switch (c){
		                case 1 :
		                    System.out.println("Addition is: " + ob.add(a,b));
		                    break;
		                case 2 :
		                    System.out.println("Subtraction is: " + ob.sub(a,b));
		                    break;
		                case 3 :
		                    System.out.println("Multiplication is: " + ob.mul(a,b));
		                    break;
		                case 4 :
		                    System.out.println("Division is: " + ob.div(a,b));
		                    break;
		                case 5 :
		                    System.out.println("Thank you!");
		                    break;
		                default :
		                    System.out.println("invalid choice");
		            }
		        }while (c!=5);


		    }

		    int add(int a,int b){
		        return a+b;
		    }
		    int sub(int a,int b){
		        return a-b;
		    }
		    int mul(int a,int b){
		        return a*b;
		    }
		     int div(int a,int b){
		        return a%b;
		    }
		

	}


