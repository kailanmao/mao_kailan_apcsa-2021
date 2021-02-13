//(c) A+ Computer Science
//www.apluscompsci.com
//Name - KAILAN M
//Date - 2/7/21


public class FirstLastVowel
{
   public static String go( String a )
	{
	   String vowels = "aeiouAEIOU";
	   String first = a.substring(0 , 1);
	   String last = a.substring( a.length() - 1 , a.length());
		
		if (vowels.indexOf(a.charAt(0)) >= 0) {
			return "yes";
		}
		
		if (vowels.indexOf(a.charAt(a.length()-1)) >= 0) {
			return "yes";
		}
		
		return "no";
		
	}
}