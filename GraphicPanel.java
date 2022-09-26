/*importing all necesarry package for display*/
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Panel;
/*turns out that java.awt.Frame only doesn't work,
so we have to add another specific package to run
this class*/

public class GraphicPanel extends Panel{
    public GraphicPanel() {
        setBackground(Color.black); 
        /*setting the background color to black*/
    }
    
    @Override
    public void paint(Graphics g) {
        /*all settings for the text that will be displayed*/
        g.setColor(new Color(0,255,0));
        g.setFont(new Font("Helvetica", Font.PLAIN, 16));
        g.drawString("Hello GUI World!", 30, 100);
        g.setColor(new Color(1.0f, 0, 0));
        g.fillRect(30, 100, 150, 10);
    }
    
    public static void main(String[] args) {
        Frame f = new Frame("Testing Graphics Panel");
        /*this line will appears at window*/
        
        /*all settings below is for the window itself*/
        GraphicPanel gp = new GraphicPanel();
            f.add(gp);
            f.setSize(600, 300);
            f.setVisible(true);
    }
}
