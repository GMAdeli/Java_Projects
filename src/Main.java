import java.io.File;
import java.io.FileNotFoundException;
import java.nio.ReadOnlyBufferException;
import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.InputMap;

public class Main {

	public static void main(String[] args) {
		File input = new File("natatie.in");
		try {
			Scanner scanner = new Scanner(input);
			ArrayList<Integer> speeds = new ArrayList<Integer>();
			ArrayList<Integer> resistances = new ArrayList<Integer>();
			int noDucks;
			int segments;
			
			noDucks=scanner.nextInt();
			segments=scanner.nextInt();
			
		} catch (FileNotFoundException e) {
			
			System.out.println("Fatal error: file not found");
		}
	}

}
