package Aufgabe2;

public class MyInteger {
	public static final int MAX_VALUE = 2147483647;
	public static final int MIN_VALUE = -2147483648;
	
	private int value;
	
	public MyInteger(int value)
	{
		this.value=value;
	}
	
	public MyInteger(String s) throws IllegalArgumentException
	{
		this.value = parseInt(s);
	}
	
	private static boolean charIsDigit(char c)
	{
		return (c >= '0' && c <= '9');
	}
	
	
	private static int charToInt(char c)
	{
		int charAsciiValue = c;
		int intvalue = charAsciiValue-48;
		return intvalue;
	}
	
	private static boolean inputIsNumber(String s)
	{
		for(int i=0; i<s.length(); i++)
		{
			if(!charIsDigit(s.charAt(i))) {
				return false;
			} 
		}
		return true;
	}
	
	static String removeLeadingZeros(String s) {

		  
		  while(s.charAt(0)=='0')
			{
				s = s.substring(1);
			}
		  return s;
	}
	
	public static int parseInt(String s) throws IllegalArgumentException
	{
		if(s.length()==0) throw new IllegalArgumentException("leere Eingabe");

		boolean negativ = false;
		if(s.charAt(0)=='+')
		{
			s = s.substring(1);
		}
		else if(s.charAt(0)=='-')
		{
			s = s.substring(1);
			negativ = true;
		}
		if(s.length()==0) throw new IllegalArgumentException("Eingabe ist nur '+' bzw. '-' --> keine Zahl");
		s=removeLeadingZeros(s);
		
		if(!inputIsNumber(s)) throw new IllegalArgumentException("Eingabe war keine Zahl!");
	
		int exponent = 1;
		int zahl = 0;
		
		for(int i = s.length()-1; i>=0; i--)
		{
			zahl = zahl + charToInt(s.charAt(i))*exponent;
			exponent*=10;
		}
		if(negativ) return -zahl;
		else return zahl;
	}
	
	
	public int intValue()
	{
		return this.value;
	}
	
	public double doubleValue()
	{
		return this.value;
	}
	
	public static MyInteger valueOf(String s) throws IllegalArgumentException
	{
		return new MyInteger(s);
	}
	
	public static MyInteger valueOf(int value)
	{
		return new MyInteger(value);
	}
	
	@Override
	public boolean equals(Object other)
	{
		if(other == null) return false;
		if(this == other) return true; 
		if(this.getClass() != other.getClass())	return false; 	

		MyInteger otherInt = (MyInteger)other; 	
		return (this.value == otherInt.value); 
	}
	
	@Override
	public int hashCode()
	{
		return this.value;
	}
	
	@Override
	public String toString() {
		return "MyInteger [value=" + value + "]";
	}
}
