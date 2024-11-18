package basicAlgorithms;

import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {

		Double bmi, height, weight;

		Scanner scan = new Scanner(System.in);

		System.out.println("Input your height: ");

		height = scan.nextDouble();

		if (height <= 0 || height > 2.20) {

			System.out.println("Invalid height, try again!");
		}

		else {
			
			System.out.println("Input your weight: ");

			weight = scan.nextDouble();

			if (weight <= 0 || weight >= 300) {
				System.out.println("Invalid weight, try again!");
			}

			else {

				scan.close();

				bmi = weight / (height * height);

				System.out.println("Body Mass Index = " + bmi);

			}

		}

	}

}
