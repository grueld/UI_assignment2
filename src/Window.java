import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;


public 	class Window extends JFrame implements ActionListener, ComponentListener {
	private static final long serialVersionUID = 1L;
	private final double RATIO = 16 / (double) 9;

	private JPanel contentPane;
	private JButton button ;
	private JOptionPane jop = new JOptionPane() ;

	public Window() {
		// window settings
		setTitle("allo") ;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		setSize(200, 200) ;              	         
		setLocation (200,200) ;
		setResizable(true) ;
		setVisible(true) ;

		button = new JButton("Ass") ;
		button.addActionListener(this) ;
		contentPane = new JPanel();
		contentPane.add(button);
		contentPane.setLayout(new LayoutMan()) ;
		addComponentListener(this);
		setContentPane(contentPane) ;
		//initComponents();
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {

		if (arg0.getSource() == button) {
			jop.showMessageDialog(getComponent(0), "HOLE");
		}
		
	}
	
	public void componentResized(ComponentEvent e) {
		Dimension compDim = e.getComponent().getSize();
		double x = compDim.width;  
	    double y = compDim.height;  
	    if (x / y < RATIO) {  
	      compDim.width = (int) (y * RATIO);  
	      compDim.height = (int) y;  
	    } else {  
	    	compDim.width = (int) x;  
	    	compDim.height = (int) (x / RATIO);  
	    }  
	    e.getComponent().setSize(compDim);
	  //  System.out.println(compDim);
	}

	@Override
	public void componentHidden(ComponentEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void componentMoved(ComponentEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void componentShown(ComponentEvent arg0) {
		// TODO Auto-generated method stub
		
	}
}
