import java.util.*;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Regex{
	public static void main(String[] args){
	System.out.println("Enter your Pincode");
	Scanner sc=new Scanner(System.in);
	String pin=sc.nextLine();
	
	Pattern pattern = Pattern.compile("^[1-9]{1}[0-9]{2}\s{0,1}[0-9]{3}$"); //Some websites and banks have the habit of spacing pincode after 3 digits 
	Matcher m=pattern.matcher(pin);                                         //To match both 515411 and 515 411 the following pattern will sure work.
	int i=0;

	while(m.find()){
		System.out.println("Valid Pincode");
		i=1;
	}
	 if(i==0){
		System.out.println("Invalid Pincode");	
	}

	
}
}