package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamBasics{
	
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		Stream<Integer> s = Stream.of( new Integer[] {1,2,3,4,5,6,7,8,9,10});
		//s.forEach(p -> System.out.print(p));
		
		List<Integer> l = new ArrayList<>();
		
		for (int i=0; i<=10; i++)
			l.add(i);
		
		Stream<Integer> s2 = l.stream();
		//s2.forEach(p -> System.out.println(p));
		
		IntStream is = "12345_abcdefg".chars();
        //is.forEach(p -> System.out.println(p));
         
        Stream<String> s3 = Stream.of("A$B$C".split("\\$"));
        //s3.forEach(p -> System.out.println(p));
        
        Stream<Integer> s4 = l.stream();
        List<Integer> evenNumbersList = s4.filter(i -> i%2 == 0).map(i -> i * i).collect(Collectors.toList());
        System.out.println(evenNumbersList);
        
        l.stream().filter(i -> i%2 == 0).map(i -> i * i).forEach(System.out::println);
        
        //Stream<Integer> s5 = l.stream();
        //Integer[] evenNumbersArr = s5.filter(i -> i%2 == 0).toArray(Integer[]::new);
        //System.out.print(evenNumbersArr);
	}
}