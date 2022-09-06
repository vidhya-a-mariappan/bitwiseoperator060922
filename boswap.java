import java.util.Scanner;  
public class boswap  
{  
public static void main(String args[])  
{  
int a, b;  
Scanner scan= new Scanner(System.in);  
System.out.print("Enter the first number: ");  
a = scan.nextInt();  
System.out.print("Enter the second number: ");  
b = scan.nextInt();  
System.out.println("Before swapping:");  
System.out.println("a = " +a +", b = " +b);  
a = a ^ b;//a=5  
b = a ^ b;  //b=3
a = a ^ b;  //a=6
System.out.println("After swapping:");  
System.out.print("a = " +a +", b = " +b);  
}  
}  
