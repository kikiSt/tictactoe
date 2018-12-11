package sideproject;

import java.util.Scanner;

public class Play {

	public static void main(String[] args) {

		System.out.println("Tic Tac Toe against a AI with an incomplete rule set");
		System.out.println();

		String marker1 = "x";
		String marker2 = "o";
		boolean playAgain = true;

		Scanner scan = new Scanner(System.in);

		Human human = new Human();
		Computer computer = new Computer();

		while (playAgain) {
			Set Setup = new Set();

			Setup.createBoard();
			Setup.printBoard();

			System.out.println("please choose your marker");
			System.out.println("type 1 for 'x' or 2 for 'o'");

			if (scan.nextInt() == 1) {
				human.setMarker("x");
				computer.setMarker("o");
			} else {
				human.setMarker("o");
				computer.setMarker("x");

			}

			int first = (int) (Math.random() * 2);

			boolean won = false;
			int turns = 0;

			if (first == 0) {
				System.out.println("It's your turn");
				System.out.println();
				while (!won) {
					human.takeTurn(Setup.getBoard());
					turns++;
					Setup.printBoard();
					if (Setup.hasWon(Setup.getBoard())) {
						won = true;
						System.out.println("Congratulation, you won!");
					}
					if (turns == 9) {
						won = true;
						System.out.println("Its a draw!");
						break;
					}
					if (!won) {
						computer.takeTurn(Setup.getBoard(), human);
						turns++;
						System.out.println();
						Setup.printBoard();
						System.out.println();
						if (Setup.hasWon(Setup.getBoard())) {
							won = true;
							System.out.println("You lost!");
						}
						if (turns == 9) {
							won = true;
							System.out.println("Its a draw!");
							break;
						}
					}

				}
			} else {

				System.out.println("Computer goes first!");
				System.out.println();
				while (!won) {
					computer.takeTurn(Setup.getBoard(), human);
					turns++;
					Setup.printBoard();
					if (Setup.hasWon(Setup.getBoard())) {
						won = true;
						System.out.println("You lost");
					}
					if (turns == 9) {
						won = true;
						System.out.println("Its a draw!");
						break;
					}
					if (!won) {
						human.takeTurn(Setup.getBoard());
						turns++;
						System.out.println();
						Setup.printBoard();
						System.out.println();
						if (Setup.hasWon(Setup.getBoard())) {
							won = true;
							System.out.println("You won!");
						}
						if (turns == 9) {
							won = true;
							System.out.println("Its a draw!");
							break;
						}
					}

				}

			}

			System.out.println("Would you like to play again? Type 1 for yes or 2 to quit");
			System.out.println();
			if (scan.nextInt() == 2) {
				playAgain = false;
			}

		}

	}
}
