
import java.util.Stack;
public class Main
{
	public static void main(String[] args) {
		Stack <String> stk = new Stack<>();
		stk.push("Apple");
		stk.push("Grapes");
		stk.push("Orange");
		stk.push("Bannana");
		System.out.println("Stack" +stk);
		String fruits = stk.peek();
		System.out.println("Elements at top"+fruits);
	}
}
