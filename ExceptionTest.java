import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("line1");
		System.out.println("line2");
		System.out.println("line3");
		
		Scanner scan = new Scanner(System.in);
		
		try
		{
			System.out.println("please enter value of x...");
			int x = scan.nextInt();
			System.out.println("x "+x);
			
			System.out.println("please enter value of y...");
			int y = scan.nextInt();
			System.out.println("y "+y);
			
			int z =  x / y;
		//	String str = null;
		//	System.out.println(str.toUpperCase()+" is "+z);
			
			System.out.println("division is "+z);
		}
		catch(InputMismatchException e)
		{
			System.out.println("please enter numbers..."+e);
		}
		catch(ArithmeticException e)
		{
			System.out.println("please enter denominator as non zero "+e);
		}
		catch(RuntimeException e)
		{
			System.out.println("runtime error "+e);
		}
		catch(Throwable t)
		{
			System.out.println("i am here for fatal error ");
		}
		
		System.out.println("line4");
		System.out.println("line5");
		System.out.println("line6");
	}

}
