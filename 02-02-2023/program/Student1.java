class Student1
{
	public static void main(String[]args)
	{
		System.out.println("Lets's see the logical operater");
		System.out.println("A=10");
		System.out.println("B=20");
		System.out.println("C=30");
		System.out.println("D=40");
		int a=10;
		int b=20;
		int c=30;
		int d=40;
		System.out.println("And: "+((a<b) && (b<c) &&(c>d)));
		System.out.println("Or: "+((a<b) || (b>c) || (c>d)));				
		System.out.println("Not: "+((a!=b)));
	}
}