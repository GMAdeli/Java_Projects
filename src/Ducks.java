import java.security.PrivateKey;
import java.util.ArrayList;

public class Ducks {
	private int noDucks;
	private ArrayList<Integer> speeds = new ArrayList<Integer>();
	private ArrayList<Integer> resistances = new ArrayList<Integer>();
	private boolean valid=true;
	
	public Ducks()
	{
		
	}
	
	public Ducks(int noDucks, ArrayList<Integer> speeds, ArrayList<Integer> resistances) 
	{	
		this.noDucks=noDucks;
		for (int i:speeds)
		{
			this.speeds.add(i);
		}
		for(int i:resistances)
		{
			this.resistances.add(i);
		}
	}
	
	void show()
	{
		if(valid)
		{
			int i;
			System.out.println("Number of ducks: "+noDucks);
			System.out.println("Speeds: ");
			System.out.println(speeds);
			System.out.println("Resistances: ");
			System.out.println(resistances);
		}
	}
}
