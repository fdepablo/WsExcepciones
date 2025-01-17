package ficheros;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class EscrituraFichero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file = new File("nombre.txt");
		System.out.println("Empezando el programa");
		FileWriter fw = null;
		PrintWriter pw = null;
		
		try {
			//Este objeto es el tubo que va a ir desde la JVM hasta el fichero
			fw = new FileWriter(file);
			//Es el objeto que va a usar el tubo anterior (FileWriter) para 
			//escribir la información
			pw = new PrintWriter(fw);
			pw.println("Ana");
			pw.println("Tomas");
			pw.println("Juan");
			pw.print("Juan ");
			pw.print("Antonio");
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			//Este bloque se va a ejecutar siempre! no importa
			//que haya ocurrido una excecion o no
			if(fw != null && pw != null){
				pw.close();
				try {
					fw.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}

	}

}
