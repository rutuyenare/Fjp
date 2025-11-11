package exp5;

	import java.util.*;

	public class SimpleSort {
	    public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        System.out.println("1. Integers  2. Strings");
	        int ch = in.nextInt(); in.nextLine();

	        System.out.print("How many elements? ");
	        int n = in.nextInt(); in.nextLine();

	        if (ch == 1) {
	            int[] a = new int[n];
	            System.out.println("Enter numbers:");
	            for (int i = 0; i < n; i++) a[i] = in.nextInt();
	            Arrays.sort(a);
	            System.out.println("Sorted: " + Arrays.toString(a));
	        } else {
	            String[] s = new String[n];
	            System.out.println("Enter names:");
	            for (int i = 0; i < n; i++) s[i] = in.nextLine();
	            Arrays.sort(s);
	            System.out.println("Sorted: " + Arrays.toString(s));
	        }
	    }
	}
