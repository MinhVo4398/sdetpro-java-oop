package lab_02;

import java.util.Scanner;

public class Lab_2_1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Please input your weight(kg): ");
        double weight = scanner.nextDouble();
        System.out.print("Please input your height(m): ");
        double height = scanner.nextDouble();

        double bmi = weight / (height*2);

        System.out.printf("Your BMI is: %f", bmi);

    }
}
