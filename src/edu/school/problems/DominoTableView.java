package edu.school.problems;

import java.awt.Graphics;

import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class DominoTableView extends JComponent
{
	private DominoTable table = new DominoTable();
	
	@Override
	public void paintComponent(Graphics g)
	{
		JFrame window = new JFrame();
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setBounds(0, 0, 1500, 800);
		window.setVisible(true);
		window.setLayout(null);
		DominoTile[] table1 = this.table.getDominoTable();
		for(int i = 0; i < table1.length && table1[i] != null; i++)
		{
			paintTile(window, table1[i]);
		}
		
		return;
	}
	
	public void paintTile(JFrame w, DominoTile t)
	{
		JPanel tile = new JPanel();
		
	}

}
