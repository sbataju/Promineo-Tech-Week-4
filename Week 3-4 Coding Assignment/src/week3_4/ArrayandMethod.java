package week3_4;

public class ArrayandMethod {

	public static void main(String[] args) {
		// Prompt number 1
		int[] ages = {3, 9, 23, 64, 2, 8, 28, 93, 26};
		//New age:
		//ages[8] = 26;
		
		//Subtracting first element from last element
		int result = ages[ages.length - 1] - ages[0];
		System.out.println("Last element - First element: " + result);
		
		//Calculating average age
		double total = 0.0;
		
		for (int i = 0; i < ages.length; i++)
		{
			total += ages[i];
		}
		
		double average = total / ages.length;
		System.out.println("Average age: " + average);
		//System.out.println(ages.length);
		
		//Prompt number 2
		String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
		
		double totalLetters = 0.0;
		for (int i = 0; i < names.length; i++)
		{
			totalLetters += names[i].length();
		}
		double averageLetters = totalLetters / names.length;
		System.out.println("Average number of letters per name: " + averageLetters);
		
		/*
		 * Prompt number 3:
		 * To access last element of an array we can use:
		 * array[array.length - 1]
		 */
		
		/*
		 * Prompt number 4:
		 * To access first element of any array we can use:
		 * array[0];
		 */
		
		//Prompt number 5:
		
		int[] nameLengths = new int[names.length];
		for (int i = 0; i < nameLengths.length; i++)
		{
			nameLengths[i] = names[i].length();
		}
		
		//Prompt number 6:
		
		int sumOfNameLengths = 0;
		for (int individualLength : nameLengths)
		{
			sumOfNameLengths += individualLength;
		}
		System.out.println("Sum of all elements: " + sumOfNameLengths);
		
		
		//Test Methods:
		System.out.println("\nTesting Methods:");
		//Prompt 7
		System.out.println("Prompt 7: " + repeatWordNTimes("hi", 4));
		
		//Prompt 8
		System.out.println("Prompt 8: " + makeFullName("John", "Doe"));
		
		//Prompt 9
		System.out.println("Prompt 9: " + isGreaterThan100(ages));
		System.out.println("Prompt 9: " + isGreaterThan100(nameLengths));
		
		//Prompt 10
		double[] ages1 = {3, 9, 23, 64, 2, 8, 28, 93};
		//System.out.printf("%.2f", findAverage(dages));
		System.out.println("Prompt 10: " + findAverage(ages1));
		
		//Prompt 11
		double[] ages2 = {30, 9, 23, 64, 2, 8, 28, 93}; //Larger array
		System.out.println("Prompt 11: " + isFirstArrayGreater(ages1, ages2));
		System.out.println("Prompt 11: " + isFirstArrayGreater(ages2, ages1));
		
		//Prompt 12
		boolean isHotOutside = true;
		double moneyInPocket = 11.50;
		System.out.println("Prompt 12: " + willBuyDrink(isHotOutside, moneyInPocket));
		
		//Prompt 13
		double bill = 100.0;
		int tipPercentage = 20;
		System.out.println("Prompt 13: Your total amount is: " + billPlusTip(bill, tipPercentage));
		
	}
	
	//Prompt 7:
	public static String repeatWordNTimes (String word, int n)
	{
		String result = "";
		for (int i = 0; i < n; i++)
		{
			result += word;
		}
		return result;
	}
	
	//Prompt 8:
	public static String makeFullName (String firstName, String lastName)
	{
		return firstName + " " + lastName;
	}
	
	//Prompt 9:
	public static boolean isGreaterThan100 (int[] numbers)
	{
		int sum = 0;
		for(int number : numbers)
		{
			sum += number;
		}
		if (sum > 100)
			return true;
		else
			return false;
	}
	
	//Prompt 10:
	public static double findAverage (double[] numbers)
	{
		double sum = 0.0;
		for (double number : numbers)
		{
			sum += number;
		}
		return sum / numbers.length;
	}
	
	//Prompt 11:
	public static boolean isFirstArrayGreater (double[] a, double[] b)
	{
		//Using findAverage method in Prompt 10 to find the averages of the two arrays:
		double averageA = findAverage(a);
		double averageB = findAverage(b);
		if (averageA > averageB) 
		{
			return true;
		}
		else 
		{
			return false;
		}
			
	}
	
	//Prompt 12:
	public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket)
	{
		if (isHotOutside == true && moneyInPocket > 10.50)
			return true;
		else
			return false;
	}
	
	/*
	 * Prompt 13:
	 * This method takes the bill amount and the tip percentage as arguments.
	 * It calculates the tip and returns total amount to pay (Bill + Tip)
	 */
	public static double billPlusTip(double bill, int tipPercentage)
	{
		double tipAmount = bill * (tipPercentage / 100.0);
		return bill + tipAmount;
	}

}
