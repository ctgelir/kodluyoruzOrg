package cihat.javaBackendBeginner.java101.arrays;

/**@author Cihat Gelir*/
public class LetterFromStarExercise {
	
	public static void main(String[] args) {
		String[][] letter = new String[7][4];
		for (int row = 0; row < letter.length; row++) {
			for (int column = 0; column < letter[row].length; column++) {
				if (row == 1 || row == 2 || row == 4 || row == 5) {
					if(column == 1 || column == 2) {
						letter[row][column] = "  ";
					}else {
						letter[row][column] = "* ";
					}
					
				} else {
					letter[row][column] = "* ";
				}
			}
		}
		
		for (String[] row : letter){
            for (String col : row){
                System.out.print(col);
            }
            System.out.println();
        }
	}
}
