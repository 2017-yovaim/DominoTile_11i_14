package edu.school.problems;

import java.awt.Graphics;

import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class DominoTableView extends JComponent
{
	private DominoTable table = new DominoTable();
	
	public DominoTableView()
	{
		table.addTableEventListener(new TableEventListener() {

			@Override
			public void onTableChanged(DominoTable table) {
				// TODO Auto-generated method stub
				DominoTableView.this.repaint();
			}
			
		});
	}
	
	@Override
	public void paintComponent(Graphics g)
	{
		
		
		return;
	}
	

}
