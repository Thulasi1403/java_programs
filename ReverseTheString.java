public class Main
{
	public static void main(String[] args) {
		String str = "Dream Big",revstr = "";
		char ch;
		int length;
		System.out.println("Original string :" + str);
		for(int i =0;i<str.length();i++)
		{
		    ch =str.charAt(i);
		    revstr = ch +revstr;
		}
		System.out.println("Reversed string :" + revstr);
	}
}
