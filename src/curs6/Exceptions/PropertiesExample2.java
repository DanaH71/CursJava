package curs6.Exceptions;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertiesExample2 {

	public static void main(String[] args) {

		try (InputStream input = new FileInputStream("fisier.properties")) {

            Properties prop = new Properties();

            //incarcam fisierul de tip properties
            prop.load(input);
            
            String user = prop.getProperty("user");
            // citim valoarea si o printam
            System.out.println(user);
            System.out.println(prop.getProperty("email"));
            System.out.println(prop.getProperty("password"));

        } catch (IOException ex) {
            ex.printStackTrace();
        }
		
	}

}
