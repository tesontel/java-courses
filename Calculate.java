public class Calculate {

	public static void main (String[] arg) {
		System.out.println("Calculate...");
		Double first = Double.valueOf(arg[0]);
		Double second = Double.valueOf(arg[1]);
		Double summ = first + second;
		Double subtraction = first - second;
		Double multiplication = first * second;
		Double division = first / second;
		
		System.out.println("Sum..." +summ);
		System.out.println("Subtraction..." +subtraction);	
		System.out.println("Multiplication..." +multiplication);
		System.out.println("Division..." +division);
	
		
	
	}
}