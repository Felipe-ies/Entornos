import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * String nombreFichero = "Prueba.txt";
		 * 
		 * //Crea objeto clase File a partir de la ruta File rutaFichero = new
		 * File("C:\\Users\\dam\\FC\\" + nombreFichero);
		 * 
		 * //Comprueba si el ficher existe System.out.println(rutaFichero.exists());
		 * 
		 * //Imprime el path completo System.out.println(rutaFichero.getAbsolutePath());
		 * 
		 * //Elimina el fichero rutaFichero.delete();
		 */

		// Pasos de lectura de ficheros

		// 1. Establecer la ruta
		String nombreFichero = "Prueba.txt";
		String ruta = "C:\\Users\\dam\\FC\\";

		File fichero = new File(ruta + nombreFichero);

		// 2.Comprobar errores de acceso a ficher (permisos, no existe, etc)
		try {
			// Operar con nuestro fichero (leer/escribir)
			FileReader fr = new FileReader(fichero);
			BufferedReader br = new BufferedReader(fr);
			System.out.println(br.readLine());

			String linea;
			String cadena = "";
			while ((linea = br.readLine()) != null) {
				System.out.println("Leyendo linea: " + linea);
				cadena += linea + "\n";
			}

			System.out.println("Fichero completo");
			System.out.println(cadena);

			// 4. Cerrar el fichero tras operar con él
			br.close();
			fr.close();

		} catch (Exception e) {
			System.out.println("Error:" + e.toString());
		}
	}

}
