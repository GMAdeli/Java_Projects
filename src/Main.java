import java.io.File;
import java.io.FileNotFoundException;
import java.nio.ReadOnlyBufferException;
import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.InputMap;

public class Main {

	public static void main(String[] args) {
		Ducks duckTest = new Ducks();
		File input = new File("natatie.in");
		try {
			int i;
			Scanner scanner = new Scanner(input);
			ArrayList<Integer> speeds = new ArrayList<Integer>();
			ArrayList<Integer> resistances = new ArrayList<Integer>();
			int noDucks;
			int segments;
			
			noDucks=scanner.nextInt();
			segments=scanner.nextInt();
			
			for (i=0;i<noDucks;i++)
			{
				speeds.add(scanner.nextInt());
			}
			
			for (i=0;i<noDucks;i++)
			{
				resistances.add(scanner.nextInt());
			}
			
			duckTest = new Ducks(noDucks, speeds, resistances);
			
			duckTest.show();
			
		} catch (FileNotFoundException e) {
			
			System.out.println("Fatal error: file not found");
		}
	}

}
