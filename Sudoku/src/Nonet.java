import javax.swing.JPanel;
import javax.swing.JTextField;

public class Nonet extends JPanel  
{
	
	private static final long serialVersionUID = 1L;
	
	private Coordinates coor = new Coordinates();
	
	private JTextField A = new JTextField();
	private JTextField B = new JTextField();
	private JTextField C = new JTextField();
	private JTextField D = new JTextField();
	private JTextField E = new JTextField();
	private JTextField F = new JTextField();
	private JTextField G = new JTextField();
	private JTextField H = new JTextField();
	private JTextField I = new JTextField();
	

	int array1 [][] = new int[3][3];
	
		
	public Nonet(int num, int pos, int pos2)
	{
		array1[pos][pos2] = num;
	}
	

	public JTextField backer (int sel)
	{
		JTextField bacc = null;
		
		switch (sel)
		{
			case 0: bacc = this.A;
			break;
			
			case 1: bacc = this.B;
			break;
			
			case 2: bacc = this.C;
			break;
			
			case 3: bacc = this.D;
			break;
		
			case 4: bacc = this.E;
			break;
			
			case 5: bacc = this.F;
			break;
			
			case 6: bacc = this.G;
			break;
			
			case 7: bacc = this.H;
			break;
			
			case 8: bacc = this.I;
			break;
		}
		
		return bacc;
	}
	
	
	public void toArray()
	{
		array1[0][0] = Integer.parseInt(A.getText());
		array1[0][1] = Integer.parseInt(B.getText());
		array1[0][2] = Integer.parseInt(C.getText());
		array1[1][0] = Integer.parseInt(D.getText());
		array1[1][1] = Integer.parseInt(E.getText());
		array1[1][2] = Integer.parseInt(F.getText());
		array1[2][0] = Integer.parseInt(G.getText());
		array1[2][1] = Integer.parseInt(H.getText());
		array1[2][2] = Integer.parseInt(I.getText());
	}
	
	
	public boolean arrayCheck(int g)
	{
		boolean test = false;
		
		for (int i = 0; i < 3; i++)
		{
			for (int j = 0; j < 3; j++)
			{
				 if (array1[j][i] == g)
				 {
					 test = true;
					 coor.setX(j);
					 coor.setY(i);
				 }
			}
		}
		
		return test;
	}
	
	
	public Coordinates getCoordinates()
	{
		return coor;
	}
	
	public void setNum(int set)
	{
		array1[coor.getX()][coor.getY()] = set;
		toArray();
	}
}
