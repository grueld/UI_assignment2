import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import display.SecondWindow;


public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
			new Window() ;

	}

	public class Window extends JFrame implements ActionListener {
		private static final long serialVersionUID = 1L;
	
		private JPanel contentPane;
		private JButton add ;

		public Window() {
			
			// window settings
			setTitle("allo")title() ;
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
			setSize(200, 200) ;              	         
			setLocation (200,200) ;
			setResizable(false) ;
			setVisible(true) ;

			tools = new JToolBar() ;
			add = new JButton("Add") ;
			add.addActionListener(this) ;
			tools.add(add) ;
			contentPane = new JPanel();
			contentPane.setLayout(new GridLayout(0,4)) ;
			JPanel all = new JPanel() ;
			all.setLayout(new BorderLayout()) ;
			all.add(tools, BorderLayout.NORTH) ;
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
