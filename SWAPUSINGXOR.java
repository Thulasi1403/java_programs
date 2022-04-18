package problem;
import java .util.*;

public class ADDITION {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		a = a ^ b;
		b = b^a; 
a =a ^b;
System.out.println("The value of x is" + a + "and the value of y is "+ b );
		

	}

}
