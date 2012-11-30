import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.LayoutManager;
import java.awt.LayoutManager2;


public class LayoutMan implements LayoutManager{

	@Override
	public void layoutContainer(Container parent) {
		// TODO Auto-generated method stub
		//System.out.println(parent.getComponentCount());
		int wX = parent.getParent().getParent().getParent().getWidth() ;
		int wY = parent.getParent().getParent().getParent().getHeight() ;
		int margin = 10 ;
		Component[] c = parent.getComponents();
		
		c[0].setBounds(margin, margin, wX/6, wY/11) ;  // label1
		c[1].setBounds(wX - (margin + 30 + 2*wX/8), margin, wX/8, wY/11) ;         // button1
		c[2].setBounds(wX - (margin + wX/8), margin, wX/8, wY/11) ;              // button2
		
		c[3].setBounds(margin, margin + wY/11 + 20, wX - 2*margin - 25, wY/11) ;   // text
		c[4].setBounds(wX - (margin + 20), margin + wY/11 + 20, 20, wY/11) ;     // button3

		c[5].setBounds(margin + (int)(wX/3.69), margin + wY/11 + 20 + wY/11 + 25 , (int)(wX/2.4), (int)(wY/3.86)) ;   // list

		int l = (wX - 2*margin - 3*20)/4 ;
		int y = margin + wY/11 + 20 + wY/11 + 25 + (int)(wY/3.86) + 25 ;
		c[6].setBounds(margin, y, l, (int)(wY/5.4)) ;     // button4
		c[7].setBounds(margin + l + 20 , y, l, (int)(wY/5.4)) ;   // button5
		c[8].setBounds(margin + 2*l + 40, y, l, (int)(wY/5.4)) ;     // button6
		c[9].setBounds(margin + 3*l + 60, y, l, (int)(wY/5.4)) ;   // button7
//		c[10].setBounds(margin, 20, wX/10, 100) ;  // label2
		System.out.println("wX: " + wX);
		System.out.println("wY: " + wY);		
		System.out.println("wY/11: " + wY/11);
		
//		Dimension d;
//		int height = 1;
//		int width = 1;
//		for(Component c: components)
//		{
//			d = c.getPreferredSize();
//			height += 25;
//			width += 25;
//			c.setBounds(height, width, d.width, d.height);
//		}
	}

	@Override
	public Dimension minimumLayoutSize(Container parent) {
		// TODO Auto-generated method stub
		return new Dimension(480,270);
	}

	@Override
	public Dimension preferredLayoutSize(Container parent) {
		// TODO Auto-generated method stub
		return new Dimension(480, 270);
	}

	@Override
	public void removeLayoutComponent(Component comp) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void addLayoutComponent(String name, Component comp) {
		// TODO Auto-generated method stub
		
	}

}
