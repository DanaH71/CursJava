package curs1.variabile;

public class ExempleVariabile {
	String prenume ="Bravo";
	static String greetings="Numele meu este "; //variabila de clasa

	public static void main(String[] args) {
		
		ExempleVariabile obj = new ExempleVariabile();
		System.out.println(ExempleVariabile.greetings + obj.printeazaNume("Ana ") + obj.prenume);
	}
		// TODO Auto-generated method stub

public String printeazaNume(String nume) {		
//String nume = "Ana "; //variabila locala
return nume;
	}

}
