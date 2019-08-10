package Second;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class first {
	public static void main(String[]args) {
		
		ArrayList<Integer>arrl=new ArrayList<Integer>();
		for(int i=1;i<=10000;i++)
		{
			arrl.add(i);
		}
		System.out.println(arrl);
		
		HashSet<Integer>hs=new HashSet<Integer>();
		for(int j=1;j<=10000;j++)
		{
			hs.add(j);
		}
		System.out.println(hs);
		
		HashMap<Integer,Integer>hm=new HashMap<Integer,Integer>();
		for(int k=1;k<=10000;k++)
		{
			hm.put(k, k);
		}
		System.out.println(hm);
		
	}

}
