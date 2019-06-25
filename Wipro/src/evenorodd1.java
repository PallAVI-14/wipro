import java.util.*;
public class evenorodd1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a and b");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=a+b;
		System.out.println("sum is:"+c);
		if (c%2==0)
		{
			System.out.println("c is even");
		}
		else
			System.out.println("c is odd");
	}

}
