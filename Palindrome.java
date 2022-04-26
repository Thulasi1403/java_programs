import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int b=a;
		int rem=0;
		while(b>0){
		    rem=rem*10+(b%10);
		    b=b/10;
		}
		if(rem==a){
		    System.out.println("Palindrome");
		}
		else{
		    System.out.println("Not a Palindrome");
		}
	}
}
