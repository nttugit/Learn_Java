package stack;

import java.util.Scanner;
import java.util.Stack;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

//		Example 1: Reverse string
//		System.out.println("Input a string: ");
//		String inputStr = scanner.nextLine();
//		Stack<String> stringStack = new Stack<String>();
//
//		for (int i = 0; i < inputStr.length(); i++) {
////			System.out.println(inputStr.substring(i, i + 1));
////			stringStack.push(inputStr.substring(i, i + 1));
//			stringStack.push(inputStr.charAt(i) + "");
//		}
//
//		for (int i = 0; i < inputStr.length(); i++) {
//			String character = stringStack.pop();
//			System.out.print(character);
//
//		}

//		System.out.println(stringStack);

		// Example 2: Convert Decimal -> Binary
		System.out.print("Enter a number: ");
		int decimalNum = scanner.nextInt();
		Stack<Integer> binaryStack = new Stack<Integer>();
//		String binaryStr = "";
//		while (decimalNum > 0) {
//			int mod = decimalNum % 2;
//			decimalNum /= 2;
//			binaryStr = mod + binaryStr;
////			System.out.println(decimalNum + "," + mod);
//		}
//		System.out.println("Binary: " + binaryStr);

		while (decimalNum > 0) {
			int mod = decimalNum % 2;
			binaryStack.push(mod);
			decimalNum /= 2;
		}
		// 0 0 0 1
		// pop: 1 -> 0 0 0
		// pop: 0 -> 0 0

		System.out.print("Binary: ");
		while (binaryStack.size() > 0) {
			System.out.print(binaryStack.pop());
		}

	}
}
