package GraphicsTestPackage;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Graphics;
import javax.swing.JPanel;
import java.awt.Color;

public class DrawPanel extends JPanel{
	private ImageIcon pirateIcon;
	private JLabel pirateLabel = new JLabel();
	
	public DrawPanel()                       // set up graphics window
	    {
	        setBackground(Color.WHITE);
	    }

	    public void paintComponent(Graphics graphicsPanel)  // draw graphics in the panel
	    {

	        
	    	super.paintComponent(graphicsPanel);            // call superclass to make panel display correctly

for(int i =0;i<20;i++){
	
}
	    	
	        // Drawing code goes here
	/*        
	        pirateIcon = new ImageIcon("Assets/jollyRodger.png");
	        pirateLabel.setIcon(pirateIcon);
	        add(pirateLabel);
*/
	    	graphicsPanel.setColor( Color.GREEN );
	        graphicsPanel.drawRect(10, 10, 200, 100); //draws a rectangle
	        graphicsPanel.setColor(Color.PINK);
	        graphicsPanel.fillRect(10, 10, 200, 100);
	        graphicsPanel.setColor( Color.BLUE );
	        graphicsPanel.drawString("Hello, World", 20, 50);  //draws hello world
	        graphicsPanel.setColor(Color.PINK);
	        graphicsPanel.fillRect(10, 10, 200, 100);
	        graphicsPanel.setColor( Color.BLACK );
	        graphicsPanel.drawString("Yohoho", 20, 50); //yohoho
	        
	        /*
	        revalidate();
	        repaint(); 
	  */
	    }

	    public static void main(String[] args)
	    {
	        DrawPanel panel = new DrawPanel();                            // window for drawing
	        JFrame application = new JFrame();       
	        
	        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   // set frame to exit
	                                                                      // when it is closed
	        application.add(panel);           
	        
	        application.setTitle("HelloWorldRectangle"); //Title of GUI window
	        application.setSize(900, 400);         // window is 500 pixels wide, 400 high
	        application.setVisible(true);          
	    }

}
