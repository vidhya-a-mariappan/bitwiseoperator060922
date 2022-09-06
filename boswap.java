import java.util.*;  
public class boswap  
{  
public static void main(String args[])  
{  
Scanner scan= new Scanner(System.in);  
System.out.print("Enter the first number: ");  
int a = scan.nextInt();  
System.out.print("Enter the second number: ");  
int b = scan.nextInt();  
System.out.println("Before swapping:");  
System.out.println("a = " +a +", b = " +b);  
a = a ^ b;//a=5  
b = a ^ b;  //b=3
a = a ^ b;  //a=6
System.out.println("After swapping:");  
System.out.print("a = " +a +", b = " +b);  
}  
}  

