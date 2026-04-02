import java.io.File;
import java.io.FileNotFoundException;
import java.nio.ReadOnlyBufferException;
import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.InputMap;

public class Main {

	
	public static void validate(int val) throws CustomExceptions
	{
		if(val<=0)
		{
			throw new CustomExceptions("The value is below or equal to 0!");
		}
	}
	
	public static void main(String[] args) {
		Ducks ducks;
		Segments segments;
		
		File input = new File("natatie.in");
		try {
			int i;
			Scanner scanner = new Scanner(input);
			ArrayList<Integer> speeds = new ArrayList<Integer>();
			ArrayList<Integer> resistances = new ArrayList<Integer>();
			ArrayList<Integer> lenghts = new ArrayList<Integer>(); 
			
			int noDucks;
			int noSegments;
			int temp;
			
			noDucks=scanner.nextInt();
			validate(noDucks);
			noSegments=scanner.nextInt();
			validate(noSegments);
			
			for (i=0;i<noDucks;i++)
			{
				temp=scanner.nextInt();
				validate(temp);
				speeds.add(temp);
			}
			
			for (i=0;i<noDucks;i++)
			{
				temp=scanner.nextInt();
				validate(temp);
				resistances.add(temp);
			}
			
			for(i=0;i<noSegments;i++)
			{
				temp=scanner.nextInt();
				validate(temp);
				lenghts.add(temp);
			}
			
			ducks = new Ducks(noDucks, speeds, resistances);
			ducks.show();
			
			segments=new Segments(noSegments, lenghts);
			segments.show();
			
		} catch (FileNotFoundException e) {
			System.out.println("Fatal error: file not found");
		} catch (CustomExceptions e) {
			System.out.println(e.getMessage());
		}
	}

}
