package stringClass;

public class Str1 {

	public static void main(String[] args) 
	{
		String str="anand bhayre";
		
		//Length
		System.out.println(str.length());
		
		//Trim
		System.out.println(str.trim());
		
		//Chat At
		System.out.println(str.charAt(4));
		
		//Sub String
		String str2=str.substring(0, 5);
		System.out.println(str2);		
		String str3=str.substring(6);
		System.out.println(str3);
		
		String str4=" anand ";
		
		String str6=str4.trim();
		
		String str5=str6.substring(0);
		System.out.println(str5);
		
		//Replace
		String str7=str.replace("an", "zy");		
		System.out.println(str7);
		
		//Split		
		String[] arr=str.split(" ");
		int l= arr.length;
		System.out.println(l);		
		System.out.println(arr[1]);
		
		//Equals & EqualIgnoreCase
		
		String a="Anand";
		String b="anand";
		
		/*System.out.println(a.equals(b));
		System.out.println(a.equalsIgnoreCase(b));
		*/
		if(a.equalsIgnoreCase(b))
		{
			System.out.println("Strings matched");
		}else
		{
			System.out.println("Strings not matched");
		}
		
		
		
		
		
	}

}
