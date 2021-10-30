package main;

import java.util.Scanner;

import model.Board;

public class Main {
	Board board = new Board();
	Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		Main m = new Main();
		
	}
	
	
	
	public Main() {
		mainMenu();
	}
	
	public void mainMenu() {
		
		System.out.println("Enter the number of rows and columns, with the following paramater : rows columns");
		String dimension = sc.nextLine();
		String [] dimensionParts = dimension.split(" ");
		
		int totalDimension = Integer.parseInt(dimensionParts[0])*Integer.parseInt(dimensionParts[1]);
		board.createBoard(totalDimension);
		int rows = Integer.parseInt(dimensionParts[0]);
		int columns = Integer.parseInt(dimensionParts[1]);
		board.printBoard(rows, columns);

		
		
	}
}
