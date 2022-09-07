 


public class string_calc {

	public static int add(String str)
	{
		if(str.equals("")){
			return 0;
		}
		else
		{
			String []arr = splitNumbers(str,",");
			return sum(arr);
		}
	}
	
	
	public static String[] splitNumbers(String numbers, String divider){
	    return numbers.split(divider);
	}

	public static int toInt(String number)
	{
		return Integer.parseInt(number);
	}

	
	private static int sum(String[] mystr){
		int tot=0;
 	    if(mystr.length==1)
 	    {
 	    	tot=toInt(mystr[0]);
 	    }
 	    else if(mystr.length==2)
 	    {
 	    	tot=toInt(mystr[0])+toInt(mystr[1]);
 	    }
 	    return tot;
		
		}

		
    
    public static void main( String[] args)
    {
     
    	
    	
      System.out.println(add("1"));
      
      
      
      
      System.out.println(add("1,4"));
      
     
      
      System.out.println(add("1,2000"));
      
    }

}

