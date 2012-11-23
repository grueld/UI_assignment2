import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


public 	class Window extends JFrame implements ActionListener {
	private static final long serialVersionUID = 1L;

	private JPanel contentPane;
	private JButton add ;

	public Window() {

		// window settings
		setTitle("allo") ;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		setSize(200, 200) ;              	         
		setLocation (200,200) ;
		setResizable(false) ;
		setVisible(true) ;

		add = new JButton("Add") ;
		add.addActionListener(this) ;
		contentPane = new JPanel();
		contentPane.setLayout(new GridLayout(0,4)) ;
		contentPane.add(add) ;
		JPanel all = new JPanel() ;
		all.setLayout(new BorderLayout()) ;
		all.add(contentPane, BorderLayout.CENTER) ;
		setContentPane(all) ;
		//initComponents();
		pack();
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub

	}
}
