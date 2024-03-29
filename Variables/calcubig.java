import java.util.Scanner;
class CalciDriver 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		for(;;)
		{
			System.out.println("1.add 2.sub 3.mul 4.quo 5.rem 6.exit");
           int choice=sc.nextInt();
		   switch(choice)
		   {
			    case 1:
					Calculator.add();
				break;

				case 2:
					Calculator.sub();
				break;

				case 3:
					Calculator.mul();
				break;

				case 4:
					Calculator.quo();
				break;

				case 5:
					Calculator.rem();
				break;

				case 6:
					System.exit(1);
		   }
		}
	}


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
}