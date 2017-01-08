import javax.swing.JFrame;
//import javax.swing.JScrollPane;


public class Frame extends JFrame 
{

	private static final long serialVersionUID = 1L;


	public static void main(String[] args) 
	{
		new Frame();
	}
		
	Frame()
	{
		Panel pan = new Panel();
		//Inter i = new Inter();
		add(pan);
		/*JScrollPane pane = new JScrollPane(pan, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		pane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		pane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);*/
		//add(pane);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		setSize(1000, 1000);
	}

}
