package edu.school.problems;

public class DominoTable {
	private DominoTile[] dominoTable;
	private final int TILES = 28;
	private int tilesIndex = 0;
	
	public DominoTable() {
		dominoTable = new DominoTile[TILES];
	}
	
	public boolean addLeft(DominoTile tile) {
		boolean successfulAdd = false;
		//algorithm here - if applicable, add it to the beginning of the array and tilesIndex++
		return(successfulAdd);
	}
	
	public boolean addRight(DominoTile tile) {
		boolean successfulAdd = false;
		//algorithm here - if applicable, add it to the end of the current elements of the array
		//(tilesIndex) and tilexIndex++
		return(successfulAdd);
	}
	
	public void print() {
		for(int i = 0; i < TILES; i++) {
			if(dominoTable[i] == null)
				break;
			System.out.print(dominoTable[i].toString());
		}
	}
}
