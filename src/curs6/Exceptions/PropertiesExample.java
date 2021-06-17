package curs6.Exceptions;

	import java.io.FileNotFoundException;
	import java.io.FileOutputStream;
	import java.io.IOException;
	import java.io.OutputStream;
	import java.util.Properties;

	public class PropertiesExample {

		public static void main(String[] args) throws IOException {

			try {
				OutputStream output  = new FileOutputStream("fisier.properties");
				
				//setam valorile din properties
				Properties prop = new Properties();
				prop.setProperty("user", "Dragos");
				prop.setProperty("email", "Dragos@dragos.com");
				prop.setProperty("password", "1234");
				
				//salvam props de mai sus
				prop.store(output, "am salvat fisier.properties");
				
				System.out.println(prop);
			
			
			} catch (FileNotFoundException e) {

				
				e.printStackTrace();
			}
			
			
		}

	}