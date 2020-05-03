package musicblender;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Information extends JFrame{
    JFrame f3 = new JFrame();
    JPanel p3 = new JPanel();
    JLabel l1;
	public Information(){
		this.setTitle("Music Blender");
        this.setSize(515, 600);
        this.setVisible(true);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocation(500, 100);
        p3.setSize(515, 600);
        p3.setBackground(Color.cyan);
        p3.setLayout(null);		
		
		
	    l1 = new JLabel("<html>My name is Mohamed Metwalli , I created this game inspired by my need for a music editing game in which i play with my rules! B)  :) <html> ");	 
	    l1.setBounds(30, 100, 420, 100);
	    l1.setBackground(Color.orange);	
	    l1.setForeground(Color.blue);
	    l1.setFont(new Font("atilic",Font.BOLD,15));
	    
	    this.add(p3);
	    p3.add(l1);
		 
		 
     }
}
