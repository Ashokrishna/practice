class Student 
{
	public static void main(String[]args)
	{
		//Post Increment and Pre Increment
		//Post Increment=++i
		//Pre Increment=i++
		int number=0;
		number++;
		System.out.println(number);//0
		System.out.println(++number);//1
		int a=0;
		int b=1;
		System.out.println(a);//0
		System.out.println(a++);//1 Pre Increment
		System.out.println(++b);//2 Post Increment
		//Post decrement and Pre decrement
		//Post Decrement=--i
		//Pre Decrement=i--
		int number1=0;
		number1--;
		System.out.println(number1);//-1 Post Decrement
		System.out.println(--number1);//-2 Pre Decrement

	}
	public static void main2(String[]name)
	{
		System.out.println("Price Check..");
		int time1=10;
		int time2=15;
		int time3=20;
		int time4=10;

		System.out.println(time1 == time4);

		System.out.println(time1 != time2);

	}
}