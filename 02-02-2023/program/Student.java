import java.util.Scanner;
class Student
{
	public static void main(String[]args)
	{
		System.out.println("Enter the Year: ");
		Scanner a = new Scanner(System.in);
		int value = a.nextInt();
		System.out.println("Hey! have a nice "+value);
	}
}