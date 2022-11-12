import java.util.Scanner;
public class Factorial {

	public static int Compute(int num) {
		int product = 1;
		while (num > 0) {
			product = product * num;
			num--;		
		}
		return product;
	}
	
	public static void main(String[] args) {
		int num;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number:");
		num = input.nextInt();
		System.out.println("The factorial of " + num + " is " + Compute(num));

	}

}
