package shruti_com;

public class Demo_02arr_rev {

	public static void main(String[] args) {
	  
		//Reverse string using charater Array
		String str= "there was a king";
		String rev = "";
		char a[]= str.toCharArray();
		
		int len = a.length;
		
		for(int i = len-1;i>=0; i--)
		{
			rev=rev+a[i];
			
		}
    System.out.print("Reverse String is: "+rev);
	}

}
