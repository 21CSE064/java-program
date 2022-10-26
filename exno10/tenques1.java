package tenques1;
 import java.awt.*;
import javax.swing.JFrame;
import javax.swing.JPanel;
public class tenques1 extends JPanel {
int midX = 220;
int midY = 280;
public void paint(Graphics g) {
super.paint(g);
setBackground(new Color(18,11,03));
g.setColor (Color.white);
g.fillOval (midX-20, midY-60, 40, 40); 
g.fillOval (midX-35, midY-25, 70, 50);
g.fillOval (midX-50, midY+20, 100, 60);
g.setColor (Color.black);
g.fillOval (midX-10, midY-50, 5, 5);
g.fillOval (midX+5, midY-50, 5, 5);
g.drawArc (midX-10, midY-40, 20, 10, 190, 160); 
g.drawLine (midX-25, midY, midX-50, midY-20); 
g.drawLine (midX+25, midY, midX+55, midY); 
}
public static void main(String args[]) {
JFrame f = new JFrame("Snowman");
f.add(new tenques1());
f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
f.setSize(600,600);
f.setVisible(true);
}
}

