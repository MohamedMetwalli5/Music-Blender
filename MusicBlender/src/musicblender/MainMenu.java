package musicblender;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MainMenu extends JFrame{
    JFrame f2 = new JFrame();
    JPanel p2 = new JPanel();
    vv r = new vv();
    JButton bb1;
    JButton bb2;
    JButton bb3;
	public MainMenu() {
	    this.setTitle("Music Blender");
        this.setSize(515, 600);
        this.setVisible(true);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocation(500, 100);
        p2.setSize(515, 600);
        p2.setBackground(Color.orange);
        p2.setLayout(null);		
	    bb1 = new JButton("Start");
	    bb2 = new JButton("About me");
	    bb3 = new JButton("How To Play");
	    
	    bb1.setBounds(120, 100, 250, 80);
	    bb1.setBackground(Color.cyan);
	    bb1.setForeground(Color.DARK_GRAY);
	    bb1.setFont(new Font("atilic",Font.BOLD,30));
	    
	    bb2.setBounds(120, 350, 250, 80);
	    bb2.setBackground(Color.cyan);
	    bb2.setForeground(Color.DARK_GRAY);
	    bb2.setFont(new Font("atilic",Font.BOLD,30));
	    
	    bb3.setBounds(120, 230, 250, 80);
	    bb3.setBackground(Color.cyan);
	    bb3.setForeground(Color.DARK_GRAY);
	    bb3.setFont(new Font("atilic",Font.BOLD,30));
	    
	    

	    
	    this.add(p2);
	    p2.add(bb1);
	    p2.add(bb2);
	    p2.add(bb3);
	  
	    bb1.addActionListener(r);
	    bb2.addActionListener(r);
	    bb3.addActionListener(r);
	    
	 } 
        private class vv implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			if(e.getSource() == bb1) {
				Mixer m = new Mixer();
			}else if(e.getSource() == bb2) {
				Information inf = new Information();
			}else if(e.getSource() == bb3) {
				howToPlay htp = new howToPlay();
			}
			
			
			
		
        	
        	
        	
        }  
  }
	
}



