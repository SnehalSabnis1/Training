import java.util.*;
class Day
{
	public static void main(String args[]) 
	{
		Scanner sc=new Scanner(System.in);
		int day;
		System.out.println("Enter a number between 1 to 7");
		day= sc.nextInt();
		switch(day)
		{
		case 1:
			System.out.println("Its a Monday");
		break;
		case 2:
			System.out.println("Its a Tuesday");
		break;
		case 3:
			System.out.println("Its a Wednesday");
		break;
		case 4:
			System.out.println("Its a Thursday");
		break;
		case 5:
			System.out.println("Its a Friday");
		break;
		case 6:
			System.out.println("Its a Saturday");
		break;
		case 7:
			System.out.println("Its a Sunday");
		break;
		default:
			System.out.println("Wrong Choice");
		}
	}
}