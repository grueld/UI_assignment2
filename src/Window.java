import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;


public 	class Window extends JFrame implements ActionListener {
	private static final long serialVersionUID = 1L;

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
		contentPane.setLayout(new BorderLayout()) ;
		contentPane.add(button, BorderLayout.CENTER) ;
		setContentPane(contentPane) ;
		//initComponents();
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {

		if (arg0.getSource() == button) {
			jop.showMessageDialog(getComponent(0), "HOLE");
		}
		
	}
}
