import java.util.*;
public class bo_odd_or_even {
	public static void main (String args[]) {
		Scanner scan= new Scanner(System.in);  
		System.out.print("Enter the number to find even or odd ");  
		int a = scan.nextInt();  
		boolean res =false;
		System.out.println("Check for odd or even using");
		System.out.println("1.bitwise 'xor' operator");
		System.out.println("2.bitwise 'and' operator");
		System.out.println("3.bitwise 'or' operator");
		int option = scan.nextInt();
		switch(option)
		{
		case 1:
		System.out.println("Check for odd or even using bitwise 'xor' operator");
		if((a^1) == a+1)//xor the given number by 1, increases by 1 for even and decreases by 1 for odd
			res=true;
		else
		    res=false;
		break;
		case 2:
		System.out.println("Check for odd or even using bitwise 'and' operator");
		if((a&1) != 1)//and the given number by 1,gives 1 if it is odd and 0 if it is even
			res=true;
		else
			res=false;
		break;
		case 3:
		System.out.println("Check for odd or even using bitwise 'or' operator");
		if((a|1) > a)//or the given number by 1,gives next number for even and same number for odd
			res=true;
		else
			res=false;
		break;
		default:
			break;
		}
		if(res)
			System.out.println("The number is even");
		else
			System.out.println("The number is odd");
	}
}
