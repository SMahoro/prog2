package Aufgabe8;

import java.awt.Color;
import java.awt.*;

import javax.swing.*;

public class Taschenrechner extends JFrame {
	
	
	public Taschenrechner() {
		super();
		this.setTitle("Taschenrechner");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel content = this.initContent();
        this.getContentPane().add(content);
        
        this.setSize(250, 350); // breite +länge
        this.setLocation(200, 100);
        this.setVisible(true);
	}
	
	
	
	
    private JPanel initContent() {
    	
    	JPanel mainPanel = new JPanel();
    	
    	JPanel oben = new JPanel();
    	oben.add(new JTextField(15)); 
    	mainPanel.add(oben);
    	
    	JPanel unten= new JPanel();
    	unten.setLayout(new GridLayout(6,3,20,20));
        unten.add(new JButton("1"));
        unten.add(new JButton("2"));
        unten.add(new JButton("3"));
        unten.add(new JButton("4"));
        unten.add(new JButton("5"));
        unten.add(new JButton("6"));
        unten.add(new JButton("7"));
        unten.add(new JButton("8"));
        unten.add(new JButton("9"));
        unten.add(new JButton("("));
        unten.add(new JButton("0"));
        unten.add(new JButton(")"));
        unten.add(new JButton("*"));
        unten.add(new JButton("/"));
        unten.add(new JButton("+"));
        unten.add(new JButton("-"));
        unten.add(new JButton("."));
        unten.add(new JButton("="));

    	
    	
    	mainPanel.add(unten);
    	
    	
    	return mainPanel;
    }
    
   
	
	
	
	
	
	
	

	public static void main(String[] args) {

		 new Taschenrechner();
	}

}
