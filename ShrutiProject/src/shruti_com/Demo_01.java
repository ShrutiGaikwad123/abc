package shruti_com;

public class Demo_01 {

	public static void main(String[] args) {
		// Reveres string using Concatenation
		 
		String str = "abcd";
		String rev= "";
		
		int len=str.length();
		
		for(int i = len-1; i>=0; i--)
		{
			rev=rev+str.charAt(i);
		}
		System.out.println("Reverse string is:   " +rev);

	}

}
