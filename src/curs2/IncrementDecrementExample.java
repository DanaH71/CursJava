package curs2;

public class IncrementDecrementExample {

	public static void main(String[] args) {
		
		// increment

		
		int numar = 10;
		//numar++ -> numar=numar+1
		
			
		//System.out.println( ++numar); // pre increment  - mai intai se modifica valoarea, apoi se executa orice statement
		//System.out.println( numar++); //post decrement - mai intai se executa orice statement, apoi se modifica valoarea
		
		
		//decrement
		
		//--variabila - mai intai se modifica valoarea, apoi se executa orice statement
		System.out.println( --numar); //pre decrement   - mai intai se modifica valoarea, apoi se executa orice statement
		System.out.println(numar--); //post decrement - mai intai se executa orice statement, apoi se modifica valoarea
	}

}
