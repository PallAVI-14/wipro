import java.util.*;
public class conditional {

	public static void main(String[] args) {
		int number;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number");
		number=sc.nextInt();
		if(number>0)
		{
			System.out.println("positive");
		}
		if(number<0)
		{
		System.out.println("negative");
	}
		else if(number==0)

	{
		System.out.println("zero");
	}
	}
}