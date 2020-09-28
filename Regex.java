import java.util.*;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Regex{
	public static void main(String[] args){
	System.out.println("Enter your Pincode");
	Scanner sc=new Scanner(System.in);
	String pin=sc.nextLine();
	
	Pattern pattern = Pattern.compile("^[0-9]{6}$"); //pin code is 6 digit string
	Matcher m=pattern.matcher(pin);                                       
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