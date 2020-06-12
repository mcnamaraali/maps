import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class WordTypeCount {

	public static void main(String[] args) {
		Map<String, Integer> myStringIntMap = new HashMap<>();

		createMap(myStringIntMap);
		displayMap(myStringIntMap);

	}

	private static void createMap(Map<String, Integer> myStringIntMap) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a String");
		String input = scan.nextLine();

		String[] tokens = input.split(" ");

		for(String token: tokens) {
			String word = token.toLowerCase();


			if(myStringIntMap.containsKey(word)) {
				int count = myStringIntMap.get(word);
				myStringIntMap.put(word, count+1);
			}
			else {
				myStringIntMap.put(word, 1);
			}
		}

	}

	private static void displayMap(Map<String, Integer> myStringIntMap) {
		Set<String> keys = myStringIntMap.keySet();

		TreeSet<String> sortedKey = new TreeSet<>(keys);

		System.out.printf("%nMap contains: %nKey\t\tValue%n");

		for(String key: sortedKey) {
			System.out.printf("%-10s%10s%n", key,myStringIntMap.get(key) );

		}

		System.out.printf("%nsize: %d%nisEmpty: %b%n", myStringIntMap.size(), myStringIntMap.isEmpty());

	}

}
