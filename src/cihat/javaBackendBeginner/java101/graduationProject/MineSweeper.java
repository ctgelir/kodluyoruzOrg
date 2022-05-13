package cihat.javaBackendBeginner.java101.graduationProject;

import java.util.Random;

/**@author Cihat Gelir*/
public class MineSweeper {
	private String[][] field;
	private int row;
	private int column;
	private boolean isLost;
	
	
	public MineSweeper(int row, int column) {
		this.row = row;
		this.column = column;
		this.field = new String[row][column];
		fillField();
		isLost = false;
	}
	
	public boolean isLost() {	return isLost;}
	
	public void displayFieldEnd() {
		for(int row = 0; row < this.row; row++) {
			for(int column = 0; column < this.column; column++) {
				System.out.print(field[row][column] + " ");
			}
			System.out.println();
		}
	}
	
	public void displayFieldCensored() {
		for(int row = 0; row < this.row; row++) {
			for(int column = 0; column < this.column; column++) {
				if(field[row][column].equals("*"))
					System.out.print("- ");
				else {
					System.out.print(field[row][column] + " ");
				}
			}
			System.out.println();
		}
	}
	
	public void hit(int row, int column) {
		int value = 0;
		if(isMine(row,column)) {
			System.out.println("Game over: ");
			isLost = true;
			displayFieldEnd();
			return;
		}
		if(isMine(row-1,column-1))	value++;
		if(isMine(row-1,column+1))	value++;
		if(isMine(row+1,column-1))	value++;
		if(isMine(row+1,column+1))	value++;
		if(isMine(row,column-1))	value++;
		if(isMine(row,column+1))	value++;
		if(isMine(row-1,column))	value++;
		if(isMine(row+1,column))	value++;
		
		field[row][column] = Integer.toString(value);
		if(isWon()) {
			System.out.println("Congrats, you won!");
			displayFieldEnd();
			return;
		} else {
			displayFieldCensored();
		}
		
	}
	
	public boolean isWon() {
		for(int row = 0; row < this.row; row++) {
			for(int column = 0; column < this.column; column++) {
				if(field[row][column].equals("-"))
					return false;
			}
		}
		return true;
	}
	
	public boolean isValidCell(int row, int column) {
		if(row < 0 || row >= this.row || column < 0 || column >= this.column) {
			return false;
		}
		return true;
	}
	
	private boolean isMine(int row, int column) {
		if(!isValidCell(row,column)) return false;
		return field[row][column].equals("*") ? true: false;
	}
	
	private void fillField() {
		for(int row = 0; row < this.row; row++) {
			for(int column = 0; column < this.column; column++) {
				field[row][column] = "-";
			}
		}
		int numberOfMine = (row*column)/4;
		for(int i = 0; i < numberOfMine; i++) {
			Random rand = new Random();
			field[rand.nextInt(row)][rand.nextInt(column)] = "*";
		}
	}
}
