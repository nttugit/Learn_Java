package src;

import java.util.Scanner;
import java.text.NumberFormat;
import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Random;

public class TaiXiu {

	public static boolean checkSicBoResult(int diceResult, int userPickedOption) {
		boolean userResult = false;
		if (diceResult == 3 || diceResult == 18) {
			userResult = false;
		} else if ((diceResult >= 4 && diceResult <= 10) && userPickedOption == 2)
			userResult = false;
		else if ((diceResult >= 11 && diceResult <= 17) && userPickedOption == 1)
			userResult = false;
		else
			userResult = true; 

		return userResult;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Locale lc = new Locale("en","US");
		NumberFormat numFormat = NumberFormat.getCurrencyInstance(lc);
		double userBalance = 5000;
		int userOption = 1;

		while (true) {
			System.out.println("-------- WELCOME TO FB88 ---------");
			System.out.print("Press (1) to play sic bo game, (0) to quit: ");
			userOption = scanner.nextInt();

			if (userOption == 1) {
				System.out.println("*** SIC BO GAME ****");
				System.out.println("+ Your balance: " + numFormat.format(userBalance));
				double userBet = 0;
				int userPickedOption = 0;
				String userPickedOptionStr;

				// User enter bet money
				do {

					System.out.print("*** Enter your bet : ");
					userBet = scanner.nextDouble();

					System.out.println("+ Your bet: " + numFormat.format(userBet));
				} while (userBet <= 0 || userBet > userBalance);

				// Use choose SIC or BO
				do {
					System.out.print("*** Press (1) to pick SIC, (2) to pick BO: ");
					userPickedOption = scanner.nextInt();
					userPickedOptionStr = userPickedOption == 1 ? "SIC" : "BO";
					System.out.println("+ You bet " + numFormat.format(userBet) + " on " + userPickedOptionStr);
				} while (userPickedOption != 1 && userPickedOption != 2);

				Random dice1 = new Random();
				Random dice2 = new Random();
				Random dice3 = new Random();
				int dice1Result = dice1.nextInt(1, 7);
				int dice2Result = dice2.nextInt(1, 7);
				int dice3Result = dice3.nextInt(1, 7);
				int diceResult = dice1Result + dice2Result + dice3Result;

				System.out.println(
						"DICE RESULT: (" + dice1Result + "," + dice2Result + "," + dice3Result + "): " + diceResult);

				boolean userResult = checkSicBoResult(diceResult, userPickedOption);

				if (userResult)
					userBalance += userBet;
				else
					userBalance -= userBet;

				String finalResult = (userResult ? "You WIN" : "You LOSE") + ", your balance: " + numFormat.format(userBalance);
				System.out.println(finalResult);

			} else if (userOption == 0) {
				System.out.println("-------- THANK YOU FROM FB88 ---------");
				break;
			} else {
				break;
			}
		}

	}
}
