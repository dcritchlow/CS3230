import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Toolkit;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.WindowConstants;


public class Arch extends JFrame
{
	private ImageIcon	image;
	
	public Arch()
	{
		setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);
		
		addWindowListener(new WindowAdapter()
		{ public void windowClosing(WindowEvent E)
			{ close(); }
		});

		Dimension	screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		// Get image from the web
		try 
		{
			URL url = new URL("http://www.nps.gov/arch/photosmultimedia/upload/arches3.jpg");
			image = new ImageIcon(url);
		} 
		catch (MalformedURLException murle) 
		{
			JOptionPane.showMessageDialog(this, "Bad URL: " + murle, "Image Error", JOptionPane.ERROR_MESSAGE);
		}
		
		add(new Display());

		pack();									// packed version

		setLocation((screenSize.width - getWidth()) / 2,				// centers frame
				(screenSize.height - getHeight()) / 2);

		setVisible(true);
	}
	
	private void close()
	{
		System.exit(0);
	}
	
	class Display extends JPanel
	{
		public Display()
		{
			setPreferredSize(new Dimension(image.getIconWidth()+50, image.getIconHeight() + 75));			// with caption
		}
		
		public void paintComponent(Graphics g)
		{
			super.paintComponent(g);
			g.setColor(Color.BLUE);
			g.fillRect(0, 0, 425, 335);

			g.drawImage(image.getImage(), 25, 25, this);
			String	caption = "Delicate Arch";

			Font	f = g.getFont().deriveFont(19F);				// big font
			g.setFont(f);								// install new font

			FontMetrics	fm = g.getFontMetrics();
			int		wid = fm.stringWidth(caption);

			g.setColor(Color.RED);						// change font color
			g.drawString(caption, (getWidth() - wid) / 2, getHeight() - 6);
		}
	}
	
	public static void main(String[] args) 
	{
		new Arch();
	}
}
