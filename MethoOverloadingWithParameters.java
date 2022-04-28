

public class Main
{
	public static void main(String[] args) {
		int a =10;
		int b =67;
		double  c=45.66;
		System.out.println(sample(a));
		System.out.println(sample(a,b));
		System.out.println(sample(a,b,c));
	}
	static int sample(int x){
	    return x;
	}
	static int sample(int x ,int y){
	    return x+y;
	}
	static double sample(int x, int y,double z){
	    return x+y+z;
	}
}
