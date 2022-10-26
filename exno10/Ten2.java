/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ten2;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/**
 *
 * @author Amrudha
 */
public class Ten2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

    JFrame frame = new JFrame();
    JPanel panel = new JPanel();
    frame.setSize(500, 500);
    frame.setVisible(true);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    final JButton redButton = new JButton ("Red");
    final JButton greenButton = new JButton ("Green");
    final JButton blueButton = new JButton ("Blue");

    class Listener extends JPanel implements ActionListener{

        public void actionPerformed(ActionEvent event) {
            Color color;
            if (event.getSource() == redButton){
                color = Color.red;                  
            } else if (event.getSource() == greenButton){
                color = Color.green;
            } else {
                color = Color.blue;
            }
            setBackground(color);
            System.out.println(color);
            repaint();
        }           
    }

    redButton.addActionListener(new Listener());
    greenButton.addActionListener(new Listener());
    blueButton.addActionListener(new Listener());

    panel.add(new JButton ("Red")); 
    panel.add(new JButton ("Green"));
    panel.add(new JButton ("Blue"));
    frame.add(panel);       


}
}
    
