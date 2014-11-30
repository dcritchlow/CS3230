import	java.awt.*;
import	java.awt.event.*;

import	javax.swing.*;


	public class GUI extends JFrame
	{
		private	JPanel	direction = new JPanel();


		public GUI()
		{
			setTitle("Menu Demo");
			setSize(600, 400);
			setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);

			addWindowListener(new WindowAdapter()
					{ public void windowClosing(WindowEvent e)
						{ exit(); }
					});

			add(direction);
			direction.setLayout(new BorderLayout());
			JButton button1 = new JButton();
			button1.setText("North");
			button1.setSize(10, 10);
			
			button1.addMouseListener(new MouseListener() {
				
				@Override
				public void mouseReleased(MouseEvent e) {
					// TODO Auto-generated method stub
					
				}
				
				@Override
				public void mousePressed(MouseEvent e) {
					north();
					
				}
				
				@Override
				public void mouseExited(MouseEvent e) {
					// TODO Auto-generated method stub
					
				}
				
				@Override
				public void mouseEntered(MouseEvent e) {
					// TODO Auto-generated method stub
					
				}
				
				@Override
				public void mouseClicked(MouseEvent e) {
					// TODO Auto-generated method stub
					
				}
			});
			
			direction.add(button1, BorderLayout.NORTH);
			
			JButton button2 = new JButton();
            button2.setText("South");
            
            button2.addMouseListener(new MouseListener() {
                
                @Override
                public void mouseReleased(MouseEvent e) {
                    // TODO Auto-generated method stub
                    
                }
                
                @Override
                public void mousePressed(MouseEvent e) {
                    south();
                    
                }
                
                @Override
                public void mouseExited(MouseEvent e) {
                    // TODO Auto-generated method stub
                    
                }
                
                @Override
                public void mouseEntered(MouseEvent e) {
                    // TODO Auto-generated method stub
                    
                }
                
                @Override
                public void mouseClicked(MouseEvent e) {
                    // TODO Auto-generated method stub
                    
                }
            });
            
            direction.add(button2, BorderLayout.SOUTH);
            
            JButton button3 = new JButton();
            button3.setText("East");
            
            button3.addMouseListener(new MouseListener() {
                
                @Override
                public void mouseReleased(MouseEvent e) {
                    // TODO Auto-generated method stub
                    
                }
                
                @Override
                public void mousePressed(MouseEvent e) {
                    east();
                    
                }
                
                @Override
                public void mouseExited(MouseEvent e) {
                    // TODO Auto-generated method stub
                    
                }
                
                @Override
                public void mouseEntered(MouseEvent e) {
                    // TODO Auto-generated method stub
                    
                }
                
                @Override
                public void mouseClicked(MouseEvent e) {
                    // TODO Auto-generated method stub
                    
                }
            });
            
            direction.add(button3, BorderLayout.EAST);
            
            JButton button4 = new JButton();
            button4.setText("West");
            
            button4.addMouseListener(new MouseListener() {
                
                @Override
                public void mouseReleased(MouseEvent e) {
                    // TODO Auto-generated method stub
                    
                }
                
                @Override
                public void mousePressed(MouseEvent e) {
                    west();
                    
                }
                
                @Override
                public void mouseExited(MouseEvent e) {
                    // TODO Auto-generated method stub
                    
                }
                
                @Override
                public void mouseEntered(MouseEvent e) {
                    // TODO Auto-generated method stub
                    
                }
                
                @Override
                public void mouseClicked(MouseEvent e) {
                    // TODO Auto-generated method stub
                    
                }
            });
            
            direction.add(button4, BorderLayout.WEST);
			
			makeMenu();

			setVisible(true);
		}


		public void exit()
		{
				System.exit(0);
		}

		public void north()
		{
			JOptionPane.showMessageDialog(direction, "North");
		}
		public void south()
		{
			JOptionPane.showMessageDialog(direction, "South");
		}
		public void east()
		{
			JOptionPane.showMessageDialog(direction, "East");
		}
		public void west()
		{
			JOptionPane.showMessageDialog(direction, "West");
		}


		


		private void makeMenu()
		{
			JMenuBar	menuBar = new JMenuBar();
			setJMenuBar(menuBar);

			JMenu	directionMenu = new JMenu("Directions");
			directionMenu.setMnemonic('D');
			menuBar.add(directionMenu);

			JMenuItem	north = new JMenuItem("North", 'N');
			north.setToolTipText("North");
			directionMenu.add(north);
			north.addActionListener(new ActionListener()
					{ public void actionPerformed(ActionEvent e)
						{ north(); }
					});
			
			JMenuItem   south = new JMenuItem("South", 'S');
	            south.setToolTipText("North");
	            directionMenu.add(south);
	            south.addActionListener(new ActionListener()
	                    { public void actionPerformed(ActionEvent e)
	                        { south(); }
	                    });
	            
			
			JMenuItem   east = new JMenuItem("East", 'E');
            east.setToolTipText("North");
            directionMenu.add(east);
            east.addActionListener(new ActionListener()
                    { public void actionPerformed(ActionEvent e)
                        { east(); }
                    });
            
           
            JMenuItem   west = new JMenuItem("West", 'W');
            west.setToolTipText("North");
            directionMenu.add(west);
            west.addActionListener(new ActionListener()
                    { public void actionPerformed(ActionEvent e)
                        { west(); }
                    });
			
		}


		public static void main(String[] args)
		{
			new GUI();
		}
	
}
