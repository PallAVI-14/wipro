import java.util.*;
public class diff3 {

	public static void main(String[] args) {
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter n");
		n=sc.nextInt();
		for(int i=100; i>=n; i-=3)
		{
			System.out.println(i);
		}
	}

}
