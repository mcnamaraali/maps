import java.util.List;
import java.util.Map;
import java.util.Set;

public class FactoryMethods {

	public static void main(String[] args) {
		List<String> colourList = List.of("red","white", "white","pink", "green");
		System.out.printf("colourList %s%n%n", colourList);
		
		Set<String> colourSet = Set.of("red", "white", "pink");
		System.out.printf("colourSet %s%n%n", colourSet);
		
		Map<String, Integer> daysOfTheWeekMap = Map.of("Montag", 1, "Dienstag", 
				2, "Mittwoch", 3, "Donnerstag", 4, "Freitag", 5);
		System.out.printf("daysOfTheWeekMap %s%n%n", daysOfTheWeekMap);
		
		Map<String, Integer> daysPerMonth = Map.ofEntries(Map.entry("Jan", 31),
				Map.entry("Feb", 28),
				Map.entry("Mar", 31),
				Map.entry("Apr", 30),
				Map.entry("Mai", 31),
				Map.entry("June", 30),
				Map.entry("Juli", 31),
				Map.entry("Aug", 30),
				Map.entry("Sept", 30),
				Map.entry("Okt", 31),
				Map.entry("Nov", 30),
				Map.entry("Dez", 31)
				);
		
		System.out.printf("daysPerMonth %s%n%n", daysPerMonth);
		

	}

}
