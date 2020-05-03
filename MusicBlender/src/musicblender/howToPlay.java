package musicblender;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class howToPlay extends JFrame{
    JFrame f3 = new JFrame();
    JPanel p3 = new JPanel();
    JLabel l1;
	public howToPlay(){
		this.setTitle("Music Blender");
        this.setSize(515, 600);
        this.setVisible(true);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocation(500, 100);
        p3.setSize(515, 600);
        p3.setBackground(Color.green);
        p3.setLayout(null);		
       
		
	    l1 = new JLabel("<html>This game is for every person wants to turn his thoughts to tones and <br>challenge his friends for deciding who is the musician!! :)<br>With it you can create your own music !</html>");	 
	    l1.setBounds(30, 100, 420, 100);
	    l1.setBackground(Color.green);	
	    l1.setForeground(Color.blue);
	    l1.setFont(new Font("atilic",Font.BOLD,15));
	    
	    this.add(p3);
	    p3.add(l1);
		 
		 
		 
		 
		 
		 
		 
		 
     }
}
