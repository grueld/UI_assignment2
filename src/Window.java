import java.awt.Container;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;

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

	public Window() {
		// window settings
		setTitle("allo");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocation(100, 100);
		setResizable(true);
		setSize(480, 270);
		setVisible(true);

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
		contentPane.addComponentListener(this);
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
		Container window = e.getComponent().getParent().getParent().getParent();
		Dimension compDim = window.getSize();
		double x = compDim.width;
		double y = compDim.height;
		if (x / y < RATIO) {
			compDim.width = (int) (y * RATIO);
			compDim.height = (int) y;
		} else {
			compDim.width = (int) x;
			compDim.height = (int) (x / RATIO);
		}
		window.setSize(compDim);
		System.out.println(compDim);
		System.out.println("on passe dans componentresized " + RATIO) ;
	}

	@Override
	public void componentHidden(ComponentEvent arg0) {}

	@Override
	public void componentMoved(ComponentEvent arg0) {}

	@Override
	public void componentShown(ComponentEvent arg0) {}
}
