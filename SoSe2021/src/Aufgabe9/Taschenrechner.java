package Aufgabe9;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.*;
import javax.swing.*;

public class Taschenrechner extends JFrame implements ActionListener {
	private	JButton eins, zwei, drei,vier,fünf, sechs,
	sieben, acht, neun, Null, KlammerAuf, KlammerZu, 
	mal, plus, minus, geteilt, punkt, istgleich;
	private	JTextField textfield;
	private	ArrayList<JButton> labels = new ArrayList<JButton>();
	private	ArrayList<JTextField> label = new ArrayList<JTextField>();
	private double first;
	private double second;
	private double result;
	private String answer;
	private double operation;

	
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
        this.textfield = new JTextField(15);
        oben.add(textfield);
//    	oben.add(new JTextField(15)); 
    	mainPanel.add(oben);

    	JPanel unten= new JPanel();
    	unten.setLayout(new GridLayout(6,3,20,20));
    	
        this.eins=new JButton("1");
        unten.add(eins);
        this.eins.addActionListener(this);

        this.zwei=new JButton("2");
        unten.add(zwei);
        this.zwei.addActionListener(this);
        
        this.drei=new JButton("3");
        unten.add(drei);
        this.drei.addActionListener(this);
        
        this.vier=new JButton("4");
        unten.add(vier);
        this.vier.addActionListener(this);
        
        this.fünf=new JButton("5");
        unten.add(fünf);
        this.fünf.addActionListener(this);
        
        this.sechs=new JButton("6");
        unten.add(sechs);
        this.sechs.addActionListener(this);
        
        this.sieben=new JButton("7");
        unten.add(sieben);
        this.sieben.addActionListener(this);
    	
        this.acht=new JButton("8");
        unten.add(acht);
        this.acht.addActionListener(this);
        
        this.neun=new JButton("9");
        unten.add(neun);
        this.neun.addActionListener(this);
        
        this.KlammerAuf=new JButton("(");
        unten.add(KlammerAuf);
        this.KlammerAuf.addActionListener(this);
        
        this.Null=new JButton("0");
        unten.add(Null);
        this.Null.addActionListener(this);
        
        this.KlammerZu=new JButton(")");
        unten.add(KlammerZu);
        this.KlammerZu.addActionListener(this);
        
        this.mal=new JButton("*");
        unten.add(mal);
        this.mal.addActionListener(this);
        
        this.plus=new JButton("+");
        unten.add(plus);
        this.plus.addActionListener(this);
        
        this.minus=new JButton("-");
        unten.add(minus);
        this.minus.addActionListener(this);
        
        this.geteilt=new JButton("/");
        unten.add(geteilt);
        this.geteilt.addActionListener(this);
        
        this.punkt=new JButton(".");
        unten.add(punkt);
        this.punkt.addActionListener(this);
        
        this.istgleich=new JButton("=");
        unten.add(istgleich);
        this.istgleich.addActionListener(this);
            	
    	
    	mainPanel.add(unten);
    	
    	
    	return mainPanel;
    }
    
	public static void main(String[] args) {

		 new Taschenrechner();
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		 
		Object quelle = e.getSource(); 
	        if(quelle instanceof JButton )
	        {
	            if(e.getSource()==this.eins)
	            {
	         
	            	String number= this.textfield.getText()+this.eins.getText();
	            	this.textfield.setText(number);
	                
	            }
	            else if(e.getSource()==this.zwei)
	            {
	            	String number= this.textfield.getText()+this.zwei.getText();
	            	this.textfield.setText(number);

	            }
	            else if(e.getSource()==this.drei)
	            {
	            	String number= this.textfield.getText()+this.drei.getText();
	            	this.textfield.setText(number);

	            }
	            else if(e.getSource()==this.vier)
	            {
	            	String number= this.textfield.getText()+this.vier.getText();
	            	this.textfield.setText(number);

	            }
	            else if(e.getSource()==this.fünf)
	            {
	            	String number= this.textfield.getText()+this.fünf.getText();
	            	this.textfield.setText(number);

	            }
	            else if(e.getSource()==this.sechs)
	            {
	            	String number= this.textfield.getText()+this.sechs.getText();
	            	this.textfield.setText(number);

	            }
	            else if(e.getSource()==this.sieben)
	            {
	            	String number= this.textfield.getText()+this.sieben.getText();
	            	this.textfield.setText(number);

	            }
	            else if(e.getSource()==this.acht)
	            {
	            	String number= this.textfield.getText()+this.acht.getText();
	            	this.textfield.setText(number);

	            }
	            else if(e.getSource()==this.neun)
	            {
	            	String number= this.textfield.getText()+this.neun.getText();
	            	this.textfield.setText(number);

	            }
	            else if(e.getSource()==this.Null)
	            {
	            	String number= this.textfield.getText()+this.Null.getText();
	            	this.textfield.setText(number);

	            }
	            else if(e.getSource()==this.KlammerAuf)
	            {
	            	String number= this.textfield.getText()+this.KlammerAuf.getText();
	            	this.textfield.setText(number);

	            }
	            else if(e.getSource()==this.KlammerZu)
	            {
	            	String number= this.textfield.getText()+this.KlammerZu.getText();
	            	this.textfield.setText(number);

	            }
	            else if(e.getSource()==this.mal)
	            {
	            	String number= this.textfield.getText()+this.mal.getText();
	            	this.textfield.setText(number);

	            }
	            else if(e.getSource()==this.plus)
	            {
	            	String number= this.textfield.getText()+this.plus.getText();
	            	this.textfield.setText(number);

	            }
	            else if(e.getSource()==this.minus)
	            {
	            	String number= this.textfield.getText()+this.minus.getText();
	            	this.textfield.setText(number);

	            }
	            else if(e.getSource()==this.geteilt)
	            {
	            	String number= this.textfield.getText()+this.geteilt.getText();
	            	this.textfield.setText(number);

	            }
	            else if(e.getSource()==this.istgleich)
	            {
	            	String number= this.textfield.getText()+this.istgleich.getText();
	            	this.textfield.setText(number);

	            }
	            else if(e.getSource()==this.KlammerZu)
	            {
	            	String number= this.textfield.getText()+this.KlammerZu.getText();
	            	this.textfield.setText(number);

	            }
	            else if(e.getSource()==this.KlammerZu)
	            {
	            	String number= this.textfield.getText()+this.KlammerZu.getText();
	            	this.textfield.setText(number);

	            }
	            else if(e.getSource()==this.punkt)
	            {
	            	String number= this.textfield.getText()+this.punkt.getText();
	            	this.textfield.setText(number);

	            }
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	        }
		
		
		
	
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	}

}
