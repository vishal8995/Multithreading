package employeeObjectOperations;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class StreamNthHighestSalary {
	
	public static void main(String[] args) {
	
		List<Employee> list = new ArrayList<Employee>();
		list.add(new Employee(1, "V", 21, 10000));
		list.add(new Employee(1, "K", 22, 20000));
		list.add(new Employee(1, "S", 23, 50000));
		list.add(new Employee(1, "Vi", 24, 40000));
		
		
		Optional<Double> salary = list.stream().map(i -> i.getSalary()).sorted(Comparator.reverseOrder()).skip(1).findFirst();
		
		System.out.println(salary.get());
		
 	}

}
