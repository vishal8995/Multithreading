package test;

public class sumOfNaturalNosRecursion {

	public static void main(String[] args) {
		
		int n = 20;
		int sum = addNumbers(n);
		System.out.println("Sum : "+sum);

	}

	private static int addNumbers(int n) {
		
		if (n != 0)
			return n + addNumbers(n-1);
		else
			return n;
		
	}

}
