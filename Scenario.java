import java.util.ArrayList;
import java.io.IOException;
import java.util.Scanner;
import java.io.File;

/**
 * This class represents the scenario driving the program
 * This is the most complicate class and you need to think carefully
 * to represent the process model of the restaurant here
 * @author hanisaf
 *
 */
public class Scenario {
	int minTime = 0; 
	int maxTime = 300; 
	Desk desk = new Desk();
	Queue queue = new Queue();
	// what other attributes are needed?
	ArrayList<Integer>waitTimes = new ArrayList<Integer>();
	ArrayList<Integer>durations = new ArrayList<Integer>();
	ArrayList<Integer>arrTimes = new ArrayList<Integer>();
	
	/**
	 * Constructor of the class, takes the csv file to read from
	 * @param scenarioFile
	 */
	public Scenario(String scenarioFile) throws IOException {	
      //start here
		Scanner scanner = new Scanner (new File(scenarioFile));
		arrTimes = new ArrayList<Integer>();
		durations = new ArrayList<Integer>();
		waitTimes = new ArrayList<Integer>();
		
		while (scanner.hasNextLine()) {
			String line = scanner.nextLine();
			String[] fields = line.split(",");
			
			arrTimes.add(Integer.parseInt(fields[0]));
			durations.add(Integer.parseInt(fields[1]));
		}
			
		

	}
	
	/**
	 * runs the simulation
	 */
	public void run() {
      //start here 

	}

	/**
	 * Rounds a number to three decimal point digits
	 * @param value
	 * @return rounded value
	 * NO NEED TO CHANGE THIS METHOD
	 */
	public static double round(double value) {
		return  Math.round(  1000.0 * value) / 1000.0;
	}
}
