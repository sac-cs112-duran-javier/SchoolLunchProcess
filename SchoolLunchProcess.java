import java.util.Scanner;

public class SchoolLunchProcess {
	public static void main (String[]args) 
	{
		Scanner input = new Scanner(System.in);
		int hunger;
		
	System.out.println("You are hungry");
	System.out.println("You get in line");
	System.out.println("You dedice to buy lunch");
	System.out.println("Are you thirsty? (yes=1,n=2) : ");
	hunger = input.nextInt();
	if (hunger ==1)
		System.out.println("You are thirsty and you buy a coke for yourself");
	System.out.println("You eat your lunch.");
	System.out.println("You return your tray");
	System.out.println("You leave the area");
	}
}
	
