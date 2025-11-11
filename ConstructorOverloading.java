
		package bike;
		import java.util.*;
		public class bike
		{
		    int id;
		    String name;
		    int speed;

		    bike(int id, String name)
		    {
		        this.id = id;
		        this.name = name;
		        System.out.println("Bike ID: " + id + ", Bike Name: " + name);
		    }

		    bike(int id, String name, int speed)
		    {
		        this.id = id;
		        this.name = name;
		        this.speed = speed;
		        System.out.println("Bike ID: " + id + ", Bike Name: " + name + ", Bike Speed: " + speed + " km/h");
		    }

		    public static void main(String[] args)
		    {
		        bike b1 = new bike(101, "Yamaha");
		        bike b2 = new bike(102, "Honda", 120);
		    }
		}

	

