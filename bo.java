import java.util.*;
public class bo
{
	public static void main(String[] args)
	{
		//explaining basic functionality of bitwise operators how its work
		System.out.println("Enter two numbers to know about the functionality of a Bitwise operators");
		Scanner s=new Scanner(System.in);
		int x=s.nextInt();
		int y=s.nextInt();
		System.out.println("x=" + x + "y=" + y);
		System.out.println("Functionality of Bitwise Operators");
		System.out.println("1.AND (x & y)");
		System.out.println("Returns 1 only if both bit are 1 " + x + "& " + y + "is " + (x & y));
		System.out.println("2.OR(x ^ y)");
		System.out.println("Returns 0 only if both bit are 0 " + x + "& " + y + "is " + (x ^ y));
		System.out.println("3.XOR(x|y)");
		System.out.println("Returns 1 only if both bit are different " + x + "& " + y + "is " + (x|y));
		System.out.println("4.Complement(~x)");
		System.out.println("Changes the bit 0 to 1 and vice versa " + "~" + x + " is " + (~x));
		System.out.println("5.Signed Right shift (x>>number)");
		System.out.println("Moves the bits of a number in a given number of places to the right "+x+">>1 is " + (x>>1));
		System.out.println("6.Unsigned right shift (x>>>1)");
		System.out.println("Moves the bits of a number in a given number of places to the right.Only difference is for negative bits, unsigned right shift operators provide different results");
		System.out.println(x + ">>> 1 is "+(x>>>1));
		System.out.println("7.Signed left shift (x<<1) = " + (x << 1));
		System.out.println("Moves the bits of a number in a given number of places to the left " +x+"<<1 is " + (x<<1));
		}
}
