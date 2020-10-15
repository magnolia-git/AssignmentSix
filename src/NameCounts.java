import acm.program.ConsoleProgram;
import java.util.HashMap;

public class NameCounts extends ConsoleProgram {
	
	private static HashMap<String, Integer> countNames = new HashMap<String, Integer>();
	
	public void run() {
		
		/*
		 * Will run while it's true. Entering no name and hitting return will break out
		 * of the while loop. If the value of the String is null, then that means it
		 * doesn't already exist in the HashMap. When added, it is given a value of 1.
		 * If the name IS in the HashMap and doesn't equal null, then it gets the value
		 * and adds 1 to it.
		 */
		
		while(true) {
			String name = readLine("Enter name: ");
			if (name.equals("")) break;
			
			if (countNames.get(name) == null) {
				countNames.put(name, 1);
			} else {
				countNames.put(name, countNames.get(name) + 1);
			}
		}
		for(String i : countNames.keySet()) {
			println("Entry [" + i + "] has count " + countNames.get(i));
		}
	}
	
}