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
import javax.swing.WindowConstants;

public class GUIDemo extends JFrame
{

	private Image	image;
	
	public GUIDemo()
	{
		setTitle("GUI Demo");
//		setSize(600, 400);
		
		setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);
		addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent e)
			{
//				System.exit(0);
				close();
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
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		setLocation((screenSize.width - getWidth()) / 2 , (screenSize.height - getHeight()) / 2);
		
		setVisible(true);
	}
	
	private void close()
	{
		if (JOptionPane.showConfirmDialog(this, "Exit Program?", "Confirm Exit", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION)
			System.exit(0);
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
