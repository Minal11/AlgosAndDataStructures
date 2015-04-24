/**
 * 
 */
package yelpQuestions;

/**
 * @author Minal
 *
 */
public class Interval {

	/**
	 * 
	 */
	private  int startTime;
	private  int endTime;
	
	public Interval() {
		// TODO Auto-generated constructor stub
		startTime=0;
		endTime=0;
	}
	public Interval(int s, int e){
		startTime=s;
		endTime=e;
	}
	
	public int getStartTime(){
		return startTime;
	}
	public int getEndTime(){
		return endTime;
	}
	
	public String toString(){
		return "["+startTime+","+endTime+"]";
	}

}
