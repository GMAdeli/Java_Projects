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
		if(noDucks>0)
		{
		this.noDucks=noDucks;
		}
		else
		{
			countError(noDucks);
		}
		this.speeds=speeds;
		this.resistances=resistances;
	}
	
	void show()
	{
		if(valid)
		{
			int i;
			System.out.println("Number of ducks: "+noDucks);
			System.out.println("Speeds: ");
			for(int speed:speeds)
			{
				System.out.print(speed+ " ");
			}
			System.out.println();
			System.out.println("Resistances: ");
			for(int resistance:resistances)
			{
				System.out.print(resistance+ " ");
			}
		}
	}
	
	private void countError(int noDucks)
	{
		System.out.println("The number of ducks you introduced is: "+noDucks+"\nWhich is an invalid value, no value will be passed to the current ducks");
		valid=false;
	}
}
