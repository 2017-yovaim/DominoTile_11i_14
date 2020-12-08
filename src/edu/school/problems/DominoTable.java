package edu.school.problems;

public class DominoTable implements TableEventListener{
	private DominoTile[] dominoTable;
	private int tilesIndex = 0;
	private TableEventListener listener;
	private final int TILES = 28;
	final static int LEFT = 0;
	final static int RIGHT = 1;

	public DominoTable() {
		dominoTable = new DominoTile[TILES];
	}
	
	public DominoTile[] getDominoTable()
	{
		return this.dominoTable;
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
			if(this.listener != null)
			{
				this.listener.onTableChanged(this);
			}
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
			if(this.listener != null) {
				this.listener.onTableChanged(this);
			}
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
	
	public void addTableEventListener(TableEventListener listener)
	{
		this.listener = listener;
	}

	@Override
	public void onTableChanged(DominoTable table) {
		// TODO Auto-generated method stub
		//not sure what is supposed to happen here
	}
}
