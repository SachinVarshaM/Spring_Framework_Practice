import java.util.Hashtable;
import java.util.Map;
import java.util.stream.Collectors;

public class Collection_Hashtable {

	public static void main(String[] args) {
		 Hashtable<Integer, Integer> htable=new Hashtable<Integer, Integer>();
		 htable.put(1, 20);
		 htable.put(2, 10);
		 htable.put(3, 30);
		 htable.put(4, 40);
		 htable.put(5, 60);
		 htable.put(6,50);
		 
		 Hashtable<Integer, Integer> squaredTable = htable.entrySet().stream()
		            .map(e -> Map.entry(e.getKey(), e.getValue() * e.getValue())) // transform entry
		            .collect(Collectors.toMap(
		                Map.Entry::getKey,
		                Map.Entry::getValue,
		                (a, b) -> a,
		                Hashtable::new
		            ));

		        System.out.println(squaredTable);

	}

}
