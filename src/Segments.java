import java.util.ArrayList;
import java.util.Collections;

public class Segments {
	private int noSegments;
	private ArrayList<Integer> lenghts = new ArrayList<Integer>();
	private ArrayList<Boolean> areFinished = new ArrayList<Boolean>();
	
	public Segments(int noSegments, ArrayList<Integer> lenghts) {
		this.noSegments=noSegments;
		for (int i:lenghts)
		{
			this.lenghts.add(i);
		}
		Collections.sort(this.lenghts, Collections.reverseOrder());
	}
	
	public void show()
	{
		System.out.println("Number of segments: "+noSegments);
		System.out.println("The lenghts are: ");
		System.out.println(lenghts);
	}
	
	
}
