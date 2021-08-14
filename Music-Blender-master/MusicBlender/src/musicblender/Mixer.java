package musicblender;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class Mixer extends JFrame implements KeyListener{
    JFrame f2 = new JFrame();
    JPanel p2 = new JPanel();
    eve v = new eve();
    int r = 1 ;
    String s = "Mohamed"; //if you downloaded the code on your laptop or pc then change s value to the username of your machine and put the file that is called "tones" on your desktop
    int score = 0,flag=0;
    JButton b1;
    JButton b2;
    JButton b3;
    JButton b4;
    JButton b5;
    JButton b6;
    JButton b7;
    JButton b8;
    JButton b9;
    JButton b10;
    JButton b11;
    JButton b12;
    JButton b13;
    JButton b14;
    JButton b15;
    JButton b16;
    JButton b17;
    JButton b18;
    JButton b19;
    JButton b20;
    JButton b21;
    JButton b22;
    JButton b23;
    JButton b24;
    JButton b25;
    JButton b26;
    JButton b27;
    JButton b28;
    JButton b29;
    JButton b30;
    JButton b31;
    JButton b32;
    JButton b33;
    JButton b34;
    JButton b35;
    JButton b36;
    JButton b37;
    JButton b38;
    JButton b39;
    JButton b40;
    JButton b41;
    JButton b42;
    JButton b43;
    JButton b44;
    JButton b45;
    JButton b46;
    JButton b47;
    JButton b48;
    JButton b49;
    JButton b50;
    JButton b51;
    JButton b52;
    JButton b53;
    JButton b54;
    JButton b55;
    JButton b56;
    JButton b57;
    JButton b58;
    JButton b59;
    JButton b60;
    JButton b61;
    JButton b62;
    JButton b63;
    JButton b64;
    JButton b65;
    JButton b66;
    
    
	public Mixer() {
	    this.setTitle("Music Blender");
        this.setSize(515, 600);
        this.setVisible(true);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocation(500, 100);
        p2.setSize(515, 600);
        p2.setBackground(Color.orange);
        p2.setLayout(null);		
	    b1 = new JButton();
	    b2 = new JButton();
	    b3 = new JButton();
	    b4 = new JButton();
	    b5 = new JButton();
	    b6 = new JButton();
	    b7 = new JButton();
	    b8 = new JButton();
	    b9 = new JButton();
	    b10 = new JButton();
	    b11 = new JButton();
	    b12 = new JButton();    
	    b13 = new JButton();
	    b14 = new JButton();
	    b15 = new JButton();
	    b16 = new JButton();
	    b17 = new JButton();
	    b18 = new JButton();
	    b19 = new JButton();
	    b20 = new JButton();
	    b21 = new JButton();
	    b22 = new JButton();
	    b23 = new JButton();
	    b24 = new JButton();	     
	    b25 = new JButton();
	    b26 = new JButton();
	    b27 = new JButton();
	    b28 = new JButton();
	    b29 = new JButton();
	    b30 = new JButton();
	    b31 = new JButton();
	    b32 = new JButton();
	    b33 = new JButton();
	    b34 = new JButton();
	    b35 = new JButton();
	    b36 = new JButton();    
	    b37 = new JButton();
	    b38 = new JButton();
	    b39 = new JButton();
	    b40 = new JButton();
	    b41 = new JButton();
	    b42 = new JButton();
	    b43 = new JButton();
	    b44 = new JButton();
	    b45 = new JButton();
	    b46 = new JButton();
	    b47 = new JButton();
	    b48 = new JButton(); 
	    b49 = new JButton();
	    b50 = new JButton();
	    b51 = new JButton(); 
	    b52 = new JButton();
	    b53 = new JButton();
	    b54 = new JButton();
	    b55 = new JButton();
	    b56 = new JButton();
	    b57 = new JButton();
	    b58 = new JButton();
	    b59 = new JButton();
	    b60 = new JButton();
	    b61 = new JButton();
	    b62 = new JButton();
	    b63 = new JButton();
	    b64 = new JButton();
	    b65 = new JButton();
	    b66 = new JButton();
	    
	    
	    
	    
	    b1.setBounds(0, 0, 50, 50);
	    b1.setBackground(Color.DARK_GRAY);
	    b1.setForeground(Color.DARK_GRAY);
	    b1.setFont(new Font("atilic",Font.BOLD,10));
	    
	    b2.setBounds(50, 50, 50, 50);
	    b2.setBackground(Color.DARK_GRAY);
	    b2.setForeground(Color.DARK_GRAY);
	    b2.setFont(new Font("atilic",Font.BOLD,10));
	    
	    b3.setBounds(50, 0, 50, 50);
	    b3.setBackground(Color.DARK_GRAY);
	    b3.setForeground(Color.DARK_GRAY);
	    b3.setFont(new Font("atilic",Font.BOLD,10));
	    
	    b4.setBounds(0, 50, 50, 50);
	    b4.setBackground(Color.DARK_GRAY);
	    b4.setForeground(Color.DARK_GRAY);
	    b4.setFont(new Font("atilic",Font.BOLD,10));
	    
	    
	    b5.setBounds(0, 100, 50, 50);
	    b5.setBackground(Color.DARK_GRAY);
	    b5.setForeground(Color.DARK_GRAY);
	    b5.setFont(new Font("atilic",Font.BOLD,10));
	    
	    b6.setBounds(100, 0, 50, 50);
	    b6.setBackground(Color.DARK_GRAY);
	    b6.setForeground(Color.DARK_GRAY);
	    b6.setFont(new Font("atilic",Font.BOLD,10));
	    
	    b7.setBounds(100, 50, 50, 50);
	    b7.setBackground(Color.DARK_GRAY);
	    b7.setForeground(Color.DARK_GRAY);
	    b7.setFont(new Font("atilic",Font.BOLD,10));
	    
	    b8.setBounds(50, 100, 50, 50);
	    b8.setBackground(Color.DARK_GRAY);
	    b8.setForeground(Color.DARK_GRAY);
	    b8.setFont(new Font("atilic",Font.BOLD,10));
	   
	    b9.setBounds(100, 100, 50, 50);
	    b9.setBackground(Color.DARK_GRAY);
	    b9.setForeground(Color.DARK_GRAY);
	    b9.setFont(new Font("atilic",Font.BOLD,10));
	   
	    b10.setBounds(150, 150, 50, 50);
	    b10.setBackground(Color.DARK_GRAY);
	    b10.setForeground(Color.DARK_GRAY);
	    b10.setFont(new Font("atilic",Font.BOLD,10));
	   
	    b11.setBounds(150, 100, 50, 50);
	    b11.setBackground(Color.DARK_GRAY);
	    b11.setForeground(Color.DARK_GRAY);
	    b11.setFont(new Font("atilic",Font.BOLD,10));
	    
	    b12.setBounds(100, 150, 50, 50);
	    b12.setBackground(Color.DARK_GRAY);
	    b12.setForeground(Color.DARK_GRAY);
	    b12.setFont(new Font("atilic",Font.BOLD,10));
	   
	     
	    b13.setBounds(150, 50, 50, 50);
	    b13.setBackground(Color.DARK_GRAY);
	    b13.setForeground(Color.DARK_GRAY);
	    b13.setFont(new Font("atilic",Font.BOLD,10));
	    
	    b14.setBounds(50, 150, 50, 50);
	    b14.setBackground(Color.DARK_GRAY);
	    b14.setForeground(Color.DARK_GRAY);
	    b14.setFont(new Font("atilic",Font.BOLD,10));
	    
	    
	    b15.setBounds(200, 200, 50, 50);
	    b15.setBackground(Color.DARK_GRAY);
	    b15.setForeground(Color.DARK_GRAY);
	    b15.setFont(new Font("atilic",Font.BOLD,10));
	    
	    b16.setBounds(200, 100, 50, 50);
	    b16.setBackground(Color.DARK_GRAY);
	    b16.setForeground(Color.DARK_GRAY);
	    b16.setFont(new Font("atilic",Font.BOLD,10));
	    
	    
	    b17.setBounds(100, 200, 50, 50);
	    b17.setBackground(Color.DARK_GRAY);
	    b17.setForeground(Color.DARK_GRAY);
	    b17.setFont(new Font("atilic",Font.BOLD,10));
	    
	    b18.setBounds(200, 50, 50, 50);
	    b18.setBackground(Color.DARK_GRAY);
	    b18.setForeground(Color.DARK_GRAY);
	    b18.setFont(new Font("atilic",Font.BOLD,10));
	    
	    b19.setBounds(50, 200, 50, 50);
	    b19.setBackground(Color.DARK_GRAY);
	    b19.setForeground(Color.DARK_GRAY);
	    b19.setFont(new Font("atilic",Font.BOLD,10));
	   
	    b20.setBounds(150, 200, 50, 50);
	    b20.setBackground(Color.DARK_GRAY);
	    b20.setForeground(Color.DARK_GRAY);
	    b20.setFont(new Font("atilic",Font.BOLD,10));
	   
	    b21.setBounds(200, 150, 50, 50);
	    b21.setBackground(Color.DARK_GRAY);
	    b21.setForeground(Color.DARK_GRAY);
	    b21.setFont(new Font("atilic",Font.BOLD,10));
	   
	   
	    b22.setBounds(250, 50, 50, 50);
	    b22.setBackground(Color.DARK_GRAY);
	    b22.setForeground(Color.DARK_GRAY);
	    b22.setFont(new Font("atilic",Font.BOLD,10));
	   
	    b23.setBounds(50, 250, 50, 50);
	    b23.setBackground(Color.DARK_GRAY);
	    b23.setForeground(Color.DARK_GRAY);
	    b23.setFont(new Font("atilic",Font.BOLD,10));
	    
	    b24.setBounds(250, 250, 50, 50);
	    b24.setBackground(Color.DARK_GRAY);
	    b24.setForeground(Color.DARK_GRAY);
	    b24.setFont(new Font("atilic",Font.BOLD,10));
	    
	     
	    b25.setBounds(250, 100, 50, 50);
	    b25.setBackground(Color.DARK_GRAY);
	    b25.setForeground(Color.DARK_GRAY);
	    b25.setFont(new Font("atilic",Font.BOLD,10));
	    
	    b26.setBounds(100, 250, 50, 50);
	    b26.setBackground(Color.DARK_GRAY);
	    b26.setForeground(Color.DARK_GRAY);
	    b26.setFont(new Font("atilic",Font.BOLD,10));
	    
	    b27.setBounds(250, 150, 50, 50);
	    b27.setBackground(Color.DARK_GRAY);
	    b27.setForeground(Color.DARK_GRAY);
	    b27.setFont(new Font("atilic",Font.BOLD,10));
	    
	    b28.setBounds(150, 250, 50, 50);
	    b28.setBackground(Color.DARK_GRAY);
	    b28.setForeground(Color.DARK_GRAY);
	    b28.setFont(new Font("atilic",Font.BOLD,10));
	    
	    b29.setBounds(300, 100, 50, 50);
	    b29.setBackground(Color.DARK_GRAY);
	    b29.setForeground(Color.DARK_GRAY);
	    b29.setFont(new Font("atilic",Font.BOLD,10));
	    
	    b30.setBounds(350, 50, 50, 50);
	    b30.setBackground(Color.DARK_GRAY);
	    b30.setForeground(Color.DARK_GRAY);
	    b30.setFont(new Font("atilic",Font.BOLD,10));
	    
	    b31.setBounds(350, 100, 50, 50);
	    b31.setBackground(Color.DARK_GRAY);
	    b31.setForeground(Color.DARK_GRAY);
	    b31.setFont(new Font("atilic",Font.BOLD,10));
	    
	    b32.setBounds(300, 50, 50, 50);
	    b32.setBackground(Color.DARK_GRAY);
	    b32.setForeground(Color.DARK_GRAY);
	    b32.setFont(new Font("atilic",Font.BOLD,10));
	   
	    b33.setBounds(350, 200, 50, 50);
	    b33.setBackground(Color.DARK_GRAY);
	    b33.setForeground(Color.DARK_GRAY);
	    b33.setFont(new Font("atilic",Font.BOLD,10));
	   
	    b34.setBounds(300, 150, 50, 50);
	    b34.setBackground(Color.DARK_GRAY);
	    b34.setForeground(Color.DARK_GRAY);
	    b34.setFont(new Font("atilic",Font.BOLD,10));
	   
	    b35.setBounds(350, 250, 50, 50);
	    b35.setBackground(Color.DARK_GRAY);
	    b35.setForeground(Color.DARK_GRAY);
	    b35.setFont(new Font("atilic",Font.BOLD,10));
	    
	    b36.setBounds(300, 200, 50, 50);
	    b36.setBackground(Color.DARK_GRAY);
	    b36.setForeground(Color.DARK_GRAY);
	    b36.setFont(new Font("atilic",Font.BOLD,10));
	    
	    b37.setBounds(350, 150, 50, 50);
	    b37.setBackground(Color.DARK_GRAY);
	    b37.setForeground(Color.DARK_GRAY);
	    b37.setFont(new Font("atilic",Font.BOLD,10));
	    
	    b38.setBounds(400, 50, 50, 50);
	    b38.setBackground(Color.DARK_GRAY);
	    b38.setForeground(Color.DARK_GRAY);
	    b38.setFont(new Font("atilic",Font.BOLD,10));
	    
	    
	    b39.setBounds(300, 250, 50, 50);
	    b39.setBackground(Color.DARK_GRAY);
	    b39.setForeground(Color.DARK_GRAY);
	    b39.setFont(new Font("atilic",Font.BOLD,10));
	    
	    
	    b40.setBounds(400, 100, 50, 50);
	    b40.setBackground(Color.DARK_GRAY);
	    b40.setForeground(Color.DARK_GRAY);
	    b40.setFont(new Font("atilic",Font.BOLD,10));
	    
	    
	    b41.setBounds(400, 150, 50, 50);
	    b41.setBackground(Color.DARK_GRAY);
	    b41.setForeground(Color.DARK_GRAY);
	    b41.setFont(new Font("atilic",Font.BOLD,10));
	    
	    b42.setBounds(400, 200, 50, 50);
	    b42.setBackground(Color.DARK_GRAY);
	    b42.setForeground(Color.DARK_GRAY);
	    b42.setFont(new Font("atilic",Font.BOLD,10));
	    
	    b43.setBounds(400, 250, 50, 50);
	    b43.setBackground(Color.DARK_GRAY);
	    b43.setForeground(Color.DARK_GRAY);
	    b43.setFont(new Font("atilic",Font.BOLD,10));
	   
	    b44.setBounds(450, 50, 50, 50);
	    b44.setBackground(Color.DARK_GRAY);
	    b44.setForeground(Color.DARK_GRAY);
	    b44.setFont(new Font("atilic",Font.BOLD,10));
	  
	    b45.setBounds(450, 100, 50, 50);
	    b45.setBackground(Color.DARK_GRAY);
	    b45.setForeground(Color.DARK_GRAY);
	    b45.setFont(new Font("atilic",Font.BOLD,10));
	   
	    b46.setBounds(450, 150, 50, 50);
	    b46.setBackground(Color.DARK_GRAY);
	    b46.setForeground(Color.DARK_GRAY);
	    b46.setFont(new Font("atilic",Font.BOLD,10));
	   
	    b47.setBounds(450, 200, 50, 50);
	    b47.setBackground(Color.DARK_GRAY);
	    b47.setForeground(Color.DARK_GRAY);
	    b47.setFont(new Font("atilic",Font.BOLD,10));
	    
	    b48.setBounds(450, 250, 50, 50);
	    b48.setBackground(Color.DARK_GRAY);
	    b48.setForeground(Color.DARK_GRAY);
	    b48.setFont(new Font("atilic",Font.BOLD,10));
	    
	    b49.setBounds(0, 150, 50, 50);
	    b49.setBackground(Color.DARK_GRAY);
	    b49.setForeground(Color.DARK_GRAY);
	    b49.setFont(new Font("atilic",Font.BOLD,10));
	    
	    b50.setBounds(0, 200, 50, 50);
	    b50.setBackground(Color.DARK_GRAY);
	    b50.setForeground(Color.DARK_GRAY);
	    b50.setFont(new Font("atilic",Font.BOLD,10));
	    
	    b51.setBounds(0, 250, 50, 50);
	    b51.setBackground(Color.DARK_GRAY);
	    b51.setForeground(Color.DARK_GRAY);
	    b51.setFont(new Font("atilic",Font.BOLD,10));
	    
	    
	    b52.setBounds(250,0 , 50, 50);
	    b52.setBackground(Color.DARK_GRAY);
	    b52.setForeground(Color.DARK_GRAY);
	    b52.setFont(new Font("atilic",Font.BOLD,10));
	    
	    
	    b53.setBounds(150, 0, 50, 50);
	    b53.setBackground(Color.DARK_GRAY);
	    b53.setForeground(Color.DARK_GRAY);
	    b53.setFont(new Font("atilic",Font.BOLD,10));
	    
	    b54.setBounds(200, 0, 50, 50);
	    b54.setBackground(Color.DARK_GRAY);
	    b54.setForeground(Color.DARK_GRAY);
	    b54.setFont(new Font("atilic",Font.BOLD,10));
	    
	    b55.setBounds(450, 0, 50, 50);
	    b55.setBackground(Color.DARK_GRAY);
	    b55.setForeground(Color.DARK_GRAY);
	    b55.setFont(new Font("atilic",Font.BOLD,10));
	    
	    b56.setBounds(400, 0, 50, 50);
	    b56.setBackground(Color.DARK_GRAY);
	    b56.setForeground(Color.DARK_GRAY);
	    b56.setFont(new Font("atilic",Font.BOLD,10));
	   
	    b57.setBounds(300, 0, 50, 50);
	    b57.setBackground(Color.DARK_GRAY);
	    b57.setForeground(Color.DARK_GRAY);
	    b57.setFont(new Font("atilic",Font.BOLD,10));
	   
	    b58.setBounds(350, 0, 50, 50);
	    b58.setBackground(Color.DARK_GRAY);
	    b58.setForeground(Color.DARK_GRAY);
	    b58.setFont(new Font("atilic",Font.BOLD,10));
	   
	    b59.setBounds(200, 250, 50, 50);
	    b59.setBackground(Color.DARK_GRAY);
	    b59.setForeground(Color.DARK_GRAY);
	    b59.setFont(new Font("atilic",Font.BOLD,10));
	    
	    b60.setBounds(250, 200, 50, 50);
	    b60.setBackground(Color.DARK_GRAY);
	    b60.setForeground(Color.DARK_GRAY);
	    b60.setFont(new Font("atilic",Font.BOLD,10));
	    
	    
	     
	    
	    this.add(p2);
	    p2.add(b1);
	    p2.add(b2);
	    p2.add(b3);
	    p2.add(b4);
	    p2.add(b5);
	    p2.add(b6);
	    p2.add(b7);
	    p2.add(b8);
	    p2.add(b9);
	    p2.add(b10);
	    p2.add(b11);
	    p2.add(b12);
	    p2.add(b13);
	    p2.add(b14);
	    p2.add(b15);
	    p2.add(b16);
	    p2.add(b17);
	    p2.add(b18);
	    p2.add(b19);
	    p2.add(b20);
	    p2.add(b21);
	    p2.add(b22);
	    p2.add(b23);
	    p2.add(b24); 
	    p2.add(b25);
	    p2.add(b26);
	    p2.add(b27);
	    p2.add(b28);
	    p2.add(b29);
	    p2.add(b30);
	    p2.add(b31);
	    p2.add(b32);
	    p2.add(b33);
	    p2.add(b34);
	    p2.add(b35);
	    p2.add(b36);
	    p2.add(b37);
	    p2.add(b38);
	    p2.add(b39);
	    p2.add(b40);
	    p2.add(b41);
	    p2.add(b42);
	    p2.add(b43);
	    p2.add(b44);
	    p2.add(b45);
	    p2.add(b46);
	    p2.add(b47);
	    p2.add(b48);
	    p2.add(b49);
	    p2.add(b50);
	    p2.add(b51);
	    p2.add(b52);
	    p2.add(b53);
	    p2.add(b54);
	    p2.add(b55);
	    p2.add(b56);
	    p2.add(b57);
	    p2.add(b58);
	    p2.add(b59);
	    p2.add(b60);

	    
	    
	    b1.addKeyListener(v);
		b2.addKeyListener(v);
		b3.addKeyListener(v);
	    b4.addKeyListener(v);
	    b5.addKeyListener(v);
	    b6.addKeyListener(v);
	    b7.addKeyListener(v);
	    b8.addKeyListener(v);
	    b9.addKeyListener(v);
	    b10.addKeyListener(v);
	    b11.addKeyListener(v);
	    b12.addKeyListener(v);
	    b13.addKeyListener(v);
	    b14.addKeyListener(v);
	    b15.addKeyListener(v);
	    b16.addKeyListener(v);
	    b17.addKeyListener(v);
	    b18.addKeyListener(v);
	    b19.addKeyListener(v);
	    b20.addKeyListener(v);
	    b21.addKeyListener(v);
	    b22.addKeyListener(v);
	    b23.addKeyListener(v);
	    b24.addKeyListener(v);
	    b25.addKeyListener(v);
		b26.addKeyListener(v);
		b27.addKeyListener(v);
	    b28.addKeyListener(v);
	    b29.addKeyListener(v);
	    b30.addKeyListener(v);
	    b31.addKeyListener(v);
	    b32.addKeyListener(v);
	    b33.addKeyListener(v);
	    b34.addKeyListener(v);
	    b35.addKeyListener(v);
	    b36.addKeyListener(v);
	    b37.addKeyListener(v);
	    b38.addKeyListener(v);
	    b39.addKeyListener(v);
	    b40.addKeyListener(v);
	    b41.addKeyListener(v);
	    b42.addKeyListener(v);
	    b43.addKeyListener(v);
	    b44.addKeyListener(v);
	    b45.addKeyListener(v);
	    b46.addKeyListener(v);
	    b47.addKeyListener(v);
	    b48.addKeyListener(v);
	    b49.addKeyListener(v);
		b50.addKeyListener(v);
		b51.addKeyListener(v);
	    b52.addKeyListener(v);
	    b53.addKeyListener(v);
	    b54.addKeyListener(v);
	    b55.addKeyListener(v);
	    b56.addKeyListener(v);
	    b57.addKeyListener(v);
	    b58.addKeyListener(v);
	    b59.addKeyListener(v);
	    b60.addKeyListener(v);
	    
	    
	    
	    
  }
   
	
	
	private class eve implements KeyListener{

		@Override
		public void keyTyped(KeyEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void keyPressed(KeyEvent e) {

	    	  
			  if(e.getKeyCode() == KeyEvent.VK_Q) {
				  try{
					  Clip clip = AudioSystem.getClip();
					  clip.open(AudioSystem.getAudioInputStream(new File("C:\\Users\\"+s+"\\Desktop\\tones\\Dry-Kick.wav")));
					  clip.start();
					  b1.setBackground(Color.yellow);
				     }
				   catch(Exception ex)
				   { 
					   //JOptionPane.showMessageDialog(null, ex);
				   }
				
			  }else if(e.getKeyCode() == KeyEvent.VK_W) {
				  
				  try{
					  Clip clip = AudioSystem.getClip();
					  clip.open(AudioSystem.getAudioInputStream(new File("C:\\Users\\"+s+"\\Desktop\\tones\\Closed-Hi-Hat-3.wav")));
					  clip.start();
					  b2.setBackground(Color.yellow);
				     }
				   catch(Exception ex)
				   { 
					   //JOptionPane.showMessageDialog(null, ex);
				   }
			  }else if(e.getKeyCode() == KeyEvent.VK_E) {
				  
				  try{
					  Clip clip = AudioSystem.getClip();
					  clip.open(AudioSystem.getAudioInputStream(new File("C:\\Users\\"+s+"\\Desktop\\tones\\Bass-Drum-1.wav")));
					  clip.start();
					  b3.setBackground(Color.yellow);
				     }
				   catch(Exception ex)
				   { 
					   //JOptionPane.showMessageDialog(null, ex);
				   }
			  }else if(e.getKeyCode() == KeyEvent.VK_R) {
				  
				  try{
					  Clip clip = AudioSystem.getClip();
					  clip.open(AudioSystem.getAudioInputStream(new File("C:\\Users\\"+s+"\\Desktop\\tones\\Yamaha-PS-300-March.wav")));
					  clip.start();
					  b4.setBackground(Color.yellow);
				     }
				   catch(Exception ex)
				   { 
					   //JOptionPane.showMessageDialog(null, ex);
				   }
				  
			  }else if(e.getKeyCode() == KeyEvent.VK_T) {
				  
				  try{
					  Clip clip = AudioSystem.getClip();
					  clip.open(AudioSystem.getAudioInputStream(new File("C:\\Users\\"+s+"\\Desktop\\tones\\Alesis-S4-Plus-Shark-Bass-C2.wav")));
					  clip.start();
					  b5.setBackground(Color.yellow);
				     }
				   catch(Exception ex)
				   { 
					   //JOptionPane.showMessageDialog(null, ex);
				   }
				  
			  }else if(e.getKeyCode() == KeyEvent.VK_Y) {
				  
				  try{
					  Clip clip = AudioSystem.getClip();
					  clip.open(AudioSystem.getAudioInputStream(new File("C:\\Users\\"+s+"\\Desktop\\tones\\Roland-D-20-Rhumba-104-bpm.wav")));
					  clip.start();
					  b6.setBackground(Color.yellow);
				     }
				   catch(Exception ex)
				   { 
					   //JOptionPane.showMessageDialog(null, ex);
				   }
				  
			  }else if(e.getKeyCode() == KeyEvent.VK_U) {
				  
				  try{
					  Clip clip = AudioSystem.getClip();
					  clip.open(AudioSystem.getAudioInputStream(new File("C:\\Users\\"+s+"\\Desktop\\tones\\Casio-MT-45-Samba.wav")));
					  clip.start();
					  b7.setBackground(Color.yellow);
				     }
				   catch(Exception ex)
				   { 
					   //JOptionPane.showMessageDialog(null, ex);
				   }
				  
			  }else if(e.getKeyCode() == KeyEvent.VK_I) {
				  
				  try{
					  Clip clip = AudioSystem.getClip();
					  clip.open(AudioSystem.getAudioInputStream(new File("C:\\Users\\"+s+"\\Desktop\\tones\\Casio-MT-45-Samba.wav")));
					  clip.start();
					  b8.setBackground(Color.yellow);
				     }
				   catch(Exception ex)
				   { 
					   //JOptionPane.showMessageDialog(null, ex);
				   }
				  
			  }else if(e.getKeyCode() == KeyEvent.VK_O) {
				  
				  try{
					  Clip clip = AudioSystem.getClip();
					  clip.open(AudioSystem.getAudioInputStream(new File("C:\\Users\\"+s+"\\Desktop\\tones\\Kawai-K5000W-BrdTweet.wav")));
					  clip.start();
					  b9.setBackground(Color.yellow);
				     }
				   catch(Exception ex)
				   { 
					   //JOptionPane.showMessageDialog(null, ex);
				   }
				  
			  }else if(e.getKeyCode() == KeyEvent.VK_P) {
				  
				  try{
					  Clip clip = AudioSystem.getClip();
					  clip.open(AudioSystem.getAudioInputStream(new File("C:\\Users\\"+s+"\\Desktop\\tones\\Galloping-Horse.wav")));
					  clip.start();
					  b10.setBackground(Color.yellow);
				     }
				   catch(Exception ex)
				   { 
					   //JOptionPane.showMessageDialog(null, ex);
				   }
				  
			  }else if(e.getKeyCode() == KeyEvent.VK_A) {
				  
				  try{
					  Clip clip = AudioSystem.getClip();
					  clip.open(AudioSystem.getAudioInputStream(new File("C:\\Users\\"+s+"\\Desktop\\tones\\Kawai-K11-Seashore.wav")));
					  clip.start();
					  b11.setBackground(Color.yellow);
				     }
				   catch(Exception ex)
				   { 
					   //JOptionPane.showMessageDialog(null, ex);
				   }
				  
			  }else if(e.getKeyCode() == KeyEvent.VK_S) {
				  
				  try{
					  Clip clip = AudioSystem.getClip();
					  clip.open(AudioSystem.getAudioInputStream(new File("C:\\Users\\"+s+"\\Desktop\\tones\\Korg-01W-Crickets.wav")));
					  clip.start();
					  b12.setBackground(Color.yellow);
				     }
				   catch(Exception ex)
				   { 
					   //JOptionPane.showMessageDialog(null, ex);
				   }
				  
			  }else if(e.getKeyCode() == KeyEvent.VK_D) {
				  
				  try{
					  Clip clip = AudioSystem.getClip();
					  clip.open(AudioSystem.getAudioInputStream(new File("C:\\Users\\"+s+"\\Desktop\\tones\\Kawai-K5000W-Thunder.wav")));
					  clip.start();
					  b13.setBackground(Color.yellow);
				     }
				   catch(Exception ex)
				   { 
					   //JOptionPane.showMessageDialog(null, ex);
				   }
				  
			  }else if(e.getKeyCode() == KeyEvent.VK_F) {
				  
				  try{
					  Clip clip = AudioSystem.getClip();
					  clip.open(AudioSystem.getAudioInputStream(new File("C:\\Users\\"+s+"\\Desktop\\tones\\Chirping-Birds-2.wav")));
					  clip.start();
					  b14.setBackground(Color.yellow);
				     }
				   catch(Exception ex)
				   { 
					   //JOptionPane.showMessageDialog(null, ex);
				   }
				  
			  }else if(e.getKeyCode() == KeyEvent.VK_G) {
				  
				  try{
					  Clip clip = AudioSystem.getClip();
					  clip.open(AudioSystem.getAudioInputStream(new File("C:\\Users\\"+s+"\\Desktop\\tones\\1980s-Casio-Harpsichord-C5.wav")));
					  clip.start();
					  b15.setBackground(Color.yellow);
				     }
				   catch(Exception ex)
				   { 
					   //JOptionPane.showMessageDialog(null, ex);
				   }
				  
			  }else if(e.getKeyCode() == KeyEvent.VK_H) {
				  
				  try{
					  Clip clip = AudioSystem.getClip();
					  clip.open(AudioSystem.getAudioInputStream(new File("C:\\Users\\"+s+"\\Desktop\\tones\\Kawai-K5000W-Ac-Bass1-C2.wav")));
					  clip.start();
					  b16.setBackground(Color.yellow);
				     }
				   catch(Exception ex)
				   { 
					   //JOptionPane.showMessageDialog(null, ex);
				   }
				  
			  }else if(e.getKeyCode() == KeyEvent.VK_J) {
				  
				  try{
					  Clip clip = AudioSystem.getClip();
					  clip.open(AudioSystem.getAudioInputStream(new File("C:\\Users\\"+s+"\\Desktop\\tones\\Electronic-Kick-2.wav")));
					  clip.start();
					  b17.setBackground(Color.yellow);
				     }
				   catch(Exception ex)
				   { 
					   //JOptionPane.showMessageDialog(null, ex);
				   }
				  
			  }else if(e.getKeyCode() == KeyEvent.VK_K) {
				  
				  try{
					  Clip clip = AudioSystem.getClip();
					  clip.open(AudioSystem.getAudioInputStream(new File("C:\\Users\\"+s+"\\Desktop\\tones\\Alesis-Fusion-Bright-Acoustic-Piano-C4.wav")));
					  clip.start();
					  b18.setBackground(Color.yellow);
				     }
				   catch(Exception ex)
				   { 
					   //JOptionPane.showMessageDialog(null, ex);
				   }
				  
			  }else if(e.getKeyCode() == KeyEvent.VK_L) {
				  
				  try{
					  Clip clip = AudioSystem.getClip();
					  clip.open(AudioSystem.getAudioInputStream(new File("C:\\Users\\"+s+"\\Desktop\\tones\\M-Audio-Venom-Disintegr8-C3.wav")));
					  clip.start();
					  b19.setBackground(Color.yellow);
				     }
				   catch(Exception ex)
				   { 
					   //JOptionPane.showMessageDialog(null, ex);
				   }
				  
			  }else if(e.getKeyCode() == KeyEvent.VK_Z) {
				  
				  try{
					  Clip clip = AudioSystem.getClip();
					  clip.open(AudioSystem.getAudioInputStream(new File("C:\\Users\\"+s+"\\Desktop\\tones\\Alesis-Fusion-Ocarina-C5.wav")));
					  clip.start();
					  b20.setBackground(Color.yellow);
				     }
				   catch(Exception ex)
				   { 
					   //JOptionPane.showMessageDialog(null, ex);
				   }
				  
			  }else if(e.getKeyCode() == KeyEvent.VK_X) {
				  
				  try{
					  Clip clip = AudioSystem.getClip();
					  clip.open(AudioSystem.getAudioInputStream(new File("C:\\Users\\"+s+"\\Desktop\\tones\\Kawai-K5000W-Harp-C5.wav")));
					  clip.start();
					  b21.setBackground(Color.yellow);
				     }
				   catch(Exception ex)
				   { 
					   //JOptionPane.showMessageDialog(null, ex);
				   }
				  
			  }else if(e.getKeyCode() == KeyEvent.VK_C) {
				  
				  try{
					  Clip clip = AudioSystem.getClip();
					  clip.open(AudioSystem.getAudioInputStream(new File("C:\\Users\\"+s+"\\Desktop\\tones\\Yamaha-TG500-FI-DulcD-C4.wav")));
					  clip.start();
					  b22.setBackground(Color.yellow);
				     }
				   catch(Exception ex)
				   { 
					   //JOptionPane.showMessageDialog(null, ex);
				   }
				  
			  }else if(e.getKeyCode() == KeyEvent.VK_V) {
				  
				  try{
					  Clip clip = AudioSystem.getClip();
					  clip.open(AudioSystem.getAudioInputStream(new File("C:\\Users\\"+s+"\\Desktop\\tones\\Korg-N1R-Maracas.wav")));
					  clip.start();
					  b23.setBackground(Color.yellow);
				     }
				   catch(Exception ex)
				   { 
					   //JOptionPane.showMessageDialog(null, ex);
				   }
				  
			  }else if(e.getKeyCode() == KeyEvent.VK_B) {
				  
				  try{
					  Clip clip = AudioSystem.getClip();
					  clip.open(AudioSystem.getAudioInputStream(new File("C:\\Users\\"+s+"\\Desktop\\tones\\Korg-N1R-Open-Triangle.wav")));
					  clip.start();
					  b24.setBackground(Color.yellow);
				     }
				   catch(Exception ex)
				   { 
					   //JOptionPane.showMessageDialog(null, ex);
				   }
				  
			  }else if(e.getKeyCode() == KeyEvent.VK_N) {
				  
				  try{
					  Clip clip = AudioSystem.getClip();
					  clip.open(AudioSystem.getAudioInputStream(new File("C:\\Users\\"+s+"\\Desktop\\tones\\E-Mu-Proteus-FX-PizzStr-C4.wav")));
					  clip.start();
					  b25.setBackground(Color.yellow);
				     }
				   catch(Exception ex)
				   { 
					   //JOptionPane.showMessageDialog(null, ex);
				   }
				  
			  }else if(e.getKeyCode() == KeyEvent.VK_M) {
				  
				  try{
					  Clip clip = AudioSystem.getClip();
					  clip.open(AudioSystem.getAudioInputStream(new File("C:\\Users\\"+s+"\\Desktop\\tones\\Korg-01W-RosewoodGt-C3.wav")));
					  clip.start();
					  b26.setBackground(Color.yellow);
				     }
				   catch(Exception ex)
				   { 
					   //JOptionPane.showMessageDialog(null, ex);
				   }
				  
			  }else if(e.getKeyCode() == KeyEvent.VK_1) {
				  
				  try{
					  Clip clip = AudioSystem.getClip();
					  clip.open(AudioSystem.getAudioInputStream(new File("C:\\Users\\"+s+"\\Desktop\\tones\\E-Mu-Proteus-FX-FrHorns2-C4.wav")));
					  clip.start();
					  b27.setBackground(Color.yellow);
				     }
				   catch(Exception ex)
				   { 
					   //JOptionPane.showMessageDialog(null, ex);
				   }
				  
			  }else if(e.getKeyCode() == KeyEvent.VK_2) {
				  
				  try{
					  Clip clip = AudioSystem.getClip();
					  clip.open(AudioSystem.getAudioInputStream(new File("C:\\Users\\"+s+"\\Desktop\\tones\\Steel-Bell-C6.wav")));
					  clip.start();
					  b28.setBackground(Color.yellow);
				     }
				   catch(Exception ex)
				   { 
					   //JOptionPane.showMessageDialog(null, ex);
				   }
				  
			  }else if(e.getKeyCode() == KeyEvent.VK_3) {
				  
				  try{
					  Clip clip = AudioSystem.getClip();
					  clip.open(AudioSystem.getAudioInputStream(new File("C:\\Users\\"+s+"\\Desktop\\tones\\Crash-Cymbal-1.wav")));
					  clip.start();
					  b29.setBackground(Color.yellow);
				     }
				   catch(Exception ex)
				   { 
					   //JOptionPane.showMessageDialog(null, ex);
				   }
				  
			  }else if(e.getKeyCode() == KeyEvent.VK_4) {
				  
				  try{
					  Clip clip = AudioSystem.getClip();
					  clip.open(AudioSystem.getAudioInputStream(new File("C:\\Users\\"+s+"\\Desktop\\tones\\Closed-Hi-Hat-6.wav")));
					  clip.start();
					  b30.setBackground(Color.yellow);
				     }
				   catch(Exception ex)
				   { 
					   //JOptionPane.showMessageDialog(null, ex);
				   }
				
				
				  
			  }else if(e.getKeyCode() == KeyEvent.VK_5) {
				  
				  try{
					  Clip clip = AudioSystem.getClip();
					  clip.open(AudioSystem.getAudioInputStream(new File("C:\\Users\\"+s+"\\Desktop\\tones\\Alesis-Fusion-Violin-C5.wav")));
					  clip.start();
					  b31.setBackground(Color.yellow);
				     }
				   catch(Exception ex)
				   { 
					   //JOptionPane.showMessageDialog(null, ex);
				   }
				  
			  }else if(e.getKeyCode() == KeyEvent.VK_6) {
				  
				  try{
					  Clip clip = AudioSystem.getClip();
					  clip.open(AudioSystem.getAudioInputStream(new File("C:\\Users\\"+s+"\\Desktop\\tones\\E-Mu-Proteus-FX-VibroPad-C3.wav")));
					  clip.start();
					  b32.setBackground(Color.yellow);
				     }
				   catch(Exception ex)
				   { 
					   //JOptionPane.showMessageDialog(null, ex);
				   }
				  
			  }else if(e.getKeyCode() == KeyEvent.VK_7) {
				  
				  try{
					  Clip clip = AudioSystem.getClip();
					  clip.open(AudioSystem.getAudioInputStream(new File("C:\\Users\\"+s+"\\Desktop\\tones\\8-Bit-Noise-1.wav")));
					  clip.start();
					  b33.setBackground(Color.yellow);
				     }
				   catch(Exception ex)
				   { 
					   //JOptionPane.showMessageDialog(null, ex);
				   }
				  
			  }else if(e.getKeyCode() == KeyEvent.VK_8) {
				  
				  try{
					  Clip clip = AudioSystem.getClip();
					  clip.open(AudioSystem.getAudioInputStream(new File("C:\\Users\\"+s+"\\Desktop\\tones\\Casio-CZ-5000-Synth-Glockensp-C4.wav")));
					  clip.start();
					  b34.setBackground(Color.yellow);
				     }
				   catch(Exception ex)
				   { 
					   //JOptionPane.showMessageDialog(null, ex);
				   }
				  
			  }else if(e.getKeyCode() == KeyEvent.VK_9) {
				  
				  try{
					  Clip clip = AudioSystem.getClip();
					  clip.open(AudioSystem.getAudioInputStream(new File("C:\\Users\\"+s+"\\Desktop\\tones\\Ensoniq-SQ-1-ClassicGuitar-C3.wav")));
					  clip.start();
					  b35.setBackground(Color.yellow);
				     }
				   catch(Exception ex)
				   { 
					   //JOptionPane.showMessageDialog(null, ex);
				   }
				  
			  }else if(e.getKeyCode() == KeyEvent.VK_0) {
				  
				  try{
					  Clip clip = AudioSystem.getClip();
					  clip.open(AudioSystem.getAudioInputStream(new File("C:\\Users\\"+s+"\\Desktop\\tones\\Ensoniq-SQ-1-Rock-Snare.wav")));
					  clip.start();
					  b36.setBackground(Color.yellow);
				     }
				   catch(Exception ex)
				   { 
					   //JOptionPane.showMessageDialog(null, ex);
				   }
				  
			  }else if(e.getKeyCode() == KeyEvent.VK_RIGHT) {
				  
				  try{
					  Clip clip = AudioSystem.getClip();
					  clip.open(AudioSystem.getAudioInputStream(new File("C:\\Users\\"+s+"\\Desktop\\tones\\Korg-NS5R-Ride-Cymbal-2.wav")));
					  clip.start();
					  b37.setBackground(Color.yellow);
				     }
				   catch(Exception ex)
				   { 
					   //JOptionPane.showMessageDialog(null, ex);
				   }
				  
			  }else if(e.getKeyCode() == KeyEvent.VK_LEFT) {
				  
				  try{
					  Clip clip = AudioSystem.getClip();
					  clip.open(AudioSystem.getAudioInputStream(new File("C:\\Users\\"+s+"\\Desktop\\tones\\Yamaha-MU90R-Banjo-Man-C4.wav")));
					  clip.start();
					  b38.setBackground(Color.yellow);
				     }
				   catch(Exception ex)
				   { 
					   //JOptionPane.showMessageDialog(null, ex);
				   }
				  
			  }else if(e.getKeyCode() == KeyEvent.VK_UP) {
				  
				  try{
					  Clip clip = AudioSystem.getClip();
					  clip.open(AudioSystem.getAudioInputStream(new File("C:\\Users\\"+s+"\\Desktop\\tones\\E-Mu-Proteus-FX-PizVioln-C5.wav")));
					  clip.start();
					  b39.setBackground(Color.yellow);
				     }
				   catch(Exception ex)
				   { 
					   //JOptionPane.showMessageDialog(null, ex);
				   }
				  
			  }else if(e.getKeyCode() == KeyEvent.VK_DOWN) {
				  
				  try{
					  Clip clip = AudioSystem.getClip();
					  clip.open(AudioSystem.getAudioInputStream(new File("C:\\Users\\"+s+"\\Desktop\\tones\\Ensoniq-ESQ-1-Snare-2.wav")));
					  clip.start();
					  b40.setBackground(Color.yellow);
				     }
				   catch(Exception ex)
				   { 
					   //JOptionPane.showMessageDialog(null, ex);
				   }
				  
			  }else if(e.getKeyCode() == KeyEvent.VK_TAB) {
				  
				  try{
					  Clip clip = AudioSystem.getClip();
					  clip.open(AudioSystem.getAudioInputStream(new File("C:\\Users\\"+s+"\\Desktop\\tones\\E-Mu-Proteus-FX-AcStereo-C3.wav")));
					  clip.start();
					  b41.setBackground(Color.yellow);
				     }
				   catch(Exception ex)
				   { 
					   //JOptionPane.showMessageDialog(null, ex);
				   }
				  
			  }else if(e.getKeyCode() == KeyEvent.VK_SPACE) {
				  
				  try{
					  Clip clip = AudioSystem.getClip();
					  clip.open(AudioSystem.getAudioInputStream(new File("C:\\Users\\"+s+"\\Desktop\\tones\\Ensoniq-SQ-1-Trumpet-C3.wav")));
					  clip.start();
					  b42.setBackground(Color.yellow);
				     }
				   catch(Exception ex)
				   { 
					   //JOptionPane.showMessageDialog(null, ex);
				   }
				  
			  }else if(e.getKeyCode() == KeyEvent.VK_NUMPAD7) {
				  
				  try{
					  Clip clip = AudioSystem.getClip();
					  clip.open(AudioSystem.getAudioInputStream(new File("C:\\Users\\"+s+"\\Desktop\\tones\\Cat-Meow.wav")));
					  clip.start();
					  b43.setBackground(Color.yellow);
				     }
				   catch(Exception ex)
				   { 
					   //JOptionPane.showMessageDialog(null, ex);
				   }
				  
			  }else if(e.getKeyCode() == KeyEvent.VK_NUMPAD8) {
				  
				  try{
					  Clip clip = AudioSystem.getClip();
					  clip.open(AudioSystem.getAudioInputStream(new File("C:\\Users\\"+s+"\\Desktop\\tones\\Kawai-K1r-Acoustic-Bass-C2.wav")));
					  clip.start();
					  b44.setBackground(Color.yellow);
				     }
				   catch(Exception ex)
				   { 
					   //JOptionPane.showMessageDialog(null, ex);
				   }
				  
			  }else if(e.getKeyCode() == KeyEvent.VK_NUMPAD9) {
				  
				  try{
					  Clip clip = AudioSystem.getClip();
					  clip.open(AudioSystem.getAudioInputStream(new File("C:\\Users\\"+s+"\\Desktop\\tones\\High-Timbales.wav")));
					  clip.start();
					  b45.setBackground(Color.yellow);
				     }
				   catch(Exception ex)
				   { 
					   //JOptionPane.showMessageDialog(null, ex);
				   }
				  
			  }else if(e.getKeyCode() == KeyEvent.VK_NUMPAD4) {
				  
				  try{
					  Clip clip = AudioSystem.getClip();
					  clip.open(AudioSystem.getAudioInputStream(new File("C:\\Users\\"+s+"\\Desktop\\tones\\Casio-MT-45-Beguine.wav")));
					  clip.start();
					  b46.setBackground(Color.yellow);
				     }
				   catch(Exception ex)
				   { 
					   //JOptionPane.showMessageDialog(null, ex);
				   }
				  
			  }else if(e.getKeyCode() == KeyEvent.VK_NUMPAD5) {
				  
				  try{
					  Clip clip = AudioSystem.getClip();
					  clip.open(AudioSystem.getAudioInputStream(new File("C:\\Users\\"+s+"\\Desktop\\tones\\Alesis-Sanctuary-QCard-Music-Box-C6.wav")));
					  clip.start();
					  b47.setBackground(Color.yellow);
				     }
				   catch(Exception ex)
				   { 
					   //JOptionPane.showMessageDialog(null, ex);
				   }
				  
			  }else if(e.getKeyCode() == KeyEvent.VK_NUMPAD6) {
				  
				  try{
					  Clip clip = AudioSystem.getClip();
					  clip.open(AudioSystem.getAudioInputStream(new File("C:\\Users\\"+s+"\\Desktop\\tones\\Electronic-Kick-1.wav")));
					  clip.start();
					  b48.setBackground(Color.yellow);
				     }
				   catch(Exception ex)
				   { 
					   //JOptionPane.showMessageDialog(null, ex);
				   }
				  
				  
			  }else if(e.getKeyCode() == KeyEvent.VK_COMMA) {
				  
				  try{
					  Clip clip = AudioSystem.getClip();
					  clip.open(AudioSystem.getAudioInputStream(new File("C:\\Users\\"+s+"\\Desktop\\tones\\Korg-N1R-Crash-Cymbal.wav")));
					  clip.start();
					  b49.setBackground(Color.yellow);
				     }
				   catch(Exception ex)
				   { 
					   //JOptionPane.showMessageDialog(null, ex);
				   }
				  
			  }else if(e.getKeyCode() == KeyEvent.VK_SEMICOLON) {
				  
				  try{
					  Clip clip = AudioSystem.getClip();
					  clip.open(AudioSystem.getAudioInputStream(new File("C:\\Users\\"+s+"\\Desktop\\tones\\Casio-VZ-10M-Space-Lander-C2.wav")));
					  clip.start();
					  b50.setBackground(Color.yellow);
				     }
				   catch(Exception ex)
				   { 
					   //JOptionPane.showMessageDialog(null, ex);
				   }
				  
			  }else if(e.getKeyCode() == KeyEvent.VK_BRACERIGHT) {
				  
				  try{
					  Clip clip = AudioSystem.getClip();
					  clip.open(AudioSystem.getAudioInputStream(new File("C:\\Users\\"+s+"\\Desktop\\tones\\piano.wav")));
					  clip.start();
					  b51.setBackground(Color.yellow);
				     }
				   catch(Exception ex)
				   { 
					   //JOptionPane.showMessageDialog(null, ex);
				   }
				  
			  }else if(e.getKeyCode() == KeyEvent.VK_ENTER) {
				  
				  try{
					  Clip clip = AudioSystem.getClip();
					  clip.open(AudioSystem.getAudioInputStream(new File("C:\\Users\\"+s+"\\Desktop\\tones\\Kawai-K1r-Rap-Kick.wav")));
					  clip.start();
					  b52.setBackground(Color.yellow);
				     }
				   catch(Exception ex)
				   { 
					   //JOptionPane.showMessageDialog(null, ex);
				   }
				  
			  }else if(e.getKeyCode() == KeyEvent.VK_CAPS_LOCK) {
				  
				  try{
					  Clip clip = AudioSystem.getClip();
					  clip.open(AudioSystem.getAudioInputStream(new File("C:\\Users\\"+s+"\\Desktop\\tones\\Claves.wav")));
					  clip.start();
					  b53.setBackground(Color.yellow);
				     }
				   catch(Exception ex)
				   { 
					   //JOptionPane.showMessageDialog(null, ex);
				   }
				  
			  }else if(e.getKeyCode() == KeyEvent.VK_BACK_SPACE) {
				  
				  try{
					  Clip clip = AudioSystem.getClip();
					  clip.open(AudioSystem.getAudioInputStream(new File("C:\\Users\\"+s+"\\Desktop\\tones\\Ensoniq-SQ-1-French-Horn-C4.wav")));
					  clip.start();
					  b54.setBackground(Color.yellow);
				     }
				   catch(Exception ex)
				   { 
					   //JOptionPane.showMessageDialog(null, ex);
				   }
				  
			  }else if(e.getKeyCode() == KeyEvent.VK_SHIFT) {
				  
				  try{
					  Clip clip = AudioSystem.getClip();
					  clip.open(AudioSystem.getAudioInputStream(new File("C:\\Users\\"+s+"\\Desktop\\tones\\Cuica-2.wav")));
					  clip.start();
					  b55.setBackground(Color.yellow);
				     }
				   catch(Exception ex)
				   { 
					   //JOptionPane.showMessageDialog(null, ex);
				   }
				  
			  }else if(e.getKeyCode() == KeyEvent.VK_NUMPAD1) {
				  
				  try{
					  Clip clip = AudioSystem.getClip();
					  clip.open(AudioSystem.getAudioInputStream(new File("C:\\Users\\"+s+"\\Desktop\\tones\\Alesis-S4-Plus-ArcoViolas-C5.wav")));
					  clip.start();
					  b56.setBackground(Color.yellow);
				     }
				   catch(Exception ex)
				   { 
					   //JOptionPane.showMessageDialog(null, ex);
				   }
				  
			  }else if(e.getKeyCode() == KeyEvent.VK_NUMPAD2) {
				  
				  try{
					  Clip clip = AudioSystem.getClip();
					  clip.open(AudioSystem.getAudioInputStream(new File("C:\\Users\\"+s+"\\Desktop\\tones\\Dog-Bark.wav")));
					  clip.start();
					  b57.setBackground(Color.yellow);
				     }
				   catch(Exception ex)
				   { 
					   //JOptionPane.showMessageDialog(null, ex);
				   }
				  
			  }else if(e.getKeyCode() == KeyEvent.VK_NUMPAD3) {
				  
				  try{
					  Clip clip = AudioSystem.getClip();
					  clip.open(AudioSystem.getAudioInputStream(new File("C:\\Users\\"+s+"\\Desktop\\tones\\Deep-Kick.wav")));
					  clip.start();
					  b58.setBackground(Color.yellow);
				     }
				   catch(Exception ex)
				   { 
					   //JOptionPane.showMessageDialog(null, ex);
				   }
				  
			  }else if(e.getKeyCode() == KeyEvent.VK_CLOSE_BRACKET) {
				  
				  try{
					  Clip clip = AudioSystem.getClip();
					  clip.open(AudioSystem.getAudioInputStream(new File("C:\\Users\\"+s+"\\Desktop\\tones\\Kick-Drum-14.wav")));
					  clip.start();
					  b59.setBackground(Color.yellow);
				     }
				   catch(Exception ex)
				   { 
					   //JOptionPane.showMessageDialog(null, ex);
				   }
				  
			  }else if(e.getKeyCode() == KeyEvent.VK_TAB) {
				  
				  try{
					  Clip clip = AudioSystem.getClip();
					  clip.open(AudioSystem.getAudioInputStream(new File("C:\\Users\\"+s+"\\Desktop\\tones\\E-Mu-Proteus-2-Flute-C5.wav")));
					  clip.start();
					  b60.setBackground(Color.yellow);
				     }
				   catch(Exception ex)
				   { 
					   //JOptionPane.showMessageDialog(null, ex);
				   }
				  
			  }	
			
		}
 //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		@Override
		public void keyReleased(KeyEvent e) {
			
			if(e.getKeyCode() == KeyEvent.VK_Q) {
				b1.setBackground(Color.DARK_GRAY);
			}else if(e.getKeyCode() == KeyEvent.VK_W) {
				b2.setBackground(Color.DARK_GRAY);
			  }else if(e.getKeyCode() == KeyEvent.VK_E) {
				  b3.setBackground(Color.DARK_GRAY);
			  }else if(e.getKeyCode() == KeyEvent.VK_R) {
				  b4.setBackground(Color.DARK_GRAY);
			  }else if(e.getKeyCode() == KeyEvent.VK_T) {
				  b5.setBackground(Color.DARK_GRAY);
			  }else if(e.getKeyCode() == KeyEvent.VK_Y) {
				  b6.setBackground(Color.DARK_GRAY);
			  }else if(e.getKeyCode() == KeyEvent.VK_U) {
				  b7.setBackground(Color.DARK_GRAY);
			  }else if(e.getKeyCode() == KeyEvent.VK_I) {
				  b8.setBackground(Color.DARK_GRAY);
			  }else if(e.getKeyCode() == KeyEvent.VK_O) {
				  b9.setBackground(Color.DARK_GRAY);
			  }else if(e.getKeyCode() == KeyEvent.VK_P) {
				  b10.setBackground(Color.DARK_GRAY);
			  }else if(e.getKeyCode() == KeyEvent.VK_A) {
				  b11.setBackground(Color.DARK_GRAY);
			  }else if(e.getKeyCode() == KeyEvent.VK_S) {
				  b12.setBackground(Color.DARK_GRAY);
			  }else if(e.getKeyCode() == KeyEvent.VK_D) {
				  b13.setBackground(Color.DARK_GRAY);
			  }else if(e.getKeyCode() == KeyEvent.VK_F) {
				  b14.setBackground(Color.DARK_GRAY);
			  }else if(e.getKeyCode() == KeyEvent.VK_G) {
				  b15.setBackground(Color.DARK_GRAY);
			  }else if(e.getKeyCode() == KeyEvent.VK_H) {
				  b16.setBackground(Color.DARK_GRAY);
			  }else if(e.getKeyCode() == KeyEvent.VK_J) {
				  b17.setBackground(Color.DARK_GRAY);
			  }else if(e.getKeyCode() == KeyEvent.VK_K) {
				  b18.setBackground(Color.DARK_GRAY);
			  }else if(e.getKeyCode() == KeyEvent.VK_L) {
				  b19.setBackground(Color.DARK_GRAY);
			  }else if(e.getKeyCode() == KeyEvent.VK_Z) {
				  b20.setBackground(Color.DARK_GRAY);
			  }else if(e.getKeyCode() == KeyEvent.VK_X) {
				  b21.setBackground(Color.DARK_GRAY);
			  }else if(e.getKeyCode() == KeyEvent.VK_C) {
				  b22.setBackground(Color.DARK_GRAY);
			  }else if(e.getKeyCode() == KeyEvent.VK_V) {
				  b23.setBackground(Color.DARK_GRAY);
			  }else if(e.getKeyCode() == KeyEvent.VK_B) {
				  b24.setBackground(Color.DARK_GRAY);
			  }else if(e.getKeyCode() == KeyEvent.VK_N) {
				  b25.setBackground(Color.DARK_GRAY);
				  
			  }else if(e.getKeyCode() == KeyEvent.VK_M) {
				  b26.setBackground(Color.DARK_GRAY);
				  
			  }else if(e.getKeyCode() == KeyEvent.VK_1) {
				  b27.setBackground(Color.DARK_GRAY);
			  }else if(e.getKeyCode() == KeyEvent.VK_2) {
				  b28.setBackground(Color.DARK_GRAY);
			  }else if(e.getKeyCode() == KeyEvent.VK_3) {
				  b29.setBackground(Color.DARK_GRAY);
			  }else if(e.getKeyCode() == KeyEvent.VK_4) {
				  b30.setBackground(Color.DARK_GRAY);
			  }else if(e.getKeyCode() == KeyEvent.VK_5) {
				  b31.setBackground(Color.DARK_GRAY);
			  }else if(e.getKeyCode() == KeyEvent.VK_6) {
				  b32.setBackground(Color.DARK_GRAY);
			  }else if(e.getKeyCode() == KeyEvent.VK_7) {
				  b33.setBackground(Color.DARK_GRAY);
			  }else if(e.getKeyCode() == KeyEvent.VK_8) {
				  b34.setBackground(Color.DARK_GRAY);
			  }else if(e.getKeyCode() == KeyEvent.VK_9) {
				  b35.setBackground(Color.DARK_GRAY);
			  }else if(e.getKeyCode() == KeyEvent.VK_0) {
				  b36.setBackground(Color.DARK_GRAY);
			  }else if(e.getKeyCode() == KeyEvent.VK_RIGHT) {
				  b37.setBackground(Color.DARK_GRAY);
			  }else if(e.getKeyCode() == KeyEvent.VK_LEFT) {
				  b38.setBackground(Color.DARK_GRAY);
			  }else if(e.getKeyCode() == KeyEvent.VK_UP) {
				  b39.setBackground(Color.DARK_GRAY);
			  }else if(e.getKeyCode() == KeyEvent.VK_DOWN) {
				  b40.setBackground(Color.DARK_GRAY);
			  }else if(e.getKeyCode() == KeyEvent.VK_TAB) {
				  b41.setBackground(Color.DARK_GRAY);
			  }else if(e.getKeyCode() == KeyEvent.VK_SPACE) {
				  b42.setBackground(Color.DARK_GRAY);
			  }else if(e.getKeyCode() == KeyEvent.VK_NUMPAD7) {
				  b43.setBackground(Color.DARK_GRAY);
			  }else if(e.getKeyCode() == KeyEvent.VK_NUMPAD8) {
				  b44.setBackground(Color.DARK_GRAY);
			  }else if(e.getKeyCode() == KeyEvent.VK_NUMPAD9) {
				  b45.setBackground(Color.DARK_GRAY);
			  }else if(e.getKeyCode() == KeyEvent.VK_NUMPAD4) {
				  b46.setBackground(Color.DARK_GRAY);
			  }else if(e.getKeyCode() == KeyEvent.VK_NUMPAD5) {
				  b47.setBackground(Color.DARK_GRAY);
			  }else if(e.getKeyCode() == KeyEvent.VK_NUMPAD6) {
				  b48.setBackground(Color.DARK_GRAY);
				  
			  }else if(e.getKeyCode() == KeyEvent.VK_COMMA) {
				  b49.setBackground(Color.DARK_GRAY);
			  }else if(e.getKeyCode() == KeyEvent.VK_SEMICOLON) {
				  b50.setBackground(Color.DARK_GRAY);
			  }else if(e.getKeyCode() == KeyEvent.VK_BRACERIGHT) {
				  b51.setBackground(Color.DARK_GRAY);
			  }else if(e.getKeyCode() == KeyEvent.VK_ENTER) {
				  b52.setBackground(Color.DARK_GRAY);
			  }else if(e.getKeyCode() == KeyEvent.VK_CAPS_LOCK) {
				  b53.setBackground(Color.DARK_GRAY);
			  }else if(e.getKeyCode() == KeyEvent.VK_BACK_SPACE) {
				  b54.setBackground(Color.DARK_GRAY);
			  }else if(e.getKeyCode() == KeyEvent.VK_SHIFT) {
				  b55.setBackground(Color.DARK_GRAY);
			  }else if(e.getKeyCode() == KeyEvent.VK_NUMPAD1) {
				  b56.setBackground(Color.DARK_GRAY);
			  }else if(e.getKeyCode() == KeyEvent.VK_NUMPAD2) {
				  b57.setBackground(Color.DARK_GRAY);
			  }else if(e.getKeyCode() == KeyEvent.VK_NUMPAD3) {
				  b58.setBackground(Color.DARK_GRAY);
			  }else if(e.getKeyCode() == KeyEvent.VK_CLOSE_BRACKET) {
				  b59.setBackground(Color.DARK_GRAY);
			  }else if(e.getKeyCode() == KeyEvent.VK_TAB) {
				  b60.setBackground(Color.DARK_GRAY);
			  }
			
			
		}
	
    }


@Override
public void keyTyped(KeyEvent e) {
	// TODO Auto-generated method stub
	
}


@Override
public void keyPressed(KeyEvent e) {
	// TODO Auto-generated method stub
	
}


@Override
public void keyReleased(KeyEvent e) {
	// TODO Auto-generated method stub
	
}
   	
}



