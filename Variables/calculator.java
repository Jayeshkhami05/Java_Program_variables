import java.util.Scanner;
class Calculator
{
	
	static int data=0;
	public static void add()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int a =sc.nextInt();
         data=data+a;
		 System.out.println(data);
	}
	public static void sub()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int a =sc.nextInt();
         data=data-a;
		 System.out.println(data);
	}
	public static void mul()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int a =sc.nextInt();
         data=data*a;
		 System.out.println(data);
	}
	public static void quo()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int a =sc.nextInt();
         data=data/a;
		 System.out.println(data);
	}
	public static void rem()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int a =sc.nextInt();
         data=data%a;
		 System.out.println(data);
	}
	
}