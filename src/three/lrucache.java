package three;

import java.util.Deque;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;


public class lrucache {
		static Deque<Integer>dq;
		static HashSet<Integer>map;
		static int psize;
		
		lrucache(int n)
		{
			dq=new LinkedList<>();
			map=new HashSet<>();
			psize=n;
		}
		public void refer(int x)
		{
			if(!map.contains(x)) {
				if(dq.size()==psize)
				{
					int last=dq.removeLast();
					map.remove(last);
				}
		}
			else {
				int index=0,i=0;
				 Iterator<Integer> itr = dq.iterator(); 
		            while (itr.hasNext()) { 
		                if (itr.next() == x) { 
		                    index = i; 
		                    break;
		                }
		               
		            }
		            dq.remove(index);
			}
			dq.push(x);
			dq.add(x);
		}
		public void display()
		{
			Iterator<Integer> itr=dq.iterator();
			while(itr.hasNext()) {
				System.out.print(itr.next()+" ");
			}
		}
		public static void main(String[]args)
		{
			lrucache lc=new lrucache(3);
			lc.refer(1);
			lc.refer(2);
			lc.refer(3);
			lc.refer(4);
			lc.refer(3);
			lc.refer(5);
			lc.refer(2);
			lc.display();
		}
}
			
			
				
				
				
	
