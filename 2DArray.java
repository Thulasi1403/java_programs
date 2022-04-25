import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner s = new Scanner(System.in);
	    int a =s.nextInt();
	    int b =s.nextInt();
	    int [][] c=new int [a][b];
	    for(int i=0;i<3;i++)
	    {
	        for(int j=0;j<3;j++)
	        {
	            c[i][j] =s.nextInt();
	        }
	    }
	    for(int i=0;i<3;i++)
	    {
	        for(int j=0;j<3;j++)
	        {
	            System.out.print(c[i][j] + " ");
	        }
	        System.out.println();
	    }
	    
		
	}
}
