
public class stringequal {
	public static void main(String[]args)
	{
		String s1="Jaipur";
		String s2="Ahmedabad";
		String s3="Jaipur";
		String s4="Jaipur";
		String s5=new String("Ahmedabad");
		String s6="Mumbai";
		String s7=new String("Ahmedabad");
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3)); 
		System.out.println(s2.equals(s5));
		System.out.println(s1.equalsIgnoreCase(s4));
		System.out.println(s1.equals(s6));
		System.out.println(s1==s4);
	}
	

}
