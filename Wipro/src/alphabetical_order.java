import java.util.*;
public class alphabetical_order {

	 public static void main(String[] args) {
	        String result = "";
	        Scanner sc= new Scanner(System.in);
	        String input = sc.nextLine();

	        for(int i = 1; i < input.length(); i++)
	        {
	            if(input.charAt(i-1) < input.charAt(i))
	                result += input.charAt(i-1);
	          
	        }
	        System.out.println(result);
	    }


	}

	

