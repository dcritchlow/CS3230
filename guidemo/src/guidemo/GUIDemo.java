package guidemo;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.Toolkit;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.net.*;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class GUIDemo extends JFrame
{

	private Image	image;
	
	public GUIDemo()
	{
		setTitle("GUI Demo");
//		setSize(600, 400);
		
		addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent e)
			{
				System.exit(0);
			}
		});
		
		try 
		{
			URL url = new URL("http://www.nps.gov/arch/photosmultimedia/upload/arches11.jpg");
			image = Toolkit.getDefaultToolkit().getImage(url);
		} 
		catch (MalformedURLException murle) 
		{
			JOptionPane.showMessageDialog(this, "Bad URL: " + murle, "Image Error", JOptionPane.ERROR_MESSAGE);
		}
		
		MediaTracker tracker = new MediaTracker(this);
		tracker.addImage(image, 0);
		
		try 
		{
			tracker.waitForAll(); //main thread waits until image is loaded
		} 
		catch (InterruptedException ie) 
		{
			JOptionPane.showMessageDialog(this, "Unable to load image", "Image Error", JOptionPane.ERROR_MESSAGE);
		}
		
		add(new Display());
		
		pack();
		
		setVisible(true);
	}
	
	class Display extends JPanel
	{
		
		public Display()
		{
			setPreferredSize(new Dimension(image.getWidth(this),image.getHeight(this)));
		}
		
		public void paintComponent(Graphics g)
		{
			super.paintComponent(g);
			g.drawImage(image, 0, 0, this);
		}
	}
	
	public static void main(String[] args) 
	{
		new GUIDemo();
	}

}
