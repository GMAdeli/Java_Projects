import java.util.ArrayList;

public class Ducks {
	int noDucks;
	ArrayList<Integer> speeds = new ArrayList<Integer>();
	
	ArrayList<Integer> resistances = new ArrayList<Integer>();
	public Ducks(int noDucks, ArrayList<Integer> speeds, ArrayList<Integer> resistances) {
		
		if(noDucks>0 && noDucks<999)
		{
		this.noDucks = noDucks;
		}
		
		this.speeds=speeds;
		this.resistances=resistances;
	}
	
	
}
