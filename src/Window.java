import java.awt.Container;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;
import java.io.File;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Window extends JFrame implements ActionListener, ComponentListener {
	private static final long serialVersionUID = 1L;

	private JPanel contentPane;

	private float RATIO = 16 / (float) 9;

	private JLabel label1, label2 ;
	private JTextField text ;
	private JList list ;

	private JButton button1, button2, button3, button4 ;
	private JButton button5, button6, button7 ;

	private JOptionPane jop = new JOptionPane();
	//private int previousX;
	//private int previousY;

	public Window() {
		// window settings
		setTitle("allo") ;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		setLocation (100,100) ;
		setSize(480, 270);
		setResizable(true) ;
		setVisible(true) ;
		
		//save the width and height of the window to use it in its listener
		//this.previousX = getWidth();
		//this.previousY = getHeight();

		contentPane = new JPanel();
		contentPane.setLayout(new LayoutMan());

		button1 = new JButton("Ass");
		button1.addActionListener(this);

		label1 = new JLabel("LABEL1");
		button2 = new JButton("Rotation");
		button2.addActionListener(this) ;
		text = new JTextField("TEXTFIELD");
		button3 = new JButton("BUTTON3");
		String[] listContents = { "Item1", "Item2" };
		list = new JList(listContents);
		button4 = new JButton("BUTTON4");
		button5 = new JButton("BUTTON5");
		button6 = new JButton("BUTTON6");
		button7 = new JButton("BUTTON7");
		label2 = new JLabel("LABEL2");
		
		Icon icon = new ImageIcon("icon/search.png");
		button3.setIcon(icon);
		
		contentPane.add(label1);
		contentPane.add(button1);
		contentPane.add(button2);
		contentPane.add(text);
		contentPane.add(button3);
		contentPane.add(list);
		contentPane.add(button4);
		contentPane.add(button5);
		contentPane.add(button6);
		contentPane.add(button7);
		contentPane.add(label2);
//		contentPane.addComponentListener(this);
		setContentPane(contentPane);
		pack();
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {

		if (arg0.getSource() == button1) {
			jop.showMessageDialog(getComponent(0), "HOLE");
		}
		if (arg0.getSource() == button2) {
			RATIO = 1/RATIO;
			setSize(getHeight(), getWidth()) ;
			System.out.println("on passe dans l'action du bouton rotation " + RATIO) ;
		}

	}

	public void componentResized(ComponentEvent e) {
////////////////////
//		System.out.println("on passe dans componentresized " + RATIO) ;
//		//Get the size of the window
//		Container window = e.getComponent().getParent().getParent().getParent();
//		//System.out.println(window.getClass());
//		Dimension compDim = window.getSize();
//		int x = compDim.width;  
//	    int y = compDim.height;
//	
//	    //set new width and height to keep the same ratio
//	    if (x / y < RATIO) {  
//	      compDim.width = (int) (y * RATIO);  
//	      compDim.height = (int) y;  
//	    } else {  
//	    	compDim.width = (int) x;  
//	    	compDim.height = (int) (x / RATIO);  
//	    }  
//////////////////////////	    
//	    double x_change = (double) x / this.previousX;
//	    double y_change = (double) y / this.previousY;
//	    
//	    System.out.println("The X has changed by: " + x_change);
//	    System.out.println("The Y has changed by: " + y_change);
//	    
//	    if (x_change == 1 && y_change != 1)
//	    {
//	    	System.out.println("Y has changed");
//	    	compDim.width = (int) (x * y_change);
//	    	//compDim.height = (int) y;
//	    	
//	    	//compDim.setSize(x * y_change, y);
//	    }else if (x_change != 1 && y_change == 1)
//	    {
//	    	System.out.println("X has changed");
//	    	//compDim.width = (int) x;
//	    	compDim.height = (int) (y * x_change);
//	
//	    	//compDim.setSize(x , y * x_change);
//	    }else if (x_change != 1 && y_change != 1)
//	    {
//	    	System.out.println("Both X and Y have changed");
//	    	compDim.width = (int) (x * y_change);
//	    	compDim.height = (int) (y * x_change);
//	    	//compDim.setSize(x * y_change, y * x_change);
//	    }else // (x_change == 1 && y_change == 1)
//	    {
//	    	System.out.println("No change at all");
//	    }	
//////////////////////// 
//		window.setSize(compDim);
//	    System.out.println(compDim);
	    //System.out.println("The new ratio is" + compDim.getWidth() / compDim.getHeight());
	    
	    //save the current width and height for the next call of this method
//	    this.previousX = x;
//	    this.previousY = y;
	}

	@Override
	public void componentHidden(ComponentEvent arg0) {}

	@Override
	public void componentMoved(ComponentEvent arg0) {}

	@Override
	public void componentShown(ComponentEvent arg0) {}
}
