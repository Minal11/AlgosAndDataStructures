/**
 * 
 */
package yelpQuestions;
import java.util.*;
/**
 * @author Minal
 *
 */
public class OverlappingIntervals {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Interval> threads=new ArrayList<Interval>();
		Interval a=new Interval(10,13);
		Interval b=new Interval(2,4);
		Interval c=new Interval(5,7);
		Interval d=new Interval(8,9);
		Interval e=new Interval(1,3);
		Interval f=new Interval(2,3);
		
		
		threads.add(a);
		threads.add(b);
		threads.add(c);
		threads.add(d);
		threads.add(e);
		threads.add(f);
		threads.add(new Interval(14,15));
		System.out.println(threads);
		Collections.sort(threads, new Comparator<Interval>(){

			@Override
			public int compare(Interval s1, Interval s2) {
				// TODO Auto-generated method stub
			/*	if(s1.getStartTime()>s2.getStartTime())
					return 1;
				else if(s1.getStartTime()<s2.getStartTime())
					return -1;
				else*/
					return s1.getStartTime()-s2.getStartTime();
			}
			
		});
		
		ArrayList<Set<Interval>> result=new ArrayList<Set<Interval>>();
		System.out.println(threads);
		
		for(int i=1;i<threads.size();i++){
			//System.out.println(threads.get(i-1));
			Set<Interval> list=new HashSet<Interval>();
			//System.out.println(i+" index");
			while(i<threads.size()&&threads.get(i-1).getEndTime()>=threads.get(i).getStartTime()){
				list.add(threads.get(i-1));
				list.add(threads.get(i));
				i++;
				
				
			}
			
			if(list.isEmpty())
				list.add(threads.get(i));
			//list.add(threads.get(i));
		//	System.out.println(i+" "+threads.size());
			result.add(list);
			
			
		}

		System.err.println(result);
		

	}

}
