package p1;

import javax.swing.JOptionPane;

public class B {
public static int siegPunkte;
private static Spieler[] spieler;

Spiel(){
	anzSpieler();

}

	public void siegPunkte() {
	int anzSpieler=0;
	 boolean inputOk=false;
	 while(!inputOk) {
		 try {
			 String input= JOptionPane.showInputDialog("Anzahl der Spieler");
			inputOk=true;
			 anzSpieler=Integer.parseInt(input);
		 }
		 catch(NumberFormatException e) {
			 JOptionPane.showMessageDialog(null, "Die Eingabe muss eine Zahl sein");
			 inputOk=false;
		 }
	 }
	 spieler= new Spieler[anzSpieler];	 
 }

	public void siegPunkte() {
	int anzSpieler=0;
	 boolean inputOk=false;
	 while(!inputOk) {
		 try {
			 String input= JOptionPane.showInputDialog("Punkte des Siegers:");
			inputOk=true;
			 anzSpieler=Integer.parseInt(input);
		 }
		 catch(NumberFormatException e) {
			 JOptionPane.showMessageDialog(null, "Die Eingabe muss eine Zahl sein");
			 inputOk=false;
		 }
	 }
 }

public void nameDerSpieler() {
	String name="";
	for (int index = 0; index < spieler.length; index++) {
		name=JOptionPane.showInputDialog("Name des Siegers "+ (index+1)+" :")
		spieler[index]=new Spieler(name);
	}
}







 
 
 




}
