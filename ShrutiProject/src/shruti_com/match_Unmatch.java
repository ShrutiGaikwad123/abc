package shruti_com;

public class match_Unmatch {

	public static void main(String[] args) {
		String bucketA[]= {"70A","30B","40C","33T","42L","20C"};
	    String bucketB[]= {"18C","30B","40C","70A","33T","42L"};
	    
	    System.out.print("Matching tag: ");
	    for (int i=0;i<bucketA.length;i++) 
	    {
	        for(int j=0;j<bucketB.length;j++)
	        {
	            if(bucketA[i]==bucketB[j])
	            {
	                System.out.print(bucketA[i] + " ");
	            }
	       }
	    }
	    
	    System.out.println("");
	    System.out.print("Not Matching tag: ");
	    for (int i=0;i<bucketA.length;i++) 
	    {
	        boolean isMatchFound = false;
	        for(int j=0;j<bucketB.length;j++)
	        {
	            if(bucketA[i]==bucketB[j])
	            {
	               isMatchFound = true;
	            }
	       }
	       if (isMatchFound==false) 
	       {
	          System.out.print(bucketA[i] + " ");
	       }
	    }

	}

}
