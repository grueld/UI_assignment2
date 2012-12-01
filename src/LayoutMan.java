import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.LayoutManager;
import java.awt.LayoutManager2;

public class LayoutMan implements LayoutManager{

	@Override
	public void layoutContainer(Container parent) {
		System.out.println("on rentre dans layoutContainer");
		Window w = (Window) parent.getParent().getParent().getParent() ;
		int wX = w.getWidth() ;
		int wY = w.getHeight() ;
		float ratio = wX/(float)wY ;

		System.out.println("le ratio dans layoutman: " + ratio) ;
		System.out.println("win layoutMan l h: " + wX + " " + wY) ;
		
//		if (ratio == 16/(float)9) {
			int margin = 10 ;
			Component[] c = parent.getComponents();

			c[0].setBounds(margin, margin, wX/6, wY/11) ;  // label1
			c[1].setBounds(wX - (margin + 30 + 2*wX/8), margin, wX/8, wY/11) ;         // button1
			c[2].setBounds(wX - (margin + wX/8), margin, wX/8, wY/11) ;              // button2

			c[3].setBounds(margin, c[0].getY() + c[0].getHeight() + 5, wX - 2*margin - 25, wY/11) ;   // text
			c[4].setBounds(wX - (margin + 20), c[3].getY(), 20, c[3].getHeight()) ;     // button3

			c[5].setBounds(margin + (int)(wX/3.69), c[3].getY() + c[3].getHeight() + 20 , (int)(wX/2.4), (int)(wY/3.86)) ;   // list

			int l = (wX - 2*margin - 3*20)/4 ;
			int y = c[5].getY() + c[5].getHeight() + 20 ;
			c[6].setBounds(margin, y, l, (int)(wY/5.4)) ;     // button4
			c[7].setBounds(margin + l + 20 , y, l, (int)(wY/5.4)) ;   // button5
			c[8].setBounds(margin + 2*l + 40, y, l, (int)(wY/5.4)) ;     // button6
			c[9].setBounds(margin + 3*l + 60, y, l, (int)(wY/5.4)) ;   // button7
			c[10].setBounds(margin, c[6].getY() + c[6].getHeight() + 10, wX - 2*margin, wY/11) ;  // label2

//			System.out.println("wX: " + wX);
//			System.out.println("wY: " + wY);		

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
//		}
//		else if (ratio == 9/(float)16) {
//			System.out.println("format 9/16 bien reconnu") ;
//		}
			System.out.println("on sort de layoutContainer") ;
	}

	@Override
	public Dimension minimumLayoutSize(Container parent) {
		return new Dimension(480,270);
	}

	@Override
	public Dimension preferredLayoutSize(Container parent) {
		return new Dimension(480, 270);
	}

	@Override
	public void removeLayoutComponent(Component comp) {}

	@Override
	public void addLayoutComponent(String name, Component comp) {}
}
