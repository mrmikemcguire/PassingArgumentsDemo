import java.util.Scanner;

public class PassingArgumentsDemo
	{
	public static void main(String[] args)
		{
		double quarts = inputQuarts();
		double pints = convertToPints(quarts);
		double fluidOunces = convertToFluidOunces(pints);
		double milliliters = convertToMilliliters(fluidOunces);
		}
	
	private static double inputQuarts()
		{
		Scanner userInput = new Scanner(System.in);
		System.out.println("Please input the number of quarts you'd like to convert to milliliters.");
		return userInput.nextDouble();
		}
	
	private static double convertToPints(double numberOfQuarts)
		{
		double pints = numberOfQuarts * 2;
		System.out.println("That equals " + pints + " pints.");
		return pints;
		}
	
	private static double convertToFluidOunces(double numberOfPints)
		{
		double fluidOunces = numberOfPints * 16;
		System.out.println("That equals " + fluidOunces + " fluid ounces.");
		return fluidOunces; 
		}
	
	private static double convertToMilliliters(double numberOfFluidOunces)
		{
		double milliliters = numberOfFluidOunces * 29.5735;
		System.out.println("That equals " + milliliters + " milliliters.");
		return milliliters;
		}
	}