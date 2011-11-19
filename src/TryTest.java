public class TryTest
{
   public static void main(String [] args) throws Exception
   {
	   String a = "a's dfdd[2]asdfad{123avczas}";
	   System.out.println(a.replaceAll("'", "''"));
	   
	   a = "@{ASCII:233}";
	   String s[] = a.split("@");
	 
	   System.out.println(s[1].substring(s[1].indexOf(":")+1, s[1].indexOf("}")));
	}
}