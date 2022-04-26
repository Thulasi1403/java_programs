import java.util.*;
public class Main{
    public static void main(String[]args){
        Scanner s = new Scanner (System.in);
        String sh;
        sh =s.nextLine();
        
        String []a =sh.split(" ");
        for(int i=0;i<a.length;i++)
        {
            char arr[] = a[i].toCharArray();
            for(int j =arr.length-1;j>=0;j--)
            {
                System.out.print(arr[j]);       
            }
            System.out.print(" ");
        }
        }
}
