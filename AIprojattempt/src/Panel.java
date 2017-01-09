import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

public class Panel extends JPanel
{
	private static final long serialVersionUID = 1L;
	
	int shift_down = 0;
	
	Inter H = new Inter(); 
	JButton button = new JButton("numAddition");
	
	public void paintComponent(Graphics g)
	{
				setLayout(null);
		
				// ROW 1
				g.setColor(Color.LIGHT_GRAY);
				g.fillRect(0, 0+shift_down, 90, 90);
				g.setColor(Color.white);
				g.fillRect(91, 0+shift_down, 90, 90);
				g.setColor(Color.LIGHT_GRAY);
				g.fillRect(181, 0+shift_down, 90, 90);
				g.setColor(Color.white);
				g.fillRect(271, 0+shift_down, 90, 90);
				g.setColor(Color.LIGHT_GRAY);
				g.fillRect(361, 0+shift_down, 90, 90);
				g.setColor(Color.white);
				g.fillRect(451, 0+shift_down, 90, 90);
				g.setColor(Color.LIGHT_GRAY);
				g.fillRect(541, 0+shift_down, 90, 90);
				g.setColor(Color.white);
				g.fillRect(631, 0+shift_down, 90, 90);
				g.setColor(Color.LIGHT_GRAY);
				g.fillRect(721, 0+shift_down, 90, 90);
				
				// ROW 2
				g.setColor(Color.white);
				g.fillRect(0, 90+shift_down, 90, 90);
				g.setColor(Color.LIGHT_GRAY);
				g.fillRect(91, 90+shift_down, 90, 90);
				g.setColor(Color.white);
				g.fillRect(181, 90+shift_down, 90, 90);
				g.setColor(Color.LIGHT_GRAY);
				g.fillRect(271, 90+shift_down, 90, 90);
				g.setColor(Color.white);
				g.fillRect(361, 90+shift_down, 90, 90);
				g.setColor(Color.LIGHT_GRAY);
				g.fillRect(451, 90+shift_down, 90, 90);
				g.setColor(Color.white);
				g.fillRect(541, 90+shift_down, 90, 90);
				g.setColor(Color.LIGHT_GRAY);
				g.fillRect(631, 90+shift_down, 90, 90);
				g.setColor(Color.white);
				g.fillRect(721, 90+shift_down, 90, 90);
				
				// ROW 3
				g.setColor(Color.LIGHT_GRAY);
				g.fillRect(0, 180+shift_down, 90, 90);
				g.setColor(Color.white);
				g.fillRect(91, 180+shift_down, 90, 90);
				g.setColor(Color.LIGHT_GRAY);
				g.fillRect(181, 180+shift_down, 90, 90);
				g.setColor(Color.white);
				g.fillRect(271, 180+shift_down, 90, 90);
				g.setColor(Color.LIGHT_GRAY);
				g.fillRect(361, 180+shift_down, 90, 90);
				g.setColor(Color.white);
				g.fillRect(451, 180+shift_down, 90, 90);
				g.setColor(Color.LIGHT_GRAY);
				g.fillRect(541, 180+shift_down, 90, 90);
				g.setColor(Color.white);
				g.fillRect(631, 180+shift_down, 90, 90);
				g.setColor(Color.LIGHT_GRAY);
				g.fillRect(721, 180+shift_down, 90, 90);
				
				// ROW 4
				g.setColor(Color.white);
				g.fillRect(0, 270+shift_down, 90, 90);
				g.setColor(Color.LIGHT_GRAY);
				g.fillRect(91, 270+shift_down, 90, 90);
				g.setColor(Color.white);
				g.fillRect(181, 270+shift_down, 90, 90);
				g.setColor(Color.LIGHT_GRAY);
				g.fillRect(271, 270+shift_down, 90, 90);
				g.setColor(Color.white);
				g.fillRect(361, 270+shift_down, 90, 90);
				g.setColor(Color.LIGHT_GRAY);
				g.fillRect(451, 270+shift_down, 90, 90);
				g.setColor(Color.white);
				g.fillRect(541, 270+shift_down, 90, 90);
				g.setColor(Color.LIGHT_GRAY);
				g.fillRect(631, 270+shift_down, 90, 90);
				g.setColor(Color.white);
				g.fillRect(721, 270+shift_down, 90, 90);
				
				
				//ROW 5
				g.setColor(Color.LIGHT_GRAY);
				g.fillRect(0, 360+shift_down, 90, 90);
				g.setColor(Color.white);
				g.fillRect(91, 360+shift_down, 90, 90);
				g.setColor(Color.LIGHT_GRAY);
				g.fillRect(181, 360+shift_down, 90, 90);
				g.setColor(Color.white);
				g.fillRect(271, 360+shift_down, 90, 90);
				g.setColor(Color.LIGHT_GRAY);
				g.fillRect(361, 360+shift_down, 90, 90);
				g.setColor(Color.white);
				g.fillRect(451, 360+shift_down, 90, 90);
				g.setColor(Color.LIGHT_GRAY);
				g.fillRect(541, 360+shift_down, 90, 90);
				g.setColor(Color.white);
				g.fillRect(631, 360+shift_down, 90, 90);
				g.setColor(Color.LIGHT_GRAY);
				g.fillRect(721, 360+shift_down, 90, 90);
				
				// ROW 6
				g.setColor(Color.white);
				g.fillRect(0, 450+shift_down, 90, 90);
				g.setColor(Color.LIGHT_GRAY);
				g.fillRect(91, 450+shift_down, 90, 90);
				g.setColor(Color.white);
				g.fillRect(181, 450+shift_down, 90, 90);
				g.setColor(Color.LIGHT_GRAY);
				g.fillRect(271, 450+shift_down, 90, 90);
				g.setColor(Color.white);
				g.fillRect(361, 450+shift_down, 90, 90);
				g.setColor(Color.LIGHT_GRAY);
				g.fillRect(451, 450+shift_down, 90, 90);
				g.setColor(Color.white);
				g.fillRect(541, 450+shift_down, 90, 90);
				g.setColor(Color.LIGHT_GRAY);
				g.fillRect(631, 450+shift_down, 90, 90);
				g.setColor(Color.white);
				g.fillRect(721, 450+shift_down, 90, 90);
				
				// ROW 7
				g.setColor(Color.LIGHT_GRAY);
				g.fillRect(0, 540+shift_down, 90, 90);
				g.setColor(Color.white);
				g.fillRect(91, 540+shift_down, 90, 90);
				g.setColor(Color.LIGHT_GRAY);
				g.fillRect(181, 540+shift_down, 90, 90);
				g.setColor(Color.white);
				g.fillRect(271, 540+shift_down, 90, 90);
				g.setColor(Color.LIGHT_GRAY);
				g.fillRect(361, 540+shift_down, 90, 90);
				g.setColor(Color.white);
				g.fillRect(451, 540+shift_down, 90, 90);
				g.setColor(Color.LIGHT_GRAY);
				g.fillRect(541, 540+shift_down, 90, 90);
				g.setColor(Color.white);
				g.fillRect(631, 540+shift_down, 90, 90);
				g.setColor(Color.LIGHT_GRAY);
				g.fillRect(721, 540+shift_down, 90, 90);
				
				// ROW 8
				g.setColor(Color.white);
				g.fillRect(0, 630+shift_down, 90, 90);
				g.setColor(Color.LIGHT_GRAY);
				g.fillRect(91, 630+shift_down, 90, 90);
				g.setColor(Color.white);
				g.fillRect(181, 630+shift_down, 90, 90);
				g.setColor(Color.LIGHT_GRAY);
				g.fillRect(271, 630+shift_down, 90, 90);
				g.setColor(Color.white);
				g.fillRect(361, 630+shift_down, 90, 90);
				g.setColor(Color.LIGHT_GRAY);
				g.fillRect(451, 630+shift_down, 90, 90);
				g.setColor(Color.white);
				g.fillRect(541, 630+shift_down, 90, 90);
				g.setColor(Color.LIGHT_GRAY);
				g.fillRect(631, 630+shift_down, 90, 90);
				g.setColor(Color.white);
				g.fillRect(721, 630+shift_down, 90, 90);
				
				// ROW 9
				g.setColor(Color.LIGHT_GRAY);
				g.fillRect(0, 720+shift_down, 90, 90);
				g.setColor(Color.white);
				g.fillRect(91, 720+shift_down, 90, 90);
				g.setColor(Color.LIGHT_GRAY);
				g.fillRect(181, 720+shift_down, 90, 90);
				g.setColor(Color.white);
				g.fillRect(271, 720+shift_down, 90, 90);
				g.setColor(Color.LIGHT_GRAY);
				g.fillRect(361, 720+shift_down, 90, 90);
				g.setColor(Color.white);
				g.fillRect(451, 720+shift_down, 90, 90);
				g.setColor(Color.LIGHT_GRAY);
				g.fillRect(541, 720+shift_down, 90, 90);
				g.setColor(Color.white);
				g.fillRect(631, 720+shift_down, 90, 90);
				g.setColor(Color.LIGHT_GRAY);
				g.fillRect(721, 720+shift_down, 90, 90);
				
				
				add(H.non[0][0].backer(0));
				add(H.non[0][0].backer(1));
				add(H.non[0][0].backer(2));
				add(H.non[0][0].backer(3));
				add(H.non[0][0].backer(4));
				add(H.non[0][0].backer(5));
				add(H.non[0][0].backer(6));
				add(H.non[0][0].backer(7));
				add(H.non[0][0].backer(8));
				
				
				add(H.non[1][0].backer(0));
				add(H.non[1][0].backer(1));
				add(H.non[1][0].backer(2));
				add(H.non[1][0].backer(3));
				add(H.non[1][0].backer(4));
				add(H.non[1][0].backer(5));
				add(H.non[1][0].backer(6));
				add(H.non[1][0].backer(7));
				add(H.non[1][0].backer(8));
				
				add(H.non[2][0].backer(0));
				add(H.non[2][0].backer(1));
				add(H.non[2][0].backer(2));
				add(H.non[2][0].backer(3));
				add(H.non[2][0].backer(4));
				add(H.non[2][0].backer(5));
				add(H.non[2][0].backer(6));
				add(H.non[2][0].backer(7));
				add(H.non[2][0].backer(8));
				
				add(H.non[0][1].backer(0));
				add(H.non[0][1].backer(1));
				add(H.non[0][1].backer(2));
				add(H.non[0][1].backer(3));
				add(H.non[0][1].backer(4));
				add(H.non[0][1].backer(5));
				add(H.non[0][1].backer(6));
				add(H.non[0][1].backer(7));
				add(H.non[0][1].backer(8));
				
				add(H.non[1][1].backer(0));
				add(H.non[1][1].backer(1));
				add(H.non[1][1].backer(2));
				add(H.non[1][1].backer(3));
				add(H.non[1][1].backer(4));
				add(H.non[1][1].backer(5));
				add(H.non[1][1].backer(6));
				add(H.non[1][1].backer(7));
				add(H.non[1][1].backer(8));
				
				add(H.non[2][1].backer(0));
				add(H.non[2][1].backer(1));
				add(H.non[2][1].backer(2));
				add(H.non[2][1].backer(3));
				add(H.non[2][1].backer(4));
				add(H.non[2][1].backer(5));
				add(H.non[2][1].backer(6));
				add(H.non[2][1].backer(7));
				add(H.non[2][1].backer(8));
				
				add(H.non[0][2].backer(0));
				add(H.non[0][2].backer(1));
				add(H.non[0][2].backer(2));
				add(H.non[0][2].backer(3));
				add(H.non[0][2].backer(4));
				add(H.non[0][2].backer(5));
				add(H.non[0][2].backer(6));
				add(H.non[0][2].backer(7));
				add(H.non[0][2].backer(8));
				
				add(H.non[1][2].backer(0));
				add(H.non[1][2].backer(1));
				add(H.non[1][2].backer(2));
				add(H.non[1][2].backer(3));
				add(H.non[1][2].backer(4));
				add(H.non[1][2].backer(5));
				add(H.non[1][2].backer(6));
				add(H.non[1][2].backer(7));
				add(H.non[1][2].backer(8));
				
				add(H.non[2][2].backer(0));
				add(H.non[2][2].backer(1));
				add(H.non[2][2].backer(2));
				add(H.non[2][2].backer(3));
				add(H.non[2][2].backer(4));
				add(H.non[2][2].backer(5));
				add(H.non[2][2].backer(6));
				add(H.non[2][2].backer(7));
				add(H.non[2][2].backer(8));
				
				button.setSize(100, 50);
				button.setLocation(100, 900);
				add(button);
				
				button.addActionListener(new ActionListener()
				{
					@Override
					public void actionPerformed(ActionEvent arg0) {
						H.testRun();
						
					}
					
				});
		}
	
}