package Class;

public class Varags {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bac obj=new Bac();
		System.out.println(obj.mul(7,3,23,3));
	}

}

class Bac
{
	public int mul(int...a)
	{
		int mul=1;
		for(int k:a)
		{
			mul=mul*k;
		}
		return mul;
	}
}