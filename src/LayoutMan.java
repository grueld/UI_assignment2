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
		Component[] components = parent.getComponents();
		Dimension d;
		int height = 1;
		int width = 1;
		for(Component c: components)
		{
			d = c.getPreferredSize();
			height += 25;
			width += 25;
			c.setBounds(height, width, d.width, d.height);
		}
	}

	@Override
	public Dimension minimumLayoutSize(Container parent) {
		// TODO Auto-generated method stub
		return new Dimension(300,300);
	}

	@Override
	public Dimension preferredLayoutSize(Container parent) {
		// TODO Auto-generated method stub
		return new Dimension(300, 300);
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
