package HW6;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

public class ListaLegume {

	public static void main(String[] args) {
		try {
			OutputStream output  = new FileOutputStream("legume.properties");

			//setam valorile din properties
			Properties prop = new Properties();
            prop.setProperty("morcovi", String.valueOf(58));
			prop.setProperty("rosii", String.valueOf(70));
			prop.setProperty("castraveti", String.valueOf(27));
			
			//salvam props de mai sus
			prop.store(output, "am salvat legume.properties");
			
			System.out.println(prop);

		} catch (IOException ex) {
            ex.printStackTrace();
        }
			
			
	
	try (InputStream input = new FileInputStream("legume.properties")) {

	            Properties prop = new Properties();
			
			
	  //incarcam fisierul de tip properties
        prop.load(input);
        
      // citim valoarea si o printam
        System.out.println(prop.getProperty("morcovi"));
        System.out.println(prop.getProperty("rosii"));
        System.out.println(prop.getProperty("castraveti"));
		
	 } catch (IOException ex) {
         ex.printStackTrace();
     }
	
	Map<Integer, String> mapa = new HashMap<>();
	
	mapa.put(27, "castraveti");
	mapa.put(58, "morcovi");
	mapa.put(70, "rosii");
	
	boolean verCalorii = mapa.containsKey(58);
	System.out.println(verCalorii);
	
	calorie.morcov=
			
			//variabila globala calorii
			//if-else ultima metoda
	
	} 
			
}


