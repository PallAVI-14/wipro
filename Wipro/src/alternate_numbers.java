import java.util.*;
public class alternate_numbers {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter n");
		int n=sc.nextInt();
		for(int i=1; i<=n; i+=2)
		{
			System.out.println(i);
		}
	}

}
