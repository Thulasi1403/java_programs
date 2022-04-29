
import java .util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		System.out.println(digit(a));
	}
	static int digit(int n){
	    if(n<=1){
	        return 1;
	    }else{
	        return n+digit(n-1);
	    }
	}
}
