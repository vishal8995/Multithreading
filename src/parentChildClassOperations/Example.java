package parentChildClassOperations;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;
import java.util.stream.Collectors;

public class Example{
	
	public static void main(String[] args) {
		
		List<Integer> list= Arrays.asList(1, 2, 3, 4, 4, 5, 5, 6 ,7 , 7, 8 , 9, 10, 10);
		
		List<Integer> l = list.stream().filter(i -> Collections.frequency(list, i) > 1).collect(Collectors.toList());
		
		ListIterator<Integer> itr = l.listIterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
	}
}