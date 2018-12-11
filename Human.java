package sideproject;

import java.util.Scanner;

public class Human extends Player {
	public Human() {

	}

	public void takeTurn(String[][] board) {

		Scanner scan = new Scanner(System.in);

		boolean turn = true;

		while (turn) {
			System.out.println("please enter your desired row");
			int row = scan.nextInt();
			System.out.println("please enter your desired column");
			int col = scan.nextInt();
			System.out.print("you entered " + row + " " + col);
			System.out.println();
			if (board[row - 1][col - 1] != "x" && board[row - 1][col - 1] != "o") {
				board[row - 1][col - 1] = Marker;
				turn = false;
			}
			else {
				System.out.println("There is already a marker! please try another field");
			}
		} 
	} 

}
