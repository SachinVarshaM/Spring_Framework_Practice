import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Collection_ArrayList {

	public static void main(String[] args) {
		 ArrayList<Integer> list=new ArrayList<Integer>();
		 list.add(10);
		 list.add(20);
		 list.add(30);
		 list.add(50);
		 list.add(40);
		 
		List<Integer> l2= list.stream().map(n->n*2).sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		System.out.println(l2);
		l2=list.stream().filter(s->s!=10).limit(5).skip(3).toList();
		System.out.println(l2);
		
		
		

	}

}
