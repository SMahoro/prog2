package videos2;

import javax.swing.JOptionPane;

public class Ausnahmen {
	
	private static int division(int nr1, int nr2) {
		
		return nr1/nr2;
	}
	
public static int getValueAtIndex(int[]arr,int index ) {
	return arr[index];
}
	

public static char charAt(String s,int index ) {
	return s.charAt(index);
}


	public static void main(String[] args) {

int nr1=4;
int nr2=0;

//System.out.printf("%2d/%2d =%2d %n", nr1, nr2, division(nr1, nr2));


try {
int result= division(nr1,nr2);
System.out.printf("%2d/%2d =%2d %n", nr1, nr2, result); //bekommt Error wenn einfach so steht
}
catch (ArithmeticException e) {
	System.out.println("Division durch 0 nicht definiert");
//	e.printStackTrace();//Objekt Methode
}
		
		
	int[]arr= {1,2,3,4};
	try {	
	int value= getValueAtIndex(arr, 4);
	System.out.println(value);
	}
	catch(ArrayIndexOutOfBoundsException e) {
		System.out.println("Kein Index des Arrays");
	}
		
		
	String s= "hallo!";
	try {
	char c= charAt(s,6);
	System.out.println(c);
	}	
	catch(StringIndexOutOfBoundsException e) {
		System.out.println("Kein Index des Strings");
	}	
		
	
	
	boolean eingabeOk=false;
	int zahl=0;
	while(!eingabeOk) {
	String eingabe= JOptionPane.showInputDialog("Geben Sie ine Zahl ein: ");
	try {
	 zahl = Integer.valueOf(eingabe);
	 eingabeOk=true;
}
	catch(NumberFormatException e) {
		System.out.println("Eingabe war keine Zahl!");
	}
	}
	System.out.println(zahl);
	
	
	
	
	
	
	}

}
