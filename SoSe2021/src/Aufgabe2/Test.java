package Aufgabe2;

public class Test {

	public static void main(String[] args) {

		MyInteger mi;
		try {
			mi = new MyInteger("-00004404798");
			System.out.println("mi: " +mi.intValue());
			System.out.println(mi.toString());
			
		}
		catch(IllegalArgumentException e)
		{
			System.out.println("mi: " +e.getMessage());
		}
	}
}
