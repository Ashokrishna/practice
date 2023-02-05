import java.util.Scanner;
class Balloon 
{
	public static void main(String[]args)
	{
		Scanner scanner = new Scanner(System.in);
    	System.out.print("Enter your age: ");
    	int age = scanner.nextInt();
    	String color;

    	if(age > 8)
    	{
    		System.out.println("The Balloon Colour Yellow is Allotted");
    	}
    	else 
    	{
    		System.out.println("You are Boy or Girl? (B/G): ");
    		String gender = scanner.next();
    		if(gender.equals("b"))
    		{
    			color="Blue";
    		}
    		else
    		{
    			color="Pink";
    		}
    		System.out.println("The Balloon Colour is "+ color+" is Allotted");

    	}



    // if (age > 8) {
    //   color = "yellow";
    // } else {
    //   System.out.print("Are you a boy or a girl? (b/g) ");
    //   String gender = scanner.next();
    //   if (gender.equals("b")) {
    //     color = "blue";
    //   } else {
    //     color = "pink";
    //   }
    // }
    // System.out.println("Your balloon color is: " + color);
		
	}
}