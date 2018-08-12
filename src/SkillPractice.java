import java.util.Random;

import javax.swing.JOptionPane;

public class SkillPractice {
	public static void main(String[] args) {

		SkillPractice skills = new SkillPractice();
		skills.skill1();
		skills.skill2();
		skills.skill3();
		skills.skill4();
		skills.skill5();
	}

	void skill1() {
		// Use pop-ups for the following.
		// Ask the user how many dimes they have
		String dimes = JOptionPane.showInputDialog("How many dimes do you have?");

		// Tell them how many cents they have (hint multiply by 10)
		int dimes1 = Integer.parseInt(dimes);
		JOptionPane.showMessageDialog(null, "You have " + (dimes1 * 10) + " cents.");

		// Ask the user how tall they are (inches)
		String inches = JOptionPane.showInputDialog(null, "How tall are you?");

		// If they are shorter than 36 inches, tell them to eat their Wheaties
		int inches1 = Integer.parseInt(inches);
		if (inches1 < 36) {
			JOptionPane.showMessageDialog(null, "You should eat your wheaties(whatever dose things r)");
		} else {
			JOptionPane.showMessageDialog(null,
					"You probably should cut down on those wheaties. Yeah thats right I saw your pantry. and yeah, thats right I know here you live, and yeah thats right I see when you sleep, and yeah....      whoops I went off on a rant.)");
		}

	}

	void skill2() { // Write a loop to print every third number between 1 and 30 to the console

		for (int i = 1; i < 11; i++) {
			System.out.println(i * 3);
		}

	}

	void skill3() { // Get a random number that is less than 20 and print it to the console
		Random num = new Random();
		int twenty = num.nextInt(21);
		System.out.println("A random number that is less than 20 is "+twenty);
		// Get another random number that is less than 10 and print it to the console
		int ten = num.nextInt(11);
		System.out.println("A random number that is less than 20 is "+ten);
		// Using a pop-up, tell the user the difference between the numbers // Hint: use
		// subtraction
		JOptionPane.showMessageDialog(null, twenty + "-" + ten + "=" + (twenty - ten));
	}

	void skill4() { // In a pop-up, ask the user for the city they live in
		String city = JOptionPane.showInputDialog("What city do you live in?");
		// If they answered "San Diego", tell them they live in America's Finest City
		if (city.equalsIgnoreCase("San Diego") || city.equalsIgnoreCase("SD")) {
			JOptionPane.showMessageDialog(null, "You  live in America's finest city.");
		}
		// Otherwise, tell them to move to San Diego
		else {
			JOptionPane.showMessageDialog(null, "Move to San Diego!");
		}
		// Create a variable - cars - and initialize it to the number of cars your
		// family has. // If there are 0 cars, use a pop-up to display, "I bet you use
		// public transportation."

		// If there is 1 car, use a pop-up to display the make/model of the car

		// If there is more than 1 car, use a pop-up to display how many wheels the //
		// cars have between them.

	}

	void skill5() { // In a pop-up, ask the user for the name of their school

		// In another pop-up, tell the user, that their school is a fantastic school. //
		// You must include the name of the school in the message.

	}
}
