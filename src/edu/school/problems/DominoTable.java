package edu.school.problems;

public class DominoTable {
	private DominoTile[] dominoTable;
	private final int TILES = 28;
	private int tilesIndex = 0;
	final static int LEFT = 0;
	final static int RIGHT = 1;

	public DominoTable() {
		dominoTable = new DominoTile[TILES];
	}

	public boolean addLeft(DominoTile tile) {
		if (tilesIndex == TILES - 1) {
			return false;
		} else if (tile.isApplicable(dominoTable[0], LEFT) == true) {
			for (int i = tilesIndex; i > 0; i--) {
				dominoTable[i] = dominoTable[i - 1];
			}
			dominoTable[0] = tile;
			tilesIndex++;
			return true;
		} else {
			return false;
		}
		// algorithm here - if applicable, add it to the beginning of the array and
		// tilesIndex++

	}

	public boolean addRight(DominoTile tile) {
		if (tilesIndex == TILES - 1) {
			return (false);
		} else if (tile.isApplicable(dominoTable[tilesIndex], RIGHT) == true) {
			dominoTable[tilesIndex + 1] = tile;
			tilesIndex++;
			return true;
		} else {
			return false;
		}
		// algorithm here - if applicable, add it to the end of the current elements of
		// the array
		// (tilesIndex) and tilexIndex++
	}

	public void print() {
		for (int i = 0; i < TILES; i++) {
			if (dominoTable[i] == null)
				break;
			System.out.print(dominoTable[i].toString());
		}
	}
}
