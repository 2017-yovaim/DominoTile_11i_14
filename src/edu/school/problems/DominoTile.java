package edu.school.problems;

public class DominoTile {
	private int firstSquare;
	private int secondSquare;

	public DominoTile() {
		this.firstSquare = 0;
		this.secondSquare = 0;
	}

	public DominoTile(int fs, int ss) {
		if (fs >= 0 && fs <= 6)
			this.firstSquare = fs;
		if (ss >= 0 && ss <= 6)
			this.secondSquare = ss;
	}

	public void setFirstSquare(int fs) {
		if (fs >= 0 && fs <= 6)
			this.firstSquare = fs;
	}

	public void setSecondSquare(int ss) {
		if (ss >= 0 && ss <= 6)
			this.secondSquare = ss;
	}

	public int getFirstSquare() {
		return this.firstSquare;
	}

	public int getSecondSquare() {
		return this.secondSquare;
	}

	public void swapSquares() {
			int temp;
			temp = this.secondSquare;
			this.secondSquare = this.firstSquare;
			this.firstSquare = temp;
		
	}

	public boolean equals(DominoTile tileToCompare) {
		if (this.getFirstSquare() == tileToCompare.getFirstSquare()
				&& this.getSecondSquare() == tileToCompare.getSecondSquare()) {
			return true;
		}
		if (this.getFirstSquare() == tileToCompare.getSecondSquare()
				&& this.getSecondSquare() == tileToCompare.getFirstSquare()) {
			return true;
		}
		return false;
	}

	/*public String toString() {
		final int ROWS = 3;
		final int COLS = 6;
		char[][] tile = new char[ROWS][COLS];
		for (int i = 0; i < ROWS; i++) {
			for (int j = 0; j < COLS; j++) {
				
			}
		}
	}
	*/
}
