package week3;

public class ArrayandMethod {

	public static void main(String[] args) {
		// Prompt number 1
		int[] ages = {3, 9, 23, 64, 2, 8, 28, 93};
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
		System.out.println("\nTest:");
		
		System.out.println(repeatWordNTimes("hi", 4));
		
		System.out.println(makeFullName("John", "Doe"));
		
		System.out.println(isGreaterThan100(ages));
		System.out.println(isGreaterThan100(nameLengths));
		
		double[] dages = new double[9];
		dages[0] = 3;
		dages[1] = 9;
		dages[2] = 23;
		dages[3] = 64;
		dages[4] = 2;
		dages[5] = 8;
		dages[6] = 28;
		dages[7] = 93;
		dages[8] = 26;
		//System.out.printf("%.2f", findAverage(dages));
		System.out.println(findAverage(dages));
		
		double[] ddages = new double[9];
		ddages[0] = 3;
		ddages[1] = 9;
		ddages[2] = 23;
		ddages[3] = 64;
		ddages[4] = 2;
		ddages[5] = 8;
		ddages[6] = 28;
		ddages[7] = 93;
		ddages[8] = 30;
		System.out.println(isFirstArrayGreater(dages, ddages));
		
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
	 * It calculates the tip and returns total amount to pay (Bill + Tip
	 */
	public static double billPlusTip(double bill, int tipPercentage)
	{
		double tipAmount = bill * (tipPercentage / 100);
		System.out.println("Your tip amount is: " + tipAmount + 
				" which makes your total bill: " + bill + tipAmount);
		return bill + tipAmount;
	}

}
