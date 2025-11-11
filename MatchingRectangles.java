import java.util.Scanner;

public class MatchingRectangle {
	double l,w;
	String colour;
	Scanner ob=new Scanner (System.in);
	void get_length()
	{
		l= ob.nextDouble();
	}
	void get_width()
	{
		w= ob.nextDouble();
	}
	void get_colour()
	{
		colour=ob.next();
	}
	double find_area()
	{
		return (l*w);
	}
		public static void main(String[] args) {
		MatchingRectangle r1= new MatchingRectangle();
		MatchingRectangle r2= new MatchingRectangle();
		System.out.println("Enter Lenghth,Breadth,Colour of Rectangle1:");
		r1.get_length();
		r1.get_width();
		r1.get_colour();
		System.out.println("Enter Lenghth,Breadth,Colour of Rectangle2:");
		r2.get_length();
		r2.get_width();
		r2.get_colour();
		if((r1.find_area()==r2.find_area())&& r1.colour.equals (r2.colour))
		{
			System.out.println("Matching Rectangles");
		}
		else
		{
			System.out.println("Non-Matching Rectangles");
		}
	}

}
