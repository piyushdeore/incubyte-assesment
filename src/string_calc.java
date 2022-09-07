
public class string_calc {

	public static int add(String str) {
		if (str.equals("")) {
			return 0;
		} else {
			String[] arr = splitNumbers(str, ",");
			return sum(arr);
		}
	}

	public static String[] splitNumbers(String numbers, String divider) {
		return numbers.split(divider);
	}

	public static int toInt(String number) {
		return Integer.parseInt(number);
	}

	private static int sum(String[] mystr) {
		int total = 0;
 	    String negStr = "";

        for(String number : mystr){
        	if(toInt(number) < 0){
        		if(negStr.equals(""))
        			negStr = number;
        		else
        			negStr += ("," + number);
        	}
        	if(toInt(number) < 1000)
		    	total += toInt(number);
		}

		if(!negStr.equals("")){
			throw new IllegalArgumentException("Negatives not allowed: " + negStr);
		}


		return total;

	}

	public static void main(String[] args) {

		System.out.println(add("1"));

		System.out.println(add("1,4"));

		System.out.println(add("1,4,5,8,7"));

		System.out.println(add("1,2000"));

		System.out.println(add("1,-5,8,9,-99"));

	}

}
